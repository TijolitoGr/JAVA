import java.util.Scanner;
import java.util.Random;

public class ED013_Adivinha2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Random rnd = new Random();
        
        int random = rnd.nextInt(100);
        int guess = 999;
        
        do {
            System.out.print("Tenta Adivinhar: ");
            guess = Integer.parseInt(entrada.nextLine());
            
            if (guess > random) {
                System.out.println("Numero Alto!");
            } else if (guess < random) {
                System.out.println("Numero Baixo!");
            }
            
        } while (guess != random);
        
        System.out.println("PARABENS!!\n\n");
    }
}
