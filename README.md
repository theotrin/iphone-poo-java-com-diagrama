# Projeto de fazer as funcionalidades do iphone ultilizando diagrama de classes e progrmação orientada a objetos com Java!

Nesse projeto proposto pela Dio foi passado a tarefa de assistir a palestra do Steve Jobs apresentando o iphone em 2007, e cada funcionalidade que ele apresentasse teria que ser refeita em Java.

## Diagrama que fiz enquanto assistia a palestra: 

 ![diagrama_classe_iphone](https://github.com/theotrin/iphone-poo-java-com-diagrama/assets/102327842/8a0414d8-d304-4eeb-b618-dfcfa0b88f80)


## Como usar: 
A Classe App.java já esta povoada com funções que precisam apenas ser descomentadas para você ver a ultilização! porem se quiser você pode entrar e olhar as classes uma a uma.

# Principais funcionalidades das classes:

## Iphone: 
A classe iphone ultiliza as classes a baixo ao instanciar a classe Iphone ela cria as sua funcionalidades que um Iphone normal tem.

``` java
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
```

## Ipod: 
``` java
listarMusicas(); // Lista todas as musicas disponíveis no seu Ipod! 
listarFilmes();  // Lista todos os filmes disponíveis no seu Ipod!
listarAudioBooks(); // Lista todos os Audio Books disponíveis no seu Ipod!
listarVideos(); // Lista todos os videos disponíveis no seu Ipod!
```

## Playback: 
``` java
play(); // Mostra de forma visual que sua musica/video/filme está sendo reproduzido.
pause(); // Mostra de forma visual que sua musica/video/filme foi pausado.
previous() // Mostra de forma visual que sua musica/video/filme esta voltando para o arquivo anterior.
next(); // Mostra de forma visual que sua musica/video/filme esta voltando para o próximo arquivo.
volumeUp(); // Aumenta o volume da faixa em 1.
volumeDown(); // Diminui o volume da faixa em 1.
```

## Telefone: 
``` java
recebendoLigacao(); 
// O metódo simula uma ligação com a mensagem: "recebendo chamada 1 para atender // 2 para recusar" 
//se clicar 1 temos a reposta: "Ligação atendida" 
//se clicar em 2 temos a reposta "Ligação recusada" 
//se o numero for dirente de 1 ou 2 o programa retorna: "Opção inválida digite: 1 ou 2" e o programa volta para a mensagem de recebendo ligação

ligar();
// O programa mostra a mensagem "Digite o numero que você deseja ligar:"
// Então o usuário digita o numero para fazer a ligação.
// E sera retornado "Ligando para: (numero que o usuario digitou).
//Ester egg: se o número for "190" ou "911" o programa retornar a mensagem "Ligando para a polícia".

listarContatos();
// Mostra a sua lista com todos os seus contatos.
// Se a lista for vazia é retornado "Lista de contatos vazia"

listarCorreioDeVoz();
// Mostra a sua lista com todos as mensagens na caixa postal.
// Se a caixa postal estiver vazia é retornado "Caixa postal vazia".
```

## Internet: 
``` java
exibirPagina(); // Exibe a página aberta com a URL e juntamente com o número de páginas abertas. 
adcionarNovaAba(); // Cria uma nova aba e incrementa em 1 o número total de páginas.
adcionarNovaAba(); // Atualiza a página atual e mostra quantas páginas existem abertas.
```
