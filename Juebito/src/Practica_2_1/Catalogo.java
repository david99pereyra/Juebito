package Practica_2_1;

import java.util.Date;
import java.util.HashMap;

public class Catalogo {
    private final HashMap<Integer, ContenidoAudioVisual> cat;
    private int indice=0;
    public Catalogo(){
        cat = new HashMap<>();
    }

    public void addContenido(ContenidoAudioVisual y){
        indice++;
        cat.put(indice,y);
        System.out.println("Agregado exitosamente");
    }

    public void showContenido(){
        for(int i=1;i< cat.size();i++){
            System.out.println(cat.get(i));
        }
    }

    public void deleteContenido(int index){
        cat.remove(index);
    }

    public HashMap<Integer, ContenidoAudioVisual> buscarContenido(Date fec_1, Date fec_2){
        for(Integer i=1;i< cat.size();i++){
            if(fec_1.after(cat.get(i).getFechaEstreno()) && fec_2.before(cat.get(i).getFechaEstreno()));
        }
        
    }
}
