package br.edu.ifpi.dominio;

public class Emprestimo {
    private String dataEmprestimo;
    private String dataDevolucao;
    private Livro livro;
    private Usuario usuario;


    public Emprestimo(String dataEmprestimo, String dataDevolucao,Livro livro, Usuario usuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
        this.usuario = usuario;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Contrato feito:  Data do Emprestimo: " + dataEmprestimo + "|| Data da Devolução=" + dataDevolucao + "|| LIVRO=" + livro
                + "|| USÚARIO=" + usuario;
    }

    

}
