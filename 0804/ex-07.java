import java.util.Scanner;

class Aula {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
      
    double fatura;
    double pagamento;
    double troco;
    
    System.out.println("Insira a Fatura: ");
    fatura = (double) scanner.nextInt();
    System.out.println("Insira o Pagamento: ");
    pagamento = (double) scanner.nextInt();
    troco = (double) pagamento - fatura;
    System.out.println("Troco sera de: " + troco);

    
  }

}
