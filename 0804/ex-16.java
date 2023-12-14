import java.util.Scanner;

class math16 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    try {
        System.out.print("Insira um numero: ");
        float num = Float.parseFloat(in.next());
        if ( num <= 525 ) {
          double sal = ( num + (num*0.15) );
          System.out.println("15%");
          System.out.println("Salario: " + sal + "€" );
        } else {
          double sal = ( num + (num*0.10) );
          System.out.println("10%");
          System.out.println("Salario: " + sal + "€" );
        }
    } catch (NumberFormatException e) {
        System.out.println("Numero Invalido");
    }

  }

}
