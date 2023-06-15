package Exercicio2_CA;

import java.text.DecimalFormat;

public class TesteDeForma {
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("0.00");

        Forma[] formas = {
                new Retangulo(10.5, 5.7),
                new Circulo(8.9),
                new Quadrado(12.9),
                new Retangulo(7.9, 2.5),
                new Circulo(3.7)
        };

        for (Forma forma : formas) {
            double area = forma.calcularArea();
            double perimetro = forma.calcularPerimetro();

            if (forma instanceof Retangulo) {
                System.out.println("Retângulo - Área: " + formatador.format(area) + ", Perímetro: " + formatador.format(perimetro));
            } else if (forma instanceof Circulo) {
                System.out.println("Círculo - Área: " + formatador.format(area) + ", Perímetro: " + formatador.format(perimetro));
            } else if (forma instanceof Quadrado) {
                System.out.println("Quadrado - Área: " + formatador.format(area) + ", Perímetro: " + formatador.format(perimetro));
            } else {
                System.out.println("Forma desconhecida - Área: " + formatador.format(area) + ", Perímetro: " + formatador.format(perimetro));
            }
        }
    }
}
