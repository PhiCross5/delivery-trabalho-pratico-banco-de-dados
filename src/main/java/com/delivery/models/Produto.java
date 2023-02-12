package com.delivery.models;

public class Produto {
    private String descricao;
    private int idProduto;
    private double preco;

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getIdProduto(){
        return idProduto;
    }
    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

}
