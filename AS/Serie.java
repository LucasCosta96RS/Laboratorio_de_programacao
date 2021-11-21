package AS;

import AP2.Teclado;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Serie {

    public String titulo;
    public String sinopse;
    public int temporadas;
    public int episodios;
    public int questao;
    public boolean visto;
    Teclado tc = new Teclado();
    private Component parentComponent;

    public void lerDados(){
        this.titulo = tc.lerString("Título").toUpperCase().trim();
        this.sinopse = tc.lerString("Sinopse").toUpperCase().trim();
        this.temporadas = tc.lerInt("Temporadas");
        this.episodios = tc.lerInt("Episódios");
        int questao = JOptionPane.showConfirmDialog(parentComponent,
                "Você já viu está série?", null,
                JOptionPane.YES_NO_OPTION);
        if (questao == JOptionPane.NO_OPTION) {
            visto = false;
        } else if(questao == JOptionPane.YES_OPTION) {
           visto = true;
        }
    }

    public void exibirDados(){
        JOptionPane.showMessageDialog(null, "Título: " + this.titulo + "\n" + "Sinopse: " +this.sinopse + "\n" + "Temporadas: " +this.temporadas + "\n" + "Episódios: " + this.episodios);
    }

    public String exibirNome(){
        return this.titulo;
    }

    public Serie() {
    }

    public Serie(String nome) {
        this.titulo = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(titulo, serie.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
