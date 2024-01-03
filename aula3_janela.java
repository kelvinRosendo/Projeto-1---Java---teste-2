import javax.swing.JOptionPane;

public class aula3_janela {    
    public static void main(String[] args) throws Exception{
    String serie = JOptionPane.showInputDialog(null, "Qual Sua Serie Favorita ? ", "Serie", 3);
    String texto = JOptionPane.showInputDialog(null, "Digite Um Numero: ");
    int numero = Integer.parseInt(texto);
    numero = numero * 10;
    JOptionPane.showMessageDialog(null, "Serie favorita: " + serie + ", Numero dito: " + texto + " e seu numero multiplicado por 10 é: " + numero, "Respostas", JOptionPane.INFORMATION_MESSAGE); 
} 
}


/// segunda linha (l, 120): o parentComponent em uma situação onde o codigo teria uma interface grafica, este componente seria de onde sai a informação o "pai" da informação.




