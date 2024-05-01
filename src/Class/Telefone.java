package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class Telefone {
    private ArrayList<String> contatos;
    private ArrayList<String> correioDeVoz;

    public void recebendoLigacao() {
        boolean loop = true;
        while(loop){

        System.out.println("recebendo chamada 1 para atender // 2 para recusar");
        Scanner scanner = new Scanner(System.in);
        String atendido = scanner.next();

        switch (atendido) {
            case "1":
                System.out.println("Ligação atendida"); 
                loop = false;               
                break;
            case "2":
                System.out.println("Ligação recusada");
                loop = false;
                break;
            default:
            System.out.println("Opção inválida digite: 1 ou 2");   
        }
    }
}
    public void ligar() {
        System.out.println("Digite o numero que você deseja ligar: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if(numero == 190 || numero == 911){
            System.out.println("ligando para polícia..");
        }else{
            System.out.println("ligando para: "+numero);
        }
}
    public void listarContatos() {
        if(contatos != null){
            for(String contato: contatos){
                System.out.println(contato);
            }
        }else{
            System.out.println("Lista de contatos vazia.");
        }
    }

    public void listarCorreioDeVoz() {
        if(correioDeVoz != null){
            for(String recado: correioDeVoz){
                System.out.println(recado);
            }
        }else{
            System.out.println("Caixa postal vazia");
        }
    }

    public void setContatos(ArrayList<String> contatos) {
        this.contatos = contatos;
    }
    public void setCorreioDeVoz(ArrayList<String> correioDeVoz) {
        this.correioDeVoz = correioDeVoz;
    }
    
}
