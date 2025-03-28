package com.gilDaEsfiha.lanches.models.domain;

public class Lanche {

    private int codigo;
    private String nome;
    private double preco;
    private String imagem;

    public Lanche(int codigo, String nome, double preco, String imagem) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Lanche{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", imagem='" + imagem + '\'' +
                '}';
    }
}
