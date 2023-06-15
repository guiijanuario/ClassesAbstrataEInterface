package Exercicio1_CA;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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


        System.out.printf("Digite por favor o código de barras do produto: ");
        String codigoBarras = sc.next();

        System.out.printf("Digite nome do livro: ");
        String nomeLivro = sc.next();

        System.out.printf("Digite o preço do livro: ");
        double precoLivro = sc.nextDouble();

        System.out.printf("Digite o preço do livro: ");
        String autorLivro = sc.next();

        Produto produto1 = new Livro(codigoBarras, nomeLivro, precoLivro, autorLivro);

        for (Produto produto : produtos){
            if (produto.equals(produto1) == true){
                System.out.println("Esse código de barras já está cadastrado em nosso sistema com o seguinte produtos: "
                        + produto.equals(produto1) + " " + produto.toString());
            }
        }
    }
}
