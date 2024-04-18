import java.util.Scanner;
import java.util.Random;

public class ED014_Adivinha3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Random rnd = new Random();
        
        int random = rnd.nextInt(100);
        int guess = 999, tentativas = 0;
        
        do {
            System.out.print("Tenta Adivinhar: ");
            guess = Integer.parseInt(entrada.nextLine());
            ++tentativas;
            
            if (guess > random) {
                System.out.println("Numero Alto!");
            } else if (guess < random) {
                System.out.println("Numero Baixo!");
            }
            
        } while (guess != random);
        
        System.out.println("PARABENS!!\nConseguiste em " + tentativas + " tentativas");
    }
}
