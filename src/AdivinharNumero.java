import java.util.Random;
import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int numSorteado = random.nextInt(1001);
        int tentativas = 0;
        
        System.out.println("Escolha um número entre 0 e 1000:");
        
        while (true) {
            System.out.print("Informe um número: ");
            int chute = sc.nextInt();
            tentativas++;
            
            if (chute == numSorteado) {
                System.out.println("Parabéns! Você acertou o número secreto: " + numSorteado);
                System.out.println("Você precisou de " + tentativas + " tenativas para acertar.");
                break;
            } else if (chute < numSorteado) {
                System.out.println("O número é maior que " + chute + ". Tente novamente.");
            } else {
                System.out.println("O número é menor que " + chute + ". Tente novamente.");
            }
        }
        
        sc.close();
    }
}
