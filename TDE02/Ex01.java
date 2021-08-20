package TDE02;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorDesconto;
        double valorProduto;
        double valorComDesconto;
        System.out.println("Qual o valor do produto em R$?");
        valorProduto = teclado.nextDouble();
        System.out.println("Quanto é o desconto a ser aplicado?");
        valorDesconto = teclado.nextInt();
        valorComDesconto = valorProduto - (valorProduto * valorDesconto / 100);
        System.out.println("O valor do produto com desconto de " + valorDesconto + "%" + " é R$" + valorComDesconto);
    }
}
