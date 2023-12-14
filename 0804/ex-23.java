package exer;

import java.util.Scanner;
        
public class Exer {
    public static void main(String[] args) {
    int numero = 1;
    int tabuar;
    int result;
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Calcular uma Tabuada");
    System.out.println("Insira o numero para tabuar: ");
    tabuar = scanner.nextInt();
    
    while (1==1){
    result = numero * tabuar;
    System.out.println(+ result);
    numero++;
    
        }
    }
    
}
