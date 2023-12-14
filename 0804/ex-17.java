import java.util.Scanner;

class Exercicio {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

        System.out.print("Insira o Plano: ");
        String plan = in.next();
        System.out.print("Insira o Salário: ");
        float sal = Float.parseFloat(in.next());

        switch (plan.toUpperCase()) {
          case "A" -> {
              System.out.println("10%");
              System.out.println("Salario " + ( sal + (sal*0.10)));
            }
          case "B" -> {
              System.out.println("15%");
              System.out.println("Salario " + ( sal + (sal*0.15)));
            }
          case "C" -> {
              System.out.println("20%");
              System.out.println("Salario " + ( sal + (sal*0.20)));
            }
        }
    }

  }
