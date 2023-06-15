package Exercicio1_CA;

import java.util.List;

abstract class Produto {
    private String codigoBarras;
    private String nome;
    private double preco;

    public Produto(String codigoBarras, String nome, double preco) {
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void mostrarDetalhesDoItem();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Produto other = (Produto) obj;
        return codigoBarras.equals(other.getCodigoBarras());
    }

    @Override
    public String toString() {
        return "Código de Barras: " + getCodigoBarras() + "\n" +
                "Nome: " + getNome() + "\n" +
                "Preço: " + getPreco();
    }

    public static void buscarProduto(List<Produto> produtos, Produto produto) {
        int index = produtos.indexOf(produto);
        if (index != -1) {
            System.out.println("[--------------------------------------------------]");
            System.out.println(" O produto está na posição " + index + " da lista.");
            System.out.println(produto.toString());
            System.out.println("[--------------------------------------------------]");
        } else {
            System.out.println("O produto não foi encontrado na lista.");
        }
    }
}
