
import java.util.ArrayList;
import java.util.List;

public class Documental extends ContenidoAudiovisual {

    private String tema;
    private List<Investigador> investigadores = new ArrayList<>();

    public Documental(String titulo, int duracionEnMinutos,
                      String genero, String tema) {

        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void agregarInvestigador(Investigador investigador) {
        investigadores.add(investigador);
    }

    public void mostrarInvestigadores() {
        for (Investigador investigador : investigadores) {
            investigador.mostrarInformacion();
        }
    }

    public void mostrarDocumental() {
        mostrarInformacion();
        System.out.println("Tema: " + tema);
        System.out.println("Investigadores:");
        mostrarInvestigadores();
    }
}
