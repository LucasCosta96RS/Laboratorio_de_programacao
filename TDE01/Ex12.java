package TDE01;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso;
        double pesoLua;
        System.out.println("Digite o seu peso:");
        peso = teclado.nextDouble();
        pesoLua = peso * 0.17;
        System.out.println("O seu peso na lua é: " + pesoLua);
    }
}
