import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Criar um arraylist de strings
        ArrayList<String> items = new ArrayList<>();

        // inserir itens no arraylist
        items.add("bola"); // anexa item no final do arraylist
        items.add(0, "feijão"); // insere "feijão" no índice 0
        items.set(0, "arroz"); // substitui o elemento na posição 0

        // exibe o conteúdo do array usando índices
        System.out.print("Acesso ao ArrayList com índices:");

        for (int i = 0; i < items.size(); i++) {
            System.out.printf(" %s", items.get(i)); // acessa o elemento na posição i
        }

        displayArrayList(items, "\nMostrando elementos com foreach:");

        items.add("caneta");
        items.add("borracha");

        displayArrayList(items, "\nMostrando lista com mais dois elementos:");

        items.remove("arroz");

        displayArrayList(items, "\nRemovendo arroz:");

        items.add("bola");

        displayArrayList(items, "\nSegunda bola:");

        items.remove("bola");
        displayArrayList(items, "\nRemovendo bola:");

        items.remove(1);
        displayArrayList(items, "\nRemovendo elemento do índice 1:");
    }

    public static void displayArrayList(ArrayList<String> items, String s) {
        System.out.printf(s);

        for (String item : items) { // para cada item no arraylist items
            System.out.printf(" %s", item); // imprima o item
        }
    }
}
