public class InitArray {
    public static void main(String[] args) {
        // declara um vetor de int e inicializa com tamanho 10
        int[] intArray = new int[10];

        // Imprime um cabeçalho - Índice Valro
        System.out.printf("%s%8s\n", "Índice", "Valor");

        // para cada item do vetor (vetor.length -> tamanho do vetor)
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("%6d%8d\n", i, intArray[i]); // imprime o índice e o conteúdo
        }
    }
}
