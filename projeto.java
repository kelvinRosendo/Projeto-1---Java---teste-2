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
    System.out.format("o filme %s");
  }
}