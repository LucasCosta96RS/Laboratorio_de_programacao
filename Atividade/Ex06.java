package Atividade;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        System.out.println("Digite uma frase: ");
        frase = teclado.nextLine();
        System.out.println(frase.substring(0, frase.length() - 1));

    }
}
