package aula4;

import ferramentas.Entrada;

public class AreaQuadrado {

    public static void main(String[] args) {

        double altura = Entrada.leiaDouble("Altura do quadrado:");
        double base = Entrada.leiaDouble("Altura do quadrado:");

        double area = calcularArea(altura, base);

        System.out.printf("Área: %.2f\n", area);

        System.exit(0);
    }

    private static double calcularArea(double h, double b) {
        double calc = h * b;
        return calc;
    }

}
