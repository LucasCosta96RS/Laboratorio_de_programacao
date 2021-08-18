package TDE02;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double resistencia1;
        double resistencia2;
        double resistencia3;
        double resistencia4;
        double resistenciaEquivalente;
        System.out.println("Digite o valor da primeira resistência: ");
        resistencia1 = teclado.nextDouble();
        System.out.println("Digite o valor da segunda resistência: ");
        resistencia2 = teclado.nextDouble();
        System.out.println("Digite o valor da terceira resistência: ");
        resistencia3 = teclado.nextDouble();
        System.out.println("Digite o valor da quarta resistência: ");
        resistencia4 = teclado.nextDouble();
        resistenciaEquivalente = resistencia1 + resistencia2 + resistencia3 + resistencia4;
        if (resistencia1 > resistencia2 && resistencia1 > resistencia3 && resistencia1 > resistencia4) {
            System.out.println("A resistência " + resistencia1 + " é a maior resistência.");
        } else if (resistencia2 > resistencia1 && resistencia2 > resistencia3 && resistencia2 > resistencia4) {
            System.out.println("A resistência " + resistencia2 + " é a maior resistência.");
        } else if (resistencia3 > resistencia1 && resistencia3 > resistencia2 && resistencia3 > resistencia4) {
            System.out.println("A resistência " + resistencia3 + " é a maior resistência.");
        } else if (resistencia4 > resistencia1 && resistencia4 > resistencia2 && resistencia4 > resistencia3) {
            System.out.println("A resistência " + resistencia4 + " é a maior resistência.");
        }
        if (resistencia1 < resistencia2 && resistencia1 < resistencia3 && resistencia1 < resistencia4) {
            System.out.println("A resistência " + resistencia1 + " é a menor resistência.");
        } else if (resistencia2 < resistencia1 && resistencia2 < resistencia3 && resistencia2 < resistencia4) {
            System.out.println("A resistência " + resistencia2 + " é a menor resistência.");
        } else if (resistencia3 < resistencia1 && resistencia3 < resistencia2 && resistencia3 < resistencia4) {
            System.out.println("A resistência " + resistencia3 + " é a menor resistência.");
        } else if (resistencia4 < resistencia1 && resistencia4 < resistencia2 && resistencia4 < resistencia3) {
            System.out.println("A resistência " + resistencia4 + " é a menor resistência.");
        }
        System.out.println("A resistência equivalente é de: " + resistenciaEquivalente);
    }
}