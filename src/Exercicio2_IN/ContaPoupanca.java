package Exercicio2_IN;

public class ContaPoupanca implements Tributavel{
    @Override
    public double calcularTributos() {
        //retonar 0 pois não tem tributos em poupança.
        return 0;
    }
}
