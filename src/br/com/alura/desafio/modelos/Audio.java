package br.com.alura.desafio.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int TotalCurtidas;
    private int classificacao;

    public void curte() {
        this.TotalCurtidas++;
    }

    public void reproduzir() {
        this.totalDeReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return TotalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
