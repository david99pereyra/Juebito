package Practica_2_1.Ejercicio_2_1_1;
import java.util.Vector;

public class Favoritos {
    private final Vector<ContenidoAudioVisual> vec;


    public Favoritos(){
        vec = new Vector<>();
    }
    public void agregarFaborito(ContenidoAudioVisual cont){
        vec.add(cont);
    }
    public void eliminarFavorito(String info){
        for(int i=0;i<vec.size();i++){
            if(info.matches(vec.get(i).getTitulo())){
                vec.remove(i);
                System.out.println("Borrado exitoso");
            }
        }
    }
    public void listarFavorito(){
        for (ContenidoAudioVisual contenidoAudioVisual : vec) {
            System.out.println(contenidoAudioVisual);
          /* System.out.println(contenidoAudioVisual.getTitulo());
            System.out.println(contenidoAudioVisual.getAutor());
            System.out.println(contenidoAudioVisual.getDirector());
            System.out.println(contenidoAudioVisual.getGenero());
            System.out.println(contenidoAudioVisual.getSubtitulos());
            System.out.println(contenidoAudioVisual.getFechaEstreno());
            System.out.println(contenidoAudioVisual.getDuracion());
            System.out.println(contenidoAudioVisual.getIdiomaOriginal());
            for(int i=0;i<contenidoAudioVisual.getActores().size();i++){
                System.out.println(contenidoAudioVisual.getActores().get(i));
            }
            for(int i=0;i<contenidoAudioVisual.getInterpretes().size();i++){
                System.out.println(contenidoAudioVisual.getInterpretes().get(i));
            }*/

        }
    }
}