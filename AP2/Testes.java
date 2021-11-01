package AP2;

public class Testes {

    public static void main(String[] args) {

        Teclado tc = new Teclado();
        Teclado.entrada = false;
        String textoAmarelo = "\u001B[33m";
        String resetaTexto = "\u001B[0m";

        Object stringLidaSemMsg = tc.lerString();
        System.out.println(textoAmarelo + "O método lerString da classe Teclado retornou: " + resetaTexto + stringLidaSemMsg + "\n");

        Object stringLidaComMsg = tc.lerString("Digite sua string aqui: ");
        System.out.println(textoAmarelo + "O método lerString da classe Teclado retornou: " + resetaTexto + stringLidaComMsg + "\n");

        Object floatLidoSemMsg = tc.lerFloat();
        System.out.println(textoAmarelo + "O método lerFloat da classe Teclado retornou: " + resetaTexto + floatLidoSemMsg + "\n");

        Object floatLidoComMsg = tc.lerFloat("Digite um número aqui: ");
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

        Object emailLidoSemMsg = tc.lerEmail();
        System.out.println(textoAmarelo + "O método lerEmail da classe Teclado retornou: " + resetaTexto + emailLidoSemMsg + "\n");

        Object emailLidoComMsg = tc.lerEmail("Digite seu email aqui: ");
        System.out.println(textoAmarelo + "O método lerEmail da classe Teclado retornou: " + resetaTexto + emailLidoComMsg + "\n");

        Object telefoneLidoSemMsg = tc.lerTelefone();
        System.out.println(textoAmarelo + "O método lerTelefone da classe Teclado retornou: " + resetaTexto + telefoneLidoSemMsg + "\n");

        Object telefoneLidoComMsg = tc.lerTelefone("Digite seu telefone aqui: ");
        System.out.println(textoAmarelo + "O método lerTelefone da classe Teclado retornou: " + resetaTexto + telefoneLidoComMsg + "\n");

        Object dataLidaSemMsg = tc.lerData();
        System.out.println(textoAmarelo + "O método lerData da classe Teclado retornou: " + resetaTexto + dataLidaSemMsg + "\n");

        Object dataLidaComMsg = tc.lerData("Digite uma data aqui: ");
        System.out.println(textoAmarelo + "O método lerData da classe Teclado retornou: " + resetaTexto + dataLidaComMsg + "\n");

        Object trocarDataSemMsg = tc.trocarData();
        System.out.println(textoAmarelo + "O método trocarData da classe Teclado retornou: " + resetaTexto + trocarDataSemMsg + "\n");

        Object trocarDataComMsg = tc.trocarData("Digite uma data para trocar aqui: ");
        System.out.println(textoAmarelo + "O método trocarData da classe Teclado retornou: " + resetaTexto + trocarDataComMsg + "\n");

        Object eNumericoSemMsg = tc.eNumerico();
        System.out.println(textoAmarelo + "O método eNumerico da classe Teclado retornou: " + resetaTexto + eNumericoSemMsg + "\n");

        Object eNumericoComMsg = tc.eNumerico("Digite um número aqui: ");
        System.out.println(textoAmarelo + "O método eNumerico da classe Teclado retornou: " + resetaTexto + eNumericoComMsg + "\n");

    }

}
