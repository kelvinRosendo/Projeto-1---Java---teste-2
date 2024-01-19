import javax.swing.JOptionPane;

public class aula6_boolean {
    public static void main(String[] args) throws Exception { 
        int idade = 16;
        /* operadores relacionares
         * >  maior que:
         * <  menor que:
         * >= maior ou igual a:
         * <= menor ou igual a
         * == igual a: 
         * != diferente de:
         * 
         * sempre será comparado o valor da esquerda para a direita
         */
        boolean resultado = idade >= 18;
        JOptionPane.showMessageDialog(null,resultado);
        
        /* Comparação de vairiaveis */

        int treinosConcluidos = 270;
        int treinosTotais = 270;

        boolean totalTreinos = treinosConcluidos == treinosTotais;

        JOptionPane.showMessageDialog(null, totalTreinos);

        /*Operadores lógicos
         * && AND (E)
         * || OR (OU)
         * ! NOT (não)
         */

         String usuario = "K3lvin";
         String senha = "Nivlek_8002";

         /*digitado na tela de login */

         String usuarioDg = "K3lvin";
         String senhaDg = "Nivlek_8002";

         boolean loginCorreto = usuarioDg == usuario && senhaDg == senha;
         System.out.println(loginCorreto);
    }

}
