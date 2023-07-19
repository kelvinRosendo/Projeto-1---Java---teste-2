import java.util.Scanner;

import javax.swing.JOptionPane;

public class projeto {

    public static void main(String[] args)  throws Exception  {
        System.out.println("se isso aki de certo eu choro");
    }
}

//teste de variaveis

class projeto2 {

    public static void main(String[] args) throws Exception {
        
//variaveis de numeros inteiros: 
        byte numeroPequno = 12 ;
        short numerosShorts = 32000 ;
        int numeroMaior = 54564 ;
        long numeroEnorme = 922337203685477000l;

//variaveis de numeros numeros decimais/floats:

    float pesoPessoal = 56.6f;
    double Pi = 3.141592656654654;

//variaveis de caracteres 

    char letra = 'a';
    
// variavel de False e True (booleano)
    
    boolean estouComSede = true;
    
// variaveis dp tipo String 
    
    String nome = "Kelvin";
    String texto = "okay java não é tão ruim quanto parece, ainda...";

    //os "prints"
        System.out.println(numeroPequno);
        System.out.println(numerosShorts);
        System.out.println(numeroMaior);
        System.out.println(numeroEnorme);
        System.out.println(pesoPessoal);
        System.out.println(Pi);
        System.out.println(estouComSede);
        System.out.println(letra);
        System.out.println(nome);
        System.out.println(texto);
    }
}

class projeto3 {

    public static void main(String[] args) throws Exception {
    String nomeCompleto = "Kelvin Rosendo De Souza";
    String filme = "vingadores";
    int anoLançamento = 2012;
    int duraçao = 143;
    float notaCritica = 9.9f;
    boolean sucesso = true;
    int bilheteria = 1;


    System.out.println(sucesso);
    System.out.println(notaCritica);
    System.out.println(duraçao);
    System.out.println(anoLançamento);
    System.out.println(filme);
    System.out.println(nomeCompleto);

    System.err.println("o filme " + filme + "foi um sucesso de bilheteria vendendo mais de " + bilheteria + " bilhão e meio, com uma nota geral de " + notaCritica + " sendo um filme lançado em " + anoLançamento + " e que envelheceu e marcou muitas infâncias" );
    

    System.out.format("o filme %s lançado em %d, tem  uma duração de %d minutos.\n", filme, anoLançamento, duraçao);

    String texto = String.format("o filme %s lançado em %d, tem  uma duração de %d minutos.\n\n", filme, anoLançamento, duraçao);

    System.out.println(texto);

    String mensagem1 = "Somos variaveis separadas\n";
    String mensagem2 = "Mas que pela concatenação\n";
    String mensagem3 = "Podemso ser exibidas em apenas um comando\n";

    String mensagem123 = mensagem1 + mensagem2 + mensagem3;
    
    System.out.println(mensagem123);
  }
}

class console {

    public static void main(String[] args) throws Exception {
        String elo;
        String posicao;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual é o seu elo no ff?");
        elo = leitor.nextLine();

        System.out.println("E qual a sua posicao ");
        posicao = leitor.nextLine();

        System.out.println("Qual o seu personagem favorito ?");
        String personagem = leitor.nextLine();

        System.out.println("Você é " + elo + "na posição " + posicao + "e gosta de jogar de " + personagem  );

    }
}

/// toda vez que for presiso converter um valor de uma String em um float ou em um Int usar : interger(o tipo da varialvel).parseInt(nome da variavel) ou float(o tipo da variavel).parseFloat(nome da variavel)



     class Janela{    
        public static void main(String[] args) throws Exception{
        String serie = JOptionPane.showInputDialog(null, "Qual Sua Serie Favorita ? ", "Serie", 3);
        String texto = JOptionPane.showInputDialog(null, "Digite Um Numero: ");
        int numero = Integer.parseInt(texto);
        numero = numero * 10;
        JOptionPane.showMessageDialog(null, "Serie favorita: " + serie + ", Numero dito: " + texto + " e seu numero multiplicado por 10 é: " + numero, "Respostas", JOptionPane.INFORMATION_MESSAGE); 
    } 
}
    

   /// segunda linha (l, 120): o parentComponent em uma situação onde o codigo teria uma interface grafica, este componente seria de onde sai a informação o "pai" da informação.




    class Matemática {

    public static void main(String[] args) throws Exception {
        int nmrA = 8;
        int nmrB = 19;

        int resultado = nmrA + nmrB;

        JOptionPane.showMessageDialog(null , resultado , "Matemática" );;
    }
}