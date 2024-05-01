package Class;

public class Playback {
    private boolean tocando = false;


    public void play(){
        System.out.println("reproduzindo...");
    }
    public void pause(){
        System.out.println("pausado");
    }
    public void previous(){
        System.out.println("voltando...");
    }
    public void next(){
        System.out.println("próxima faixa...");
    }
    public void volumeUp(){
        System.out.println("Aumentando volume em 1...");
    }
    public void volumeDown(){
        System.out.println("Diminuindo volume em 1");
    }
}
