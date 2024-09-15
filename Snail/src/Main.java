import java.util.List;
import java.util.Scanner;
import static Snail.SpiralMatrix.spiralOrder;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada dinâmica de tamanho da matriz
    System.out.print("Digite o número de linhas da matriz: ");
    int rows = scanner.nextInt();
    System.out.print("Digite o número de colunas da matriz: ");
    int cols = scanner.nextInt();

    // Inicializa a matriz
    int[][] matrix = new int[rows][cols];

    // Preenche a matriz dinamicamente
    System.out.println("Digite os elementos da matriz:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            matrix[i][j] = scanner.nextInt();
        }
    }

    // Imprime a matriz
    System.out.println("Matriz fornecida:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }

    // Obtenção da ordem em espiral
    List<Integer> spiralOrder = spiralOrder(matrix);
    System.out.println("Ordem em espiral: " + spiralOrder);
}
