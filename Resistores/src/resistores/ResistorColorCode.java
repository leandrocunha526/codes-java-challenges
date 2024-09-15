package resistores;

import java.util.HashMap;
import java.util.Map;

public class ResistorColorCode {

    // Mapeamento dos números para as cores correspondentes e seus códigos ANSI
    private static final Map<Integer, String> colorMap = new HashMap<>();
    private static final Map<Integer, String> colorAnsiMap = new HashMap<>();

    static {
        colorMap.put(0, "preto");
        colorMap.put(1, "marrom");
        colorMap.put(2, "vermelho");
        colorMap.put(3, "laranja");
        colorMap.put(4, "amarelo");
        colorMap.put(5, "verde");
        colorMap.put(6, "azul");
        colorMap.put(7, "violeta");
        colorMap.put(8, "cinza");
        colorMap.put(9, "branco");

        // Mapeamento das cores para os códigos ANSI para colorir o terminal
        colorAnsiMap.put(0, "\u001B[30m");  // preto
        colorAnsiMap.put(1, "\u001B[31m");  // marrom (representado como vermelho)
        colorAnsiMap.put(2, "\u001B[91m");  // vermelho
        colorAnsiMap.put(3, "\u001B[93m");  // laranja (amarelo brilhante)
        colorAnsiMap.put(4, "\u001B[33m");  // amarelo
        colorAnsiMap.put(5, "\u001B[32m");  // verde
        colorAnsiMap.put(6, "\u001B[34m");  // azul
        colorAnsiMap.put(7, "\u001B[35m");  // violeta
        colorAnsiMap.put(8, "\u001B[90m");  // cinza (cinza escuro)
        colorAnsiMap.put(9, "\u001B[97m");  // branco
    }

    // Reset ANSI code
    private static final String ANSI_RESET = "\u001B[0m";

    public static String getResistorColors(String resistorValue) {
        resistorValue = resistorValue.replace(" ohms", "");
        double value;
        int multiplier = 0;

        // Detectar se é kOhms ou MOhms
        if (resistorValue.endsWith("k")) {
            value = Double.parseDouble(resistorValue.replace("k", "")) * 1000;
        } else if (resistorValue.endsWith("M")) {
            value = Double.parseDouble(resistorValue.replace("M", "")) * 1000000;
        } else {
            value = Double.parseDouble(resistorValue);
        }

        int intValue = (int) value;
        String significantFigures = String.valueOf(intValue);
        if (significantFigures.length() > 2) {
            multiplier = significantFigures.length() - 2;
            significantFigures = significantFigures.substring(0, 2);
        }

        int firstDigit = Character.getNumericValue(significantFigures.charAt(0));
        int secondDigit = Character.getNumericValue(significantFigures.charAt(1));

        String firstColor = colorMap.get(firstDigit);
        String secondColor = colorMap.get(secondDigit);
        String multiplierColor = colorMap.get(multiplier);

        String firstAnsi = colorAnsiMap.get(firstDigit);
        String secondAnsi = colorAnsiMap.get(secondDigit);
        String multiplierAnsi = colorAnsiMap.get(multiplier);

        // Tolerância sempre é dourada (5%)
        String toleranceColor = "dourado";
        String toleranceAnsi = "\u001B[33m"; // ANSI amarelo para dourado

        // Retornar sequência de cores com ANSI codes
        return String.format("%s%s %s%s %s%s %s%s%s",
                firstAnsi, firstColor,
                secondAnsi, secondColor,
                multiplierAnsi, multiplierColor,
                toleranceAnsi, toleranceColor,
                ANSI_RESET);
    }
}
