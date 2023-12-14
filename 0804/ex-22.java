package exer;

import java.util.Scanner;
        
public class Exer {
    public static void main(String[] args) {
    int senha;
    
    Scanner scanner = new Scanner(System.in);       
    
    do { System.out.println("Insira a senha");
    senha = scanner.nextInt();
    
    }
    
    while (senha != 12345);
    System.out.println("Correta");
        
    }
    
}
