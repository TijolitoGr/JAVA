import java.util.ArrayList;
import java.util.List;

public class ED037_FilaApp1 {
    public static void main(String[] args) {
        // Declaracao das Variaveis;
        List<Integer> lista = new ArrayList<>();
        
        for (int i = 1; i < 11; ++i) {
            lista.add(i);
        }
        
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        
        // Detecao da quantiadede numeros;
        int tamanhoDoArray = lista.size();
        
        
        // Detetar qual o maior e o menor;
        for (int i = 0; i < tamanhoDoArray; ++i) {
            int elemento = lista.get(i);
            if (elemento > maior) {
                maior = elemento;
            }

            if (elemento < menor) {
                menor = elemento;
            }
        }
        
        // Dar Output nos Resultados;
        System.out.println("Mais Pequeno e: " + menor + "\nMais Maior e: " + maior);
    }
}