package exer;

import java.util.Scanner;
        
public class Exer {
    public static void main(String[] args) {
    int numa;
    int numb;
    int result;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira o numero mais alto");
    numa = scanner.nextInt();
    
    System.out.println("Insira o numero mais baixo");
    numb = scanner.nextInt();
    
    for (result = numb; result <= numa; result++) {
        System.out.println(result);
            
        }
    }
}
