package Class;


public class Iphone {

    public Ipod ipod;
    public Telefone telefone;
    public Messagem mensagem;

    public Iphone() {
     this.ipod = new Ipod();
     this.telefone = new Telefone();
     this.mensagem = new Messagem();
    }
    
}
