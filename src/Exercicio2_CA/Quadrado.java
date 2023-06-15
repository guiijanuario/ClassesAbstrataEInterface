package Exercicio2_CA;

public class Quadrado extends Retangulo{
    public Quadrado(double lado) {
        super(lado, lado);
    }


    @Override
    public double calcularArea() {
        return this.getLado() * this.getLado();
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (this.getLado() + this.getLado());
    }

}
