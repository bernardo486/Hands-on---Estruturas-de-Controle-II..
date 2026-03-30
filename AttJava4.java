
package att.java.pkg4;
import java.util.Scanner;

public class AttJava4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int tentativa = 0;
        char resposta;
        boolean acertou = false;

        do {
            tentativa++;

            System.out.println("\nQuestão (Matemática):");
            System.out.println("Qual é o valor de 2 + 2?");
            System.out.println("(a) 3");
            System.out.println("(b) 4");
            System.out.println("(c) 5");
            System.out.println("(d) 6");
            System.out.println("(e) 7");
            System.out.print("Escolha uma alternativa: ");

            resposta = entrada.next().toLowerCase().charAt(0);

            switch (resposta) {
                case 'b':
                    System.out.println("Resposta correta!");
                    System.out.println("Você acertou na tentativa " + tentativa + ".");
                    acertou = true;
                    break;

                case 'a':
                case 'c':
                case 'd':
                case 'e':
                    System.out.println("Resposta incorreta.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    tentativa--; 
                    break;
            }

        } while (!acertou && tentativa < 3);

        if (!acertou) {
            System.out.println("\nResposta incorreta nas 3 tentativas.");
        }

        entrada.close();
    }
}
    
    

