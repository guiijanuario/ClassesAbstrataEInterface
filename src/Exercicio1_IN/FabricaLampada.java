package Exercicio1_IN;

public class FabricaLampada {
    public Lampada construir(String tipo) {
        if (tipo.equalsIgnoreCase("incandescente")) {
            return new Incandescente();
        } else if (tipo.equalsIgnoreCase("fluorescente")) {
            return new Fluorescente();
        } else {
            throw new IllegalArgumentException("Tipo de lâmpada inválido.");
        }
    }
}
