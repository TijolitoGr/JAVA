import java.util.Scanner;

class math09 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Insira um numerp ");
    try {
        int i = Integer.parseInt(in.next());
        int result = ( i - 1 );
        System.out.println("Antecedor: " + result );
    } catch (NumberFormatException e) {
        System.out.println("Numero Invalido");
    }

  }

}
