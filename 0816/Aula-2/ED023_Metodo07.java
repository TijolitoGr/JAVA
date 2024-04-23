import java.util.Scanner;
public class ED023_Metodo07 {
    static int Soma(int x, int y) {
        return(x + y);
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y;
        
        System.out.print("Insira um numero: ");
        x = Integer.parseInt(entrada.nextLine());
        System.out.print("\nInsira um outro numero: ");
        y = Integer.parseInt(entrada.nextLine());

        System.out.println("Resultado: " + Soma(x, y));
    }
}
