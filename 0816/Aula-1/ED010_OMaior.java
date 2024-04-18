import java.util.Scanner;
public class ED010_OMaior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y;
        System.out.println("Insira o Numero 1: ");
        x = Integer.parseInt(entrada.nextLine());
        System.out.println("Insira o Numero 2: ");
        y = Integer.parseInt(entrada.nextLine());
        
        if (x > y) {
           System.out.println("O Numero X::[" + x + "] e maior que o Numero Y::[" + y + "]"); 
        } else if (y > x) {
           System.out.println("O Numero Y::[" + y + "] e maior que o Numero X::[" + x + "]"); 
        } else if (x == y) {
           System.out.println("O Numero X::[" + x + "] e igual ao Numero Y::[" + y + "]"); 
        }
    }
}
