package br.edu.ifpi.dominio;

public class AreaCon {
    private String titulo;
    private String descricao;

    public AreaCon(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return " || Tema: " + titulo + " || descricao: " + descricao;
    }
    

}
