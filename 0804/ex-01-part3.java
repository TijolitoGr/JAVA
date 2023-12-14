
import java.util.Scanner;

public class Exer {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];

        Scanner scanner = new Scanner(System.in);
        for (int l = 0; l < matriz[0].length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.println("Introduza o valor para a linha" + l + "o para a coluna" + c);
            }
        }
    }

}
