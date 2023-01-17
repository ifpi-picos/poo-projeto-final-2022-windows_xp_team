package br.edu.ifpi.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private String dataPub;
    private int qtdCopias, id;
    private AreaCon areaCon;

    public Livro(String titulo, String autor, String dataPub, int qtdCopias, AreaCon areaCon, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataPub = dataPub;
        this.qtdCopias = qtdCopias;
        this.areaCon = areaCon;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return " Titulo do Livro: " + titulo+ " || Quantidade de copias: "+qtdCopias+areaCon+ " || Id: "+id;
    }

    

    

}