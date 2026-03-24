package org.example.service;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private final List<Produto> produtos = new ArrayList<>();

    public ProdutoService(){
        produtos.add(new Produto(1,"Mouse", "Perifericos", "30.00", ""))
    }
}
