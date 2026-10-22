
public class Cortometraje extends ContenidoAudiovisual {

    private String director;
    private int anioEstreno;

    public Cortometraje(String titulo, int duracionEnMinutos,
                        String genero, String director,
                        int anioEstreno) {

        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.anioEstreno = anioEstreno;
    }

    public String getDirector() {
        return director;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void mostrarCortometraje() {
        mostrarInformacion();
        System.out.println("Director: " + director);
        System.out.println("Año de estreno: " + anioEstreno);
    }
}
