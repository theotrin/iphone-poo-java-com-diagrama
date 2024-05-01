package Class;


public class Iphone {

    public Ipod ipod;
    public Telefone telefone;
    public Mensagem mensagem;
    public Internet internet;

    public Iphone() {
     this.ipod = new Ipod();
     this.telefone = new Telefone();
     this.mensagem = new Mensagem();
     this.internet = new Internet();
    }
    
}
