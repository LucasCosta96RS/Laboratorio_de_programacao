package TDE02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08 {

    private static final DecimalFormat dft = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;
        System.out.println("Digite o número que deseja ver a tabuada: ");
        numero = teclado.nextDouble();
        System.out.println(dft.format(numero) + " X 1 = " + dft.format(numero));
        System.out.println(dft.format(numero) + " X 2 = " + dft.format(numero * 2));
        System.out.println(dft.format(numero) + " X 3 = " + dft.format(numero * 3));
        System.out.println(dft.format(numero) + " X 4 = " + dft.format(numero * 4));
        System.out.println(dft.format(numero) + " X 5 = " + dft.format(numero * 5));
        System.out.println(dft.format(numero) + " X 6 = " + dft.format(numero * 6));
        System.out.println(dft.format(numero) + " X 7 = " + dft.format(numero * 7));
        System.out.println(dft.format(numero) + " X 8 = " + dft.format(numero * 8));
        System.out.println(dft.format(numero) + " X 9 = " + dft.format(numero * 9));
        System.out.println(dft.format(numero) + " X 10 = " + dft.format(numero * 10));
    }
}
