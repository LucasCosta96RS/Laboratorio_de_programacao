package Atividade;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        StringBuilder fraseInvertida = new StringBuilder();

        System.out.println("Digite sua frase: ");
        frase = teclado.nextLine();
        for (int i = frase.trim().length() -1; i >= 0; i--) {
            fraseInvertida.append(frase.charAt(i));
        }
        System.out.println("A frase invertida é: " + fraseInvertida.toString().replace(" ",""));
    }
}
