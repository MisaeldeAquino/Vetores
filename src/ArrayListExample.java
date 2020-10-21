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

        System.out.printf("\nMostrando elementos com foreach:");

        for (String item : items) { // para cada item no arraylist items
            System.out.printf(" %s", item); // imprima o item
        }
    }
}
