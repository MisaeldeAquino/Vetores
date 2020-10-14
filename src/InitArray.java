public class InitArray {
    public static void main(String[] args) {
        // declara uma constante com o tamanho do vetor
        final int ARRAY_LENGTH = 10;  // constante como caixa alta e SERPENT_CASE
        int[] intArray = new int[ARRAY_LENGTH];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 2 + 2 * i;
        }

        // Imprime um cabeçalho - Índice Valro
        System.out.printf("%s%8s\n", "Índice", "Valor");

        // para cada item do vetor (vetor.length -> tamanho do vetor)
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("%6d%8d\n", i, intArray[i]); // imprime o índice e o conteúdo
        }
    }
}
