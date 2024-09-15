import java.util.Scanner;

import static resistores.ResistorColorCode.getResistorColors;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o valor do resistor (por exemplo, 47 ohms, 1k ohms, 1M ohms): ");
    String resistorValue = scanner.nextLine();
    String colors = getResistorColors(resistorValue);
    System.out.println("Cores do resistor: " + colors);

    scanner.close();
}
