package Exercicio1_IN;

public class Incandescente implements Lampada{
    @Override
    public void ligar() {
        System.out.println(" Lâmpada incandescente ligada.");
    }

    @Override
    public void desligar() {
        System.out.println(" Lâmpada incandescente desligada.");
    }
}
