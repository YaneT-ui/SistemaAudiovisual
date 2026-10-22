
public class Temporada {

    private int numero;
    private int cantidadEpisodios;

    public Temporada(int numero, int cantidadEpisodios) {
        this.numero = numero;
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public int getNumero() {
        return numero;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void mostrarInformacion() {
        System.out.println("Temporada: " + numero);
        System.out.println("Episodios: " + cantidadEpisodios);
    }
}
