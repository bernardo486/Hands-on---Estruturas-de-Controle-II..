
package att.java3;
import java.util.Scanner;
public class AttJava3 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String texto = entrada.nextLine();

        int letras = 0;
        int numeros = 0;
        int espacos = 0;
        int outros = 0;

        for (char c : texto.toCharArray()) {

            if (Character.isLetter(c)) {
                letras++;
            } else if (Character.isDigit(c)) {
                numeros++;
            } else if (Character.isWhitespace(c)) {
                espacos++;
            } else {
                outros++;
            }
        }

        System.out.println("\nResultado:");
        System.out.println("Letras: " + letras);
        System.out.println("Números: " + numeros);
        System.out.println("Espaços: " + espacos);
        System.out.println("Outros caracteres: " + outros);

        entrada.close();
    }
}
    
    
