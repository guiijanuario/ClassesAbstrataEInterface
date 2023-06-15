package Exercicio1_CA;

public class DVDs extends Produto{

    private double duracao;

    public DVDs(String codigoBarras, String nome, double preco, double duracao) {
        super(codigoBarras, nome, preco);
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println(" O titulo deste DVD é: " + this.getNome());
        System.out.println(" O preço deste DVD é: " + this.getPreco());
        System.out.println(" A duração deste filme é de: " + this.getDuracao());
    }
}
