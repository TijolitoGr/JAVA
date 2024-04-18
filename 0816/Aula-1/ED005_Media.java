import java.util.Scanner;

public class ED005_Media {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota1, nota2, nota3, media;
        
        System.out.println("Insira a nota [1]: ");
        nota1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Insira a nota [2]: ");
        nota2 = Integer.parseInt(entrada.nextLine());
        System.out.println("Insira a nota [3]: ");
        nota3 = Integer.parseInt(entrada.nextLine());
        
        media = nota1 + nota2 + nota3;
        media /= 3;
        
        System.out.println("A media das tres notas e de: " + media);
    }
}
