package TDE03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String [] estacionamento = new String [10];
        String placa;
        int vaga;
        int digitado = 0;
        System.out.println(" Digite 1 para entrada \n Digite 2 para saída \n Digite 3 para mostrar vagas \n Digite 4 para fechar o programa.");
        while (digitado != 4) {
            digitado = tc.nextInt();
            if (digitado == 1) {
                System.out.println("Digite o número da vaga desejada: ");
                vaga = tc.nextInt();
                System.out.println("Digite sua placa: ");
                placa = tc.next();
                estacionamento [vaga] = placa;
            }
            if (digitado == 2) {
                System.out.println("Digite o número da vaga que deseja liberar: ");
                vaga = tc.nextInt();
                estacionamento[vaga] = "";
            }
            if (digitado == 3) {
                System.out.println(Arrays.toString(estacionamento));
            }
            System.out.println(" Digite 1 para entrada \n Digite 2 para saída \n Digite 3 para mostrar vagas \n Digite 4 para fechar o programa.");
        }

    }
}
