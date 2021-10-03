package TDE03;

import java.util.Random;

public class Ex06 {

    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static void main(String[] args) {

        int [] meses = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int mesEscolhido = getRandom(meses);
        System.out.println(mes [mesEscolhido]);

    }
}
