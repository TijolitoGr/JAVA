import java.util.Scanner;

class Aula {

  public static void main(String[] args) {

    int pagamentoporhoras;
    int horas;
    int result;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Inserir Pagamento por Hora: ");
      pagamentoporhoras = scanner.nextInt();
    System.out.println("Inserir Horas Trabalhadas: ");
      horas = scanner.nextInt();
    result = ( pagamentoporhoras * horas );
    System.out.println("Ganho Total: " + result );

  }
