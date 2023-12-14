// Nome do Produto = Código = Preço
// Cachorro Quente     = 100 = 1.20
// Bauru Simples       = 101 = 1.30
// Bauro Com Ovo       = 102 = 1.50
// Hamburger           = 103 = 1.20
// Cheeseburger        = 104 = 1.30
// Refrigerante        = 105 = 1.00

package exer;

import java.util.Scanner;
        
public class Exer {
    public static void main(String[] args) {
    int codigo;
    int quant;
    double result;
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira o Codigo do Produto");
    codigo = scanner.nextInt();
    
    switch (codigo) {
        case 100 -> {
            System.out.println("Quantos?");
            quant = scanner.nextInt();
            result = (double) quant * 1.2;
            System.out.println("Sao precisos " + result + " Euros");
        }
        case 101 -> {
            System.out.println("Quantos?");
            quant = scanner.nextInt();
            result = (double) quant * 1.3;
            System.out.println("Sao precisos " + result + " Euros");
        }
        case 102 -> {
            System.out.println("Quantos?");
            quant = scanner.nextInt();
            result = (double) quant * 1.5;
            System.out.println("Sao precisos " + result + " Euros");
        }
        case 103 -> {
            System.out.println("Quantos?");
            quant = scanner.nextInt();
            result = (double) quant * 1.2;
            System.out.println("Sao precisos " + result + " Euros");
        }
        case 104 -> {
            System.out.println("Quantos?");
            quant = scanner.nextInt();
            result = (double) quant * 1.3;
            System.out.println("Sao precisos " + result + " Euros");
        }
        case 105 -> {
            System.out.println("Quantos?");
            quant = scanner.nextInt();
            result = (double) quant * 1.0;
            System.out.println("Sao precisos " + result + " Euros");
        }
        default -> {
            System.out.println("Nao foi possivel realizar a tarefa");
           
            }
        }
    }
}
