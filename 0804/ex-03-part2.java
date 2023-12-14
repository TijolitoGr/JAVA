import java.util.Scanner;

public class Exer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] num = new int[6];
        int[] par = new int[6];
        int[] imp = new int[6];
        int numpar = 0;
        int numimp = 0;

        System.out.println("Insira 6 numeros: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
            if ((num[i] % 2) == 1) {
                imp[numimp] = num[i];
                numimp = numimp + 1;

            } else {
                par[numpar] = num[i];
                numpar = numpar + 1;
            }
        }
        System.out.println("A quantidade de numeros pares e de: " + numpar);
        System.out.println("A quantidade de numeros impares e de: " + numimp);

        for (int i = 0; i < num.length; i++) {
            if ((num[i] % 2) == 1) {
                System.out.println(par[i]);
                
            } else {
                System.out.println(imp[i]);

            }
        }
    }
}
