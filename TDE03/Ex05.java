package TDE03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] notas = new int[5];
        int [] notasDecrescente;
        int media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota:");
            notas[i] = teclado.nextInt();
            media += notas[i];
        }
        notasDecrescente = Arrays.stream(notas).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(notasDecrescente));
        System.out.println(media);
    }
}
