package Practica_2_1;

import java.util.Hashtable;
import java.util.GregorianCalendar;

public class Catalogo {
    private final Hashtable<Integer, ContenidoAudioVisual> cat;
    private int indice=0;
    public Catalogo(){
        cat = new Hashtable<>();
    }

    public void addContenido(ContenidoAudioVisual y){
        indice++;
        cat.put(indice, y);
        System.out.println("Agregado exitosamente");
    }

    public void showContenido(){
        for(int i=1;i<cat.size();i++){
            System.out.println(cat.get(i).getTitulo());
        }
    }

    public void deleteContenido(int index){
        cat.remove(index);
    }

//    public Hashtable<Integer, ContenidoAudioVisual> buscarContenido(Date fec_1, Date fec_2){
//
//    }
}
