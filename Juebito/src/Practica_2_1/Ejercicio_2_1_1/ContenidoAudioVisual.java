<<<<<<< Updated upstream:Juebito/src/Practica_2_1/Ejercicio_2_1_1/ContenidoAudioVisual.java
package Practica_2_1.Ejercicio_2_1_1;
import java.sql.Time;
import java.util.Date;
=======
package Practica_2_1;
import java.util.GregorianCalendar;
>>>>>>> Stashed changes:Juebito/src/Practica_2_1/ContenidoAudioVisual.java
import java.util.List;
import java.util.Scanner;

public class ContenidoAudioVisual {
    private Scanner input = new Scanner(System.in);
    private String titulo;
    private String autor;
    private GregorianCalendar duracion;
    private String director;
    private List<String> interpretes;
    private List<String> actores;
    private GregorianCalendar fechaEstreno;
    private String genero;
    private String idiomaOriginal;
    private String subtitulos;


    public Scanner getInput() {
        return this.input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public GregorianCalendar getDuracion() {
        return duracion;
    }

    public void setDuracion(GregorianCalendar duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getInterpretes() {
        return this.interpretes;
    }

    public void setInterpretes() {
        System.out.println("Ingrese los Interpretes, para finalizar ingrese FIN");
        String aca;
        input.nextLine();
        do{
            aca = input.nextLine();
            this.interpretes.add(aca);
        }while(aca.matches("FIN"));
    }

    public List<String> getActores() {
        return this.actores;
    }

    public void setActores() {
        System.out.println("Ingrese los Actores, para finalizar ingrese FIN");
        String aca;
        input.nextLine();
        do {
            aca = input.nextLine();
            this.actores.add(aca);
        }while (aca.matches("FIN"));
    }

    public GregorianCalendar getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(GregorianCalendar fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }

    public void setIdiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }

    public String getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }

    @Override
    public String toString() {
        return  "Titulo: " + this.titulo;
    }

}