package Exercicio1_CA;


import java.util.ArrayList;
import java.util.List;

public class Loja {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Livro("123456789", "Harry Potter e a Pedra Filosofal", 35.90, "J. K. Rowling"));
        produtos.add(new CDs("987654321", "Tuxi Tuxi Hits", 29.99, 12));
        produtos.add(new DVDs("543216789", "Velozes e Furiosos", 9.99, 120));
        produtos.add(new Livro("111222333", "Harry Potter e o Cálice de Fogo", 49.99, "J. K. Rowling"));
        produtos.add(new CDs("444555666", "Classical Symphony", 19.99, 8));

        for(Produto produto : produtos){
            System.out.println("\n[---------------------------------------------------]");
            produto.mostrarDetalhesDoItem();
            System.out.println("[---------------------------------------------------]");
        }

        // Criando duas instâncias idênticas com códigos de barras diferentes
        Produto produto1 = new Livro("123456789", "Java Programming", 59.99, "John Smith");


        for (Produto produto : produtos){
            if (produto.equals(produto1) == true){
                System.out.println("Esse código de barras já está cadastrado em nosso sistema com o seguinte produtos: "
                        + produto.equals(produto1) + " " + produto.toString());
            }
        }
    }
}
