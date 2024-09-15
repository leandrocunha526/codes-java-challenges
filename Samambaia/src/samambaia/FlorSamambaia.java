package samambaia;

public class FlorSamambaia {
    public static String tentativaDesenhar(int r1, int x1, int y1, int r2, int x2, int y2) {
        // Verifica se o raio do caçador é menor que o da flor
        if (r1 < r2) {
            return "MORTO";
        }

        // Calcula a diferença das coordenadas
        long dx = (long) x2 - x1;
        long dy = (long) y2 - y1;

        // Calcula o quadrado da distância entre os centros
        long distanciaQuadrado = dx * dx + dy * dy;
        long diferencaRaios = (long) r1 - r2;
        long diferencaRaiosQuadrado = diferencaRaios * diferencaRaios;
        if (distanciaQuadrado <= diferencaRaiosQuadrado) {
            return "RICO";
        } else {
            return "MORTO";
        }
    }
}
