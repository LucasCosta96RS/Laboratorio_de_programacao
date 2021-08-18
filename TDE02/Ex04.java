package TDE02;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        int anoDeContribuicao;
        int anosFaltantesContribuicao;
        String sexo;
        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt();
        System.out.println("Digite seu sexo[M/F] : ");
        sexo = teclado.next().toUpperCase();
        System.out.println("Digite a quantidade de anos de contribuição: ");
        anoDeContribuicao = teclado.nextInt();
        if (sexo.equals("M") && idade >= 65) {
            System.out.println("Você já tem o direito a aposentadoria!");
        }else if (sexo.equals("M") && anoDeContribuicao < 35) {
            anosFaltantesContribuicao = 35 - anoDeContribuicao;
            System.out.println("ainda faltam " + anosFaltantesContribuicao + " anos para você ter direito a sua aposentadoria.");
        }
        if (sexo.equals("F") && idade >= 60) {
            System.out.println("Você já tem o direito a aposentadoria!");
        }else if (sexo.equals("F") && anoDeContribuicao < 35) {
            anosFaltantesContribuicao = 30 - anoDeContribuicao;
            System.out.println("ainda faltam " + anosFaltantesContribuicao + " anos para você ter direito a sua aposentadoria.");
        }
    }
}
