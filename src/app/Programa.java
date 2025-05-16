package app;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Digite os dados do produto:");

        System.out.print("Nome: ");
        produto.nome = sc.nextLine();

        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        produto.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + produto);

        System.out.println();
        System.out.print("Digite a quantidade de produtos adicionados ao estoque: ");
        int quantidade = sc.nextInt();
        produto.adicionarProdutos(quantidade);

        System.out.println();
        System.out.print("Digite a quantidade de produtos removidos do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        sc.close();

    }
}
