public class aula_2_mini_projeto {
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