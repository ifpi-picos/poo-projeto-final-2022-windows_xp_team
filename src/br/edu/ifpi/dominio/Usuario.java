package br.edu.ifpi.dominio;

public class Usuario {
    private String nome;
    private String email;
    private String dataNasc;
    private Endereco endereco;
    private int id;

    public Usuario(String nome, String email, String dataNasc, Endereco endereco, int id) {
        this.nome = nome;
        this.email = email;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.id = id;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return " Nome: " + this.nome + endereco;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }
    
    

}
