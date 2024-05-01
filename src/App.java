import java.util.ArrayList;

import Class.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Adcionando musicas para serem colococadas no Ipod do Iphone.
        ArrayList<String> novasMusicas = new ArrayList<>();
        novasMusicas.add("It's My Life - Bon Jovi");
        novasMusicas.add("Don't Let Me Down - The Beatles");
        novasMusicas.add("Beat it - Michael Jackson");

        ArrayList<String> novosFilmes = new ArrayList<>();
        novosFilmes.add("Piratas do Caribe");
        novosFilmes.add("Clube da Luta");

        ArrayList<String> novosAudioBooks = new ArrayList<>();
        novosAudioBooks.add("Os Segredos da Mente Milhonária");
        novosAudioBooks.add("O Programador Pragmático de aprendiz a mestre");

        ArrayList<String> novosVideos = new ArrayList<>();
        novosVideos.add("Dia na Disney");
        novosVideos.add("Andando em Shibuya a noite");

        ArrayList<String> contatos = new ArrayList<>();
        contatos.add("Mãe");
        contatos.add("Pai");
        contatos.add("Steve Jobs");

        Iphone iphone = new Iphone();

        iphone.ipod.setMusicas(novasMusicas);
        iphone.ipod.setFilmes(novosFilmes);
        iphone.ipod.setAudioBooks(novosAudioBooks);
        iphone.ipod.setVideos(novosVideos);

        iphone.telefone.setContatos(contatos);

        //funções do ipod dentro do iphone
        // iphone.ipod.listarMusicas();
        // iphone.ipod.listarFilmes();
        // iphone.ipod.listarAudioBooks();
        // iphone.ipod.listarVideos();

        //funções do playback do ipod de uma classe dentro do ipod
        
        // iphone.ipod.playback.play();
        // iphone.ipod.playback.pause();
        // iphone.ipod.playback.next();
        // iphone.ipod.playback.previous();

        //iphone.telefone.recebendoLigacao();
        //iphone.telefone.ligar();
        //iphone.telefone.listarContatos();
        iphone.telefone.listarCorreioDeVoz();

        



    }
}
