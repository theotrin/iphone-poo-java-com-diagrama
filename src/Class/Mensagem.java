package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class Mensagem {
    private ArrayList<String> messagens;

    public void listarMensagens() {

            if(messagens != null){
                System.out.println("Caixa de mensagens:");
                for(String mensagem: messagens){
                    System.out.println(mensagem);
                }
            }else{
                System.out.println("Caixa de mensagem vazia.");
            }
        }

        public void enviarMensagem(String contato) {
            System.out.println("digite o corpo da mensagem: ");
            Scanner scanner = new Scanner(System.in);
            String corpoMenssagem = scanner.nextLine();
            boolean loop = true;
            while (loop) {
                System.out.println("Enviar a mensagem digitadad para "+contato+"? 1 para enviar / 2 para cancelar");
                Scanner scannerMenssagem = new Scanner(System.in);
                Integer confirmaEnvio = scannerMenssagem.nextInt();

                switch (confirmaEnvio) {
                    case 1:
                        System.out.println("mensagem enviada para "+ contato);
                        System.out.println(corpoMenssagem);
                        this.messagens.add(contato+corpoMenssagem);
                        loop = false;
                        break;
                    case 2:
                        System.out.println("Envio de mensagem cancelada");
                        loop = false;
                        break;
                
                    default:
                        System.out.println("Opção inválida, digite 1 ou 2");
                        break;
                }               
            }
        }

        public void setMessagens(ArrayList<String> messagens) {
            this.messagens = messagens;
        } 
          
}
