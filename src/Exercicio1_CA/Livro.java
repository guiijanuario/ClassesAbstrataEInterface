package Exercicio1_CA;

public class Livro extends Produto {

    private String autor;

    public Livro(String codigoBarras, String nome, double preco, String autor) {
        super(codigoBarras, nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println(" O nome do livro é: " + this.getNome());
        System.out.println(" O preço deste livro é: " + this.getPreco());
        System.out.println(" O autor do livro é: " + this.getAutor());
    }
}
