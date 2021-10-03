package TDE03;

import java.util.Arrays;

public class Ex07 {

    public static void main(String[] args) {

        int altura = 40;
        int largura = 40;
        int[][] imagem = new int[altura][largura];
        for (int i = 0; i < altura; i++) {
            imagem[altura][largura] = (int) (Math.random() * 255);
            System.out.println(Arrays.deepToString(imagem));
            for (int j = 0; j < largura; j++) {
                imagem[altura][largura] = (int) (Math.random() * 255);
                System.out.println(Arrays.deepToString(imagem));
            }


        }


    }
}
