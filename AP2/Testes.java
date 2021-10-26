package AP2;

public class Testes {

    public static void main(String[] args) {

        Teclado tc = new Teclado();
        String textoAmarelo = "\u001B[33m";
        String resetaTexto = "\u001B[0m";


        Object stringLidaSemMsg = tc.lerString();
        System.out.println(textoAmarelo + "O método lerString da classe Teclado retornou: " + resetaTexto + stringLidaSemMsg + "\n");

        Object stringLidaComMsg = tc.lerString("Digite uma mensagem aqui: ");
        System.out.println(textoAmarelo + "O método lerString da classe Teclado retornou: " + resetaTexto + stringLidaComMsg + "\n");

        Object floatLidoSemMsg = tc.lerFloat();
        System.out.println(textoAmarelo + "O método lerFloat da classe Teclado retornou: " + resetaTexto + floatLidoSemMsg + "\n");

        Object floatLidoComMsg = tc.lerFloat("Digite um número flutuante aqui: ");
        System.out.println(textoAmarelo + "O método lerFloat da classe Teclado retornou: " + resetaTexto + floatLidoComMsg + "\n");

        Object doubleLidoSemMsg = tc.lerDouble();
        System.out.println(textoAmarelo + "O método lerDouble da classe Teclado retornou: " + resetaTexto + doubleLidoSemMsg + "\n");

        Object doubleLidoComMsg = tc.lerDouble("Digite um número aqui: ");
        System.out.println(textoAmarelo + "O método lerDouble da classe Teclado retornou: " + resetaTexto + doubleLidoComMsg + "\n");

        Object intLidoSemMsg = tc.lerInt();
        System.out.println(textoAmarelo + "O método lerInt da classe Teclado retornou: " + resetaTexto + intLidoSemMsg  + "\n");

        Object intLidoComMsg = tc.lerInt("Digite um número aqui: ");
        System.out.println(textoAmarelo + "O método lerInt da classe Teclado retornou: " + resetaTexto + intLidoComMsg  + "\n");

        Object charLidoSemMsg = tc.lerChar();
        System.out.println(textoAmarelo + "O método lerChar da classe Teclado retornou: " + resetaTexto + charLidoSemMsg + "\n");

        Object charLidoComMsg = tc.lerChar("Digite um carácter aqui: ");
        System.out.println(textoAmarelo + "O método lerChar da classe Teclado retornou: " + resetaTexto + charLidoComMsg + "\n");

        Object emailLido = tc.lerEmail();
        System.out.println(textoAmarelo + "O método lerEmail da classe Teclado retornou: " + resetaTexto + emailLido + "\n");

        Object telefoneLido = tc.lerTelefone();
        System.out.println(textoAmarelo + "O método lerTelefone da classe Teclado retornou: " + resetaTexto + telefoneLido + "\n");

        Object dataLida = tc.lerData();
        System.out.println(textoAmarelo + "O método lerData da classe Teclado retornou: " + resetaTexto + dataLida + "\n");

        Object trocarData = tc.trocarData();
        System.out.println(textoAmarelo + "O método trocarData da classe Teclado retornou: " + resetaTexto + trocarData + "\n");

        Object eNumerico = tc.eNumerico();
        System.out.println(textoAmarelo + "O método eNumerico da classe Teclado retornou: " + resetaTexto + eNumerico + "\n");

    }

}
