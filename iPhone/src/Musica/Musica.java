package Musica;
public class Musica {
    private String titulo;
    private String artista;
    private boolean tocando;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
        this.tocando = false;
    }

    public String getArtista() {
        return artista;
    }
    public String getTitulo() {
        return titulo;
    }
    public boolean isTocando() {
        return tocando;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


}
