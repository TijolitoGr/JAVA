
import java.util.ArrayList;
import java.util.List;

public class ED034_ListaApp1 {
    public static void main(String[] args) {
        // Declaracao de um novo array
        String[] arrayDeStrings = {"Matematica","Filosofia", "Historia", "Geografia", "Fisica"};

        // Criacao da Lista
        List<String> lista = new ArrayList<>();

        // Tornar Array para Lista
        for (int i = 0; i < 5; ++i) {
            lista.add(arrayDeStrings[i]);
        }

        // Adicao de novas Disciplinas
        lista.add("Geografia");
        lista.add("Lingua Inglesa");

        // Output da lista
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}