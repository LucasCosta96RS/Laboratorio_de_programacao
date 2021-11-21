package AS;

import AP2.Teclado;

import javax.swing.*;
import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {

        Teclado tc = new Teclado();
        Teclado.entrada = false;
        int op;
        ArrayList<Serie> series = new ArrayList<>();


        do {
            op = tc.lerInt("""
                    Digite 1 para adicionar uma série\s
                    Digite 2 para remover uma série
                    Digite 3 para listar as séries vistas
                    Digite 4 para pesquisar pelo nome de uma série
                    Digite 5 para mostrar a quantidade de séries
                    Digite 6 para sair do programa
                    """);
            switch (op) {
                case 1 -> {
                    Serie serie = new Serie();
                    serie.lerDados();
                    series.add(serie);
                }
                case 2 -> {
                    if (series.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ainda não existem séries na lista");
                    } else {
                        String nome = tc.lerString("Digite o nome da série").toUpperCase().trim();
                        Serie apagar = new Serie(nome);
                        if (series.contains(apagar)) {
                            series.remove(apagar);
                            JOptionPane.showMessageDialog(null, "Série removida");
                        } else {
                            JOptionPane.showMessageDialog(null, "A série não existe na lista");
                        }
                    }
                }
                case 3 -> {
                    if (series.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ainda não existem séries na lista");
                    } else {
                        for (Serie serie : series) {
                            if (serie.visto) {
                                serie.exibirDados();
                            }
                        }
                    }
                }
                case 4 -> {
                    if (series.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ainda não existem séries na lista");
                    } else {
                        String nome = tc.lerString("Digite o nome da série").toUpperCase().trim();
                        Serie busca = new Serie(nome);
                        if (series.contains(busca)) {
                            for (Serie serie : series) {
                                if (series.contains(busca) && serie.equals(busca)) {
                                    serie.exibirDados();
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "A série não existe na lista");
                        }
                    }
                }
                case 5 -> {
                    int contador = 0;
                    for (Serie serie : series) {
                        if (serie != null) {
                            contador += 1;
                        }
                    }
                    if (contador == 0) {
                        JOptionPane.showMessageDialog(null, "Ainda não existem séries na lista");
                    } else if (contador == 1) {
                        JOptionPane.showMessageDialog(null, "Existe " + contador + " série na lista");
                    } else if (contador > 1) {
                        JOptionPane.showMessageDialog(null, "Existem " + contador + " séries na lista");
                    }
                }
            }
        } while (op != 6);
    }
}
