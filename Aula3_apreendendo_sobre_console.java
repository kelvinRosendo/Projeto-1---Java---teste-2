import java.util.Scanner;
public class Aula3_apreendendo_sobre_console {

    public static void main(String[] args) throws Exception {
        
        String elo;
        String posicao;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Qual é o seu elo no ff?");
            elo = leitor.nextLine();

            System.out.println("E qual a sua posicao ");
            posicao = leitor.nextLine();

            System.out.println("Qual o seu personagem favorito ?");
            String personagem = leitor.nextLine();

            System.out.println("Você é " + elo + "na posição " + posicao + "e gosta de jogar de " + personagem  );
        }

    }
}

/// toda vez que for presiso converter um valor de uma String em um float ou em um Int usar : interger(o tipo da varialvel).parseInt(nome da variavel) ou float(o tipo da variavel).parseFloat(nome da variavel)
