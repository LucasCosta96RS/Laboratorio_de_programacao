package TDE03;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        StringBuilder reversa = new StringBuilder();
        frase = teclado.nextLine().replace(" ", "");


        for (int i = frase.length() - 1; i >= 0; i--) {
            reversa.append(frase.charAt(i));
        }
        System.out.println(frase);
        System.out.println(reversa);
        if (reversa.toString().equals(frase)) {
            System.out.println("A palavra é palíndromo");
        }
        else {
            System.out.println("A palavra não é palíndromo");
        }

    }
}
