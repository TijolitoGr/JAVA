import java.util.Scanner;
public class ED011_MediaSN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quantas vezes a media sera alterada?: ");
        int vezes = Integer.parseInt(entrada.nextLine());
        
        int numero, media = 0;
        
        for (int i = 0; i < vezes; ++i) {
            System.out.println("Insira um numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            media += numero; 
        }
        
        media /= vezes;
        System.out.println("\nA media desses valores todos da: " + media + ".\n\n");
    }
}
