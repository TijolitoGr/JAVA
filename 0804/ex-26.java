import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner scannner = new Scanner(System.in);
    int baixo = 1000;
    int alto = 1999;
    int resto, num;

    for(num = baixo; num < alto; num++) {

      resto = (num % 11);
      if ( resto == 5 ) {
        System.out.println(num);
      }

    }

  }

}
