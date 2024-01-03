import javax.swing.JOptionPane;

public class aula6_boolean {
    

    public static void main(String[] args) throws Exception { 
        int idade = 18;
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
        boolean resultado3 = idade <= 18;
        JOptionPane.showMessageDialog(null,resultado3);
        

    }

}
