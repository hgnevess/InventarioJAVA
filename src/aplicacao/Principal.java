package aplicacao;

import entidades.Produto;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        System.out.println("Informe o nome do produto: ");
        String nome = leitor.nextLine();
        System.out.println("Informe o ID do produto: ");
        int id = leitor.nextInt();
        System.out.println("Informe a quantidade do produto em estoque: ");
        int iqntd = leitor.nextInt();
        System.out.println("Informe o preço do produto: ");
        double ipreco = leitor.nextDouble();

        Produto produto2 = new Produto(id, nome, iqntd, ipreco);
        produto2.setAtivo(false);

        String string = produto2.toString();
        System.out.println(produto2);


    }


}
