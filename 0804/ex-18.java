package exer;

import java.util.Scanner;
        
public class Exer {
    public static void main(String[] args) {
    int numero;    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira um numero: ");
    numero = scanner.nextInt();
    
    switch (numero) {
        case 0 -> {
            System.out.println("Zero");
        }
        case 1 -> {
            System.out.println("Um");
        }
        case 2 -> {
            System.out.println("Dois");
        }
        case 3 -> {
            System.out.println("Tres");
        }
        case 4 -> {
            System.out.println("Quatro");
        }
        case 5 -> {
            System.out.println("Cinco");
        }
        case 6 -> {
            System.out.println("Seis");
        }
        case 7 -> {
            System.out.println("Sete");
        }
        case 8 -> {
            System.out.println("Oito");
        }
        case 9 -> {
            System.out.println("Nove");
        }
        case 10 -> {
            System.out.println("Dez");
        }
        
        default -> {
            System.out.println("Nao foi possivel realizar a tarefa");
           
            }
        }
    }
}
