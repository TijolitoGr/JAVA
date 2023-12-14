package exer;

import java.util.Scanner;
        
public class Exer {
    public static void main(String[] args) {
    int num;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira um numero menor que 100");
    num = scanner.nextInt();
    
    if (num >= 100) {
        System.out.println("Numero Invalido");
    
    } else {   
    while (num < 100) {
    num++;
    System.out.println(num);
            }
        }
    }
}
