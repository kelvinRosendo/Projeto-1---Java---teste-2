import java.util.Random;

import javax.swing.JOptionPane;

public class aula5_incrementando_aleatoriedade {
    

    public static void main(String[] args) throws Exception {
    
         //menor valor  I valor maximo a ser gerado I
// fora do parenteses   V                           V
        int dado6faces = 1 + (int) (Math.random() * 6);
       // JOptionPane.showMessageDialog(null, dado6faces );

       System.out.println("seu numero da sorte foi" + dado6faces );
    
        Random gerador = new Random();
        int numero_aleatorio = 1 + gerador.nextInt(100); //6 é o numero maximo e 1 é o numero minimo
        JOptionPane.showMessageDialog(null, numero_aleatorio);
    }


}
