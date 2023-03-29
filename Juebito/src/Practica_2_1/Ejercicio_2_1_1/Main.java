package Practica_2_1.Ejercicio_2_1_1;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eleccion;
        Favoritos fav = new Favoritos();
        do {
            System.out.println("Bienvenido Usuario, a su lista de favoritos");
            System.out.println("Que desea hacer? 1) Agregar a Favoritos; 2) Remover de Favoritos; 3) Listar Favoritos; 4) Salir");
            eleccion = input.nextInt();

            switch (eleccion) {
                case 1:{
                    input.nextLine();
                    ContenidoAudioVisual t = new ContenidoAudioVisual();
                    String tit;
                    String aut;
                    int dur;
                    String dir;
                    String fecEst;
                    String idi;
                    String cc;
                    String gen;
                    System.out.println("Titulo");
                    tit = input.nextLine();
                    t.setTitulo(tit);
                    System.out.println("Autor");
                    aut = input.nextLine();
                    t.setAutor(aut);
                    System.out.println("Director");
                    dir = input.nextLine();
                    t.setDirector(dir);
                    System.out.println("Duracion");
                    dur = input.nextInt();
                    t.setDuracion();
                    System.out.println("Fecha de Estreno");
                    fecEst = input.nextLine();
                    t.setFechaEstreno(Date.valueOf(fecEst));
                    System.out.println("Idioma");
                    idi = input.nextLine();
                    t.setIdiomaOriginal(idi);
                    System.out.println("Subtitulos");
                    cc = input.nextLine();
                    t.setSubtitulos(cc);
                    System.out.println("Genero");
                    gen = input.nextLine();
                    t.setGenero(gen);
                    System.out.println("Actores");
                    t.setActores();
                    System.out.println("Interpretes");
                    t.setInterpretes();
                    fav.agregarFaborito(t);
                    break;
                }
                case 2: {
                    String tituto;
                    System.out.println("Ingrese el nombre de la Serie o Pelicula a borrar");
                    tituto = input.nextLine();
                    fav.eliminarFavorito(tituto);
                    break;
                }
                case 3: {
                    System.out.println("Sus favoritos son:");
                    fav.listarFavorito();
                    break;
                }
                default: System.out.println("Opcion incorrecta");break;
            }
        }while (eleccion != 4);
        System.out.println("Adios!!");
    }
}
