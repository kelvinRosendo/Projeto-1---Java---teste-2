import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Aula_8_swith_case { 
    public static void main(String[] args) {
   /* String personagem1 = "Goku";

        if (personagem == "Vegeta") {
            System.out.println("Este personagem vem do planeta Saiajin");
        } else if (personagem == "Goku") {
            System.out.println("Este personagem vem do planeta Saiajin");
        } else if (personagem == "bulma") {
            System.out.println("Este personagem vem do planeta Terra");
        } else if (personagem == "Picollo") {
            System.out.println("Este personagem vem do planeta Namekusejin");
        } else if (personagem == "Kuririn") {
            System.out.println("Este personagem vem do planeta Terra");
        } else {
            System.out.println("origem dseconhecida");
        }*/

        /*switch (personagem1) {
            case "Vegeta":
            System.out.println( "Planeta Saiajin"); 
            break;
        case "Goku":
            System.out.println("Planeta Sayajin");
            break;
        case "Bulma":
        System.out.println("Planeta Terra");
            break;
        case "Picollo":
        System.out.println("Planeta Namekuseijin");
            break;
        case "Kuririn":
        System.out.println("Planeta Terra");
            break;
        default:
            System.out.println("origem desconhecida");
        }*/

    int diasDaSemana = 4;
     /*
    1 == Domingo
    2 == Segunda
    3 == Terça
    4 == Quarta
    5 == Quinta
    6 == Sexta
    7 == Sabado
      */

      switch (diasDaSemana) {
          
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        System.out.println("Dia Da Semana");
        break;

        case 1:
            System.out.println("Final De Semana");
        break;
        
        case 7:
            System.out.println("Final De Semana");
        break;
        }

        String personagem = JOptionPane.showInputDialog(null, "Digite um personagem do anime Dragon Ball");
        String nomeImagem = "";
        String origem = "";

        switch (personagem) {
            case "Goku":
                origem = "Planeta Saiajin";
                nomeImagem = "goku-icone";
                break;
            case "Piccolo":
                origem = "Planeta Namekusei";
                nomeImagem = "piccolo-icone";
                break;
            case "Vegeta":
                origem = "Planeta Saiajin";
                nomeImagem = "vegeta-icone";
                break;
            case "Bulma":
                origem = "Planeta Terra";
                nomeImagem = "bulma-icone";
                break;
            case "Kuririn":
                origem = "Planeta Terra";
                nomeImagem = "kuririn-icone.jpg";
                break;
            default:
            origem = "Ainda Não Adicionada";
            nomeImagem = "default-icone";
                break;
        }
        
        //C:\Users\Kelvin Rosendo\Minhas Coisas- Programação\Projetos Java\Projeto  SwithCase\imagens\bulma-icone.jpg

        String caminhoImagem = String.format("C:/Users/Kelvin Rosendo/Minhas Coisas- Programação/Projetos Java/Projeto  SwithCase/imagens/%s.jpg", nomeImagem);
        ImageIcon icone = new ImageIcon(caminhoImagem);

        
        String informaçõesPersonagens = String.format("Personagem: %s\nOrigem: %s", personagem, origem);
        JOptionPane.showConfirmDialog(null, informaçõesPersonagens, "Descrição", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icone);
        
    }

}