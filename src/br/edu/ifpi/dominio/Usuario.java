package br.edu.ifpi.dominio;

public class Usuario {
    private String nome;
    private String email;
    private String dataNasc;
    private Endereco endereco;
    private int qtdUsuarios;

    public Usuario(String nome, String email, String dataNasc, Endereco endereco, int qtdUsuarios) {
        this.nome = nome;
        this.email = email;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.qtdUsuarios = qtdUsuarios;
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

    
    public int getQtdUsuarios() {
        return qtdUsuarios;
    }

    public void setQtdUsuarios(int qtdUsuarios) {
        this.qtdUsuarios = qtdUsuarios;
    }
    

    @Override
    public String toString() {
        return "Nº: "+(this.qtdUsuarios - 1)+" Nome: " + this.nome;
    }
    
    

}
