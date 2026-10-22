
import java.util.ArrayList;
import java.util.List;

public class Pelicula extends ContenidoAudiovisual {

    private String director;
    private List<Actor> actores = new ArrayList<>();

    public Pelicula(String titulo, int duracionEnMinutos,
                    String genero, String director) {

        super(titulo, duracionEnMinutos, genero);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public void mostrarActores() {
        for (Actor actor : actores) {
            actor.mostrarInformacion();
        }
    }

    public void mostrarPelicula() {
        mostrarInformacion();
        System.out.println("Director: " + director);
        System.out.println("Actores:");
        mostrarActores();
    }
}
