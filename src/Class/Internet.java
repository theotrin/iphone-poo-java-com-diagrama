package Class;

public class Internet {

    private int pagina = 1;

    public void exibirPagina() {
        System.out.println("Exibindo página: ");
        System.out.println("numero de páginas: "+ pagina);
        System.out.println("url: www.google.com");
    }

    public void adcionarNovaAba() {
        System.out.println("Exibindo nova página: ");
        pagina++;
        System.out.println("Quantidade de páginas abertas: "+ pagina);
        System.out.println("url: www.apple.com");
    }

    public void atualizarPagina(){
        System.out.println("Página atualizada");
        System.out.println("Quantidade de páginas abertas: "+ pagina);
    }
    
}
