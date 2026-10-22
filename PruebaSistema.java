
public class PruebaSistema {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA AUDIOVISUAL ===");

        // Creamos un actor
        Actor actor1 = new Actor("Ana Torres", 25);

        // Creamos una temporada
        Temporada temporada1 = new Temporada(1, 10);

        // Creamos un investigador
        Investigador investigador1 =
                new Investigador("Carlos Perez", "Historia");

        // Creamos y mostramos una pelicula
        Pelicula pelicula = new Pelicula(
                "La aventura", 120, "Aventura", "Luis Gomez");

        pelicula.agregarActor(actor1);
        pelicula.mostrarPelicula();

        // Creamos y mostramos una serie
        SerieDeTV serie = new SerieDeTV(
                "Misterios", 45, "Suspenso", 2);

        serie.agregarTemporada(temporada1);
        serie.mostrarSerie();

        // Creamos y mostramos un documental
        Documental documental = new Documental(
                "Nuestro planeta", 60,
                "Naturaleza", "Medio ambiente");

        documental.agregarInvestigador(investigador1);
        documental.mostrarDocumental();

        // Creamos y mostramos un video de YouTube
        VideoYouTube video = new VideoYouTube(
                "Aprendiendo Java", 15, "Educativo",
                "Canal de Programacion", 1000);

        video.mostrarVideo();

        // Creamos y mostramos un cortometraje
        Cortometraje corto = new Cortometraje(
                "El viaje", 20, "Drama", "Luis Gomez", 2026);

        corto.mostrarCortometraje();
    }
}
