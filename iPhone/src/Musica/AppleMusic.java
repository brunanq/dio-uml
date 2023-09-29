package Musica;

import java.util.ArrayList;
import java.util.List;

public class AppleMusic {
    private List<Musica> appleMusic;

    public AppleMusic() {
        this.appleMusic = new ArrayList<>();
    }

    public void addMusica(String nome, String artista){
        Musica musica = new Musica(nome, artista);
        appleMusic.add(musica);
    }

    public void tocarMusica(String nome){
        for (Musica musica : appleMusic) {
            if(musica.getTitulo() == nome){
                musica.setTocando(true);
                break;
            }
        }
    }

    public void pausarMusica(String nome){
        for (Musica musica : appleMusic) {
            if(musica.getTitulo() == nome){
               if(musica.isTocando()){
                musica.setTocando(false);
            } 
            break;
            }
            
        }
    }
}
