package Atividade;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        System.out.println("Digite uma frase: ");
        frase = teclado.nextLine().toUpperCase();
        if (frase.contains("SEXO") || frase.contains("SEXUAL")) {
            System.out.println("Conteúdo impróprio");
        } else {
            System.out.println("conteúdo liberado");
        }
    }

}
