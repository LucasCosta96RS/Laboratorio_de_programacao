package TDE03;

import java.util.Arrays;

public class Ex08 {

    public static void main(String[] args) {

        int gerador;
        int [] par = new int[10];
        int [] impar = new int[10];
        for (int i = 0; i < 10; i++) {
            gerador = (int) (Math.random() * (20 - 1) + 1);
            if (gerador != 0 && gerador % 2 == 0) {
                par[i] = gerador;
            } else {
                impar[i] = gerador;
            }
        }
        System.out.println(Arrays.toString(par));
        System.out.println(Arrays.toString(impar));
    }


}
