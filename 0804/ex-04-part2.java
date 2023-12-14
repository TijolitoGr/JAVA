import java.util.Scanner;

public class Exer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        int[] numpos = new int[10];
        int[] numneg = new int[10];
        int numpositivos = 0;
        int somanumpos = 0;
        int numnegativos = 0;

        System.out.println("Insira 10 numeros: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
            if (num[i] >= 0) {
                somanumpos = somanumpos + num[i];

            } else {
                numnegativos++;
            }
            
        }
        System.out.println("Quantidade de numeros negativos: " + numnegativos);
            System.out.println("Soma dos numeros positivos: " + somanumpos);
    }
}
