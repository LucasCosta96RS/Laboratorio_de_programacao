package Atividade;

import static java.lang.Thread.*;

public class Ex01 {

    public static void main(String[] args) throws InterruptedException {
        final int FACES = 6;
        final int VEZES = 3;
        int sorteio, total = 0;

        System.out.println("Bem vindo a jogada de dado!");
        sleep(2000);
        System.out.println("Em seguida um dado irá ser jogado 3 vezes e irá ser apresentado na tela os resultados de cada jogada e a soma de todas as jogadas. ");
        sleep(4000);
        for (int i = 0; i < VEZES; i++) {
            sorteio = (int) (Math.random() * FACES + 1);
            total += sorteio;
            System.out.println("O dado girou o valor: " + sorteio);
            sleep(2000);
        }
        System.out.println("Os valores somados são iguais a: " + total);

    }
}
