package org.example.model;

public class Produto {

    private Long id;
    private String nome;
    private String descricao;
    private Float preco;
    private Integer quantidadeEmEstoque;
    }

public Produto(Long id, String nome, String descricao, Float preco, Integer quantidadeEmEstoque){

    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
    this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Long getId() {
    return id;
}

    public void setId(Long id) {
    this.id = id;
}

    public String getNome() {
    return nome;
}

    public void setNome(String nome) {
    this.nome = nome;
}

    public String getDescricao() {
    return descricao;
}

    public void setDescricao(String descricao) {
    this.descricao = descricao;
}

    public Float getPreco() {return preco;}

    public void setPreco(String preco) {this.preco = preco;}

    public Integer getQuantidadeEmEstoque() {return quantidadeEmEstoque; }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {this.quantidadeEmEstoque = quantidadeEmEstoque;}

}


