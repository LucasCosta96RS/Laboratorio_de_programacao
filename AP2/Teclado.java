package AP2;

import java.util.Scanner;
import java.util.regex.Pattern;

/** Lê os inputs do teclado e retorna uma informação */
public class Teclado {

    private static final Scanner tc = new Scanner(System.in);
    private static final Pattern padrao_de_email = Pattern.compile("^[_a-zA-Z0-9-]+@[a-zA-Z0-9-]+\\.*[a-zA-Z]{2,}+\\.*[a-zA-Z]{2,}$", Pattern.CASE_INSENSITIVE);
    private static final Pattern padrao_de_telefone = Pattern.compile("^[1-9]{2}[-][9]?[0-9]{8}$");
    private static final Pattern padrao_de_data = Pattern.compile("^([0-9]{2})[/]([0-9]{2})[/]([0-9]{4})$");

    /** Lê uma string e retorna a string
     * @return String */
    public String lerString() {
            System.out.println("Digite uma frase: ");
            return tc.nextLine();
    }

    /** Lê uma string e retorna a string
     * @return String */
    public String lerString(String msg) {
        System.out.println(msg);
        return tc.nextLine();
    }

    /** Lê um número flutuante e retorna o número flutuante
     * @return float */
    public float lerFloat() {
        System.out.println("Digite um número flutuante: ");
        while (!tc.hasNextFloat()) {
            tc.next();
            System.out.println("Apenas números flutuantes permitidos, digite novamente: ");
        }
        return tc.nextFloat();
    }

    /** Lê um número flutuante e retorna o número flutuante
     * @return float */
    public float lerFloat(String msg) {
        System.out.println(msg);
        while (!tc.hasNextFloat()) {
            tc.next();
            System.out.println("Apenas números flutuantes permitidos, digite novamente: ");
        }
        return tc.nextFloat();
    }

    /** Lê um número double e retorna o número double
     * @return double */
    public double lerDouble() {
        System.out.println("Digite um número Double: ");
        while (!tc.hasNextDouble()) {
            tc.next();
            System.out.println("Apenas números permitidos, digite novamente: ");
        }
        return tc.nextDouble();
    }

    /** Lê um número double e retorna o número double
     * @return double */
    public double lerDouble(String msg) {
        System.out.println(msg);
        while (!tc.hasNextDouble()) {
            tc.next();
            System.out.println("Apenas números permitidos, digite novamente: ");
        }
        return tc.nextDouble();
    }

    /** Lê um número inteiro e retorna o número inteiro
     * @return int */
    public int lerInt() {
        System.out.println("Digite um número inteiro: ");
        while (!tc.hasNextInt()) {
            tc.next();
            System.out.println("Apenas números permitidos, digite novamente: ");
        }
        return tc.nextInt();
    }

    /** Lê um número inteiro e retorna o número inteiro
     * @return int */
    public int lerInt(String msg){
        System.out.println(msg);
        while (!tc.hasNextInt()) {
            tc.next();
            System.out.println("Apenas números permitidos, digite novamente: ");
        }
        return tc.nextInt();
    }

    /** Lê um carácter e retorna o carácter
     * @return char */
    public char lerChar() {
        System.out.println("Digite um Carácter: ");
        return tc.next().charAt(0);
    }

    /** Lê um carácter e retorna o carácter
     * @return char */
    public char lerChar(String msg) {
        System.out.println(msg);
        return tc.next().charAt(0);
    }

    /** Lê um e-mail e retorna o e-mail se for válido ou null se for inválido
     * @return email ou null */
    public String lerEmail() {
        tc.nextLine(); // Consome o resto da linha anterior
        System.out.println("Digite seu E-mail: ");
        String email = tc.nextLine();
        if (padrao_de_email.matcher(email).matches()) {
            return email;
        }
        else {
            return null;
        }
    }

    /** Lê um telefone e retorna o telefone se for válido ou null se for inválido
     * @return telefone ou null */
    public String lerTelefone() {
        System.out.println("Digite seu Telefone no padrão DDD-XXXXXXXXX: ");
        String telefone = tc.nextLine();
        if (padrao_de_telefone.matcher(telefone).matches()) {
            return telefone;
        }
        else {
            return null;
        }
    }

    /** Lê uma data e retorna a data se for válida ou null se for inválida
     * @return data ou null */
    public String lerData() {
        System.out.println("Digite sua data no padrão DD/MM/AAAA: ");
        String data = tc.nextLine();
        if (padrao_de_data.matcher(data).matches()) {
            return data;
        }
        else {
            return null;
        }
    }

    /** Lê uma data no formato DD/MM/AAAA e troca para MM/DD/AAAA
     * @return data ou null */
    public String trocarData() {
        System.out.println("Digite uma data no padrão DD/MM/AAAA para trocar para MM/DD/AAAA: ");
        String data = tc.nextLine();
        if (padrao_de_data.matcher(data).matches()) {
            return data.replaceFirst(String.valueOf(padrao_de_data), "$2/$1/$3");
        }
        else {
            return null;
        }
    }

    /** Lê uma string e retorna "É Numérico" se for um número ou "Não é numérico" se não for um número
     * @return String */
    public String eNumerico() {
        System.out.println("Digite um número: ");
        String numero = tc.next();
        try {
            Double.parseDouble(numero);
            return "É Numérico!";
        } catch (Exception E) {
            return "Não é numérico!";
        }
    }

}


