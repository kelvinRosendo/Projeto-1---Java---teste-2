public class Aula_7_what_if {
        public static void main(String[] args) {
        
    /*Operadores lógicos
 > maior que
 < menor que 
 >= maior ou igual a
 <= menor ou igual a  
 && AND (E)
 || OR (OU)
 ! NOT (não)
 */

 // IF = SE

     boolean choveChuva = false;
     boolean temGuardaChuva = true;

         if (choveChuva == true && temGuardaChuva == true) {
            // executa tudo que estiver nos parenteses se for VERDADEIRO
            System.out.println("Estava chovendo, mas por sorte você tinha um guarda-chuva!!");
         } else if (temGuardaChuva == false && choveChuva == true ){
// O bloco (caso for else) será executado caso o bloco do IF não for coerente. 
// O bloco (else if) é executado caso a condição anterior for FALSE, e a condição do else if fore verdadeira            
            System.out.println("Você pode dancar na chuva, pois, esta sem guarda-chuva");
         } else {
            System.out.println("não está chuvendo");
         }


     String frutaColorida = "preta"; 

         if (frutaColorida == "verde") {
            System.out.println("Não esta boa para o consumo, está azeda");
         } else if ( frutaColorida == "vermelho") {
            System.out.println("Está boa para p consumo! tenha bom proveito");
         } else if (frutaColorida == "amarelo") {
            System.out.println("está quase madura");
         } else {
            System.out.println("ou sua fruta esta podre, ou, dseconheço uma fruta com está coloração");
         }

//Outros modo de utilizar o if

    int poderDeLuta = 12500;
        if (poderDeLuta > 8000)
            System.out.println("É mais de 8000!!");

//Definição de uma variavel vazia através do if

     String video = "Black_Clover";

     String tipoDeVideo = (video == "Black_Clover") ? "anime" : "série";
/*          if (video == "Black_Clover") {
            tipoDeVideo = "anime";
         } else {
            tipoDeVideo = "serie";
         }
*/
            System.out.println(tipoDeVideo);
        }
}
