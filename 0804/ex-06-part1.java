import java.util.Scanner;

class Aula {

  public static void main(String[] args) {

    int fatura;
    double percentagem = 0.1;
    double result;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira a fatura");
    fatura = scanner.nextInt();
    result = fatura*percentagem;
           
    System.out.println("Tip to Garcon: " + result);
    

  }

}
