package br.edu.ifpi.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private String dataPub;
    private int qtdCopias;
    private AreaCon areaCon;

    public Livro(String titulo, String autor, String dataPub, int qtdCopias, AreaCon areaCon) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataPub = dataPub;
        this.qtdCopias = qtdCopias;
        this.areaCon = areaCon;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataPub() {
        return dataPub;
    }

    public void setDataPub(String dataPub) {
        this.dataPub = dataPub;
    }

    public int getQtdCopias() {
        return qtdCopias;
    }

    public void setQtdCopias(int qtdCopias) {
        this.qtdCopias = qtdCopias;
    }

    public AreaCon getAreaCon() {
        return areaCon;
    }

    public void setAreaCon(AreaCon areaCon) {
        this.areaCon = areaCon;
    }

}