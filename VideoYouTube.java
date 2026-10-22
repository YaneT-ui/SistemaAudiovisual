
public class VideoYouTube extends ContenidoAudiovisual {

    private String canal;
    private int visualizaciones;

    public VideoYouTube(String titulo, int duracionEnMinutos,
                        String genero, String canal,
                        int visualizaciones) {

        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.visualizaciones = visualizaciones;
    }

    public String getCanal() {
        return canal;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    public void mostrarVideo() {
        mostrarInformacion();
        System.out.println("Canal: " + canal);
        System.out.println("Visualizaciones: " + visualizaciones);
    }
}
