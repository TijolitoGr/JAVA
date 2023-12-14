
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Queue<String> con = new LinkedList<>();
        int menu;

        do {

            System.out.println("1 - Adicionar Contacto:");
            System.out.println("2 - Efetuar Contacto:");
            System.out.println("3 - Lista de COntactos");
            System.out.println("4 - Sair");

            menu = scanner.nextInt();

            switch (menu) {
                case '1' -> {
                    System.out.println("Insira o contacto: ");
                    con.add(scanner.nextLine());

                }
                case '2' -> {
                    System.out.println("A quem deseja telefonar?" + con);

                }

                case '3' -> {
                    System.out.println(con);
                }
                
                case '4' -> {
                    menu = 0;
                    break;
                }

            }

        } while (menu != 0);
    }
}
