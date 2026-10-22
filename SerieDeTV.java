
import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {

    private int numeroTemporadas;
    private List<Temporada> temporadas = new ArrayList<>();

    public SerieDeTV(String titulo, int duracionEnMinutos,
                     String genero, int numeroTemporadas) {

        super(titulo, duracionEnMinutos, genero);
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    public void mostrarTemporadas() {
        for (Temporada temporada : temporadas) {
            temporada.mostrarInformacion();
        }
    }

    public void mostrarSerie() {
        mostrarInformacion();
        System.out.println("Número de temporadas: "
                + numeroTemporadas);
        mostrarTemporadas();
    }
}
