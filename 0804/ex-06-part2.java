import java.util.Scanner;

public class Exer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] pro = new int[5];
        int[] din = new int[5];
        int menos50 = 0, entre50e100 = 0, mediamais100 = 0, quanmedia = 0;

        System.out.println("Insira 5 produtos: ");
        for (int i = 0; i < 5; i++) {
            pro[i] = scanner.nextInt();

        }

        System.out.println("Insira 5 precos para os repetivos 5 produtos");

        for (int i = 0; i < 5; i++) {
            din[i] = scanner.nextInt();
            if (din[i] <= 50) {
                menos50++;

            } else if (din[i] > 50 && din[i] < 99) {
                entre50e100++;

            } else if (din[i] > 100) {
                mediamais100 = mediamais100 + din[i];
                quanmedia++;
            } else {
                System.out.println("Um erro ocorreu. Tente Novamente");
            }

        }
        mediamais100 = mediamais100 / quanmedia;
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Produtos e seu respetivo valores: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Produto numero " + pro[i] + " vale: " + din[i] + " euros.");

        }
        System.out.println("Quantidade de produtos menos de 50 euros: " + menos50);
        System.out.println("Quantidade de produtos entre 50 e 100 euros: " + entre50e100);
        System.out.println("Media do preco dos produtos de mais de 100 euros: " + mediamais100);
    }
}
