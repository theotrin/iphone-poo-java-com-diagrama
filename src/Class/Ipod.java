package Class;

import java.util.ArrayList;

public class Ipod {
    
    private ArrayList<String> musicas;
    private ArrayList<String> audioBooks;
    private ArrayList<String> videos;
    private ArrayList<String> filmes;
    public Playback playback;

    public Ipod() {
        this.playback = new Playback();
    }

    public void listarMusicas() {
        if( musicas != null){
            System.out.println("Lista de músicas: ");
            for(String musica: musicas){
                System.out.println(musica);
            }
        }else{
            System.out.println("Lista de músicas vazias :/");
        }
    }

    public void listarAudioBooks() {
        if( audioBooks != null){
            System.out.println("Lista de ÁudioBooks: ");
            for(String audibook: audioBooks){
                System.out.println(audibook);
            }
        }else{
            System.out.println("Lista de ÁudioBooks vazias :/");
        }
    }

    public void listarVideos() {
        if( videos != null){
            System.out.println("Lista de Vídeos: ");
            for(String video: videos){
                System.out.println(video+".mp4");
            }
        }else{
            System.out.println("Lista de Vídeos vazias :/");
        }
    }
    public void listarFilmes() {
        if( filmes != null){
            System.out.println("Lista de Filmes: ");
            for(String filme: filmes){
                System.out.println(filmes+".avi");
            }
        }else{
            System.out.println("Lista de Filmes vazias :/");
        }
    }

   

    public void setMusicas(ArrayList<String> musicas) {
        this.musicas = musicas;
    }

    public void setAudioBooks(ArrayList<String> audioBooks) {
        this.audioBooks = audioBooks;
    }

    public void setVideos(ArrayList<String> videos) {
        this.videos = videos;
    }

    public void setFilmes(ArrayList<String> filmes) {
        this.filmes = filmes;
    }
}
