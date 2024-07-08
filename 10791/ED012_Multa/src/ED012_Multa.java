import java.util.Scanner;
public class ED012_Multa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quanta Velocidade foi ultrapassada?: ");
        int velocidade = Integer.parseInt(entrada.nextLine());
        
        if (velocidade < 10) {
            System.out.println("Multa: 50 EUROS");
        } else if (velocidade >= 11 && velocidade <= 30) {
            System.out.println("Multa: 100 EUROS");
        } else if (velocidade >= 31) {
            System.out.println("Multa: 300 EUROS");       
        }
    }
}
