package Exercicio1_CA;

public class CDs extends Produto{

    private Integer nroFaixas;

    public CDs(String codigoBarras, String nome, double preco, Integer nroFaixas) {
        super(codigoBarras, nome, preco);
        this.nroFaixas = nroFaixas;
    }

    public Integer getNroFaixas() {
        return nroFaixas;
    }

    public void setNroFaixas(Integer nroFaixas) {
        this.nroFaixas = nroFaixas;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println(" O nome do CD é: " + this.getNome());
        System.out.println(" O preço deste CD é: " + this.getPreco());
        System.out.println(" Este CD tem " + this.getNroFaixas() + " números de faixas.");
    }
}
