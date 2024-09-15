import java.util.Scanner;
import static samambaia.FlorSamambaia.tentativaDesenhar;

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de R1: ");
        int r1 = scanner.nextInt();

        System.out.print("Digite o valor de X1: ");
        int x1 = scanner.nextInt();

        System.out.print("Digite o valor de Y1: ");
        int y1 = scanner.nextInt();

        System.out.print("Digite o valor de R2: ");
        int r2 = scanner.nextInt();

        System.out.print("Digite o valor de X2: ");
        int x2 = scanner.nextInt();

        System.out.print("Digite o valor de Y2: ");
        int y2 = scanner.nextInt();

        // Chamar o método tentativaDesenhar com os valores inseridos
        String resultado = tentativaDesenhar(r1, x1, y1, r2, x2, y2);

        // Exiber o resultado final (RICO ou MORTO)
        System.out.println(resultado);

        // Fechar o scanner
        scanner.close();
}
