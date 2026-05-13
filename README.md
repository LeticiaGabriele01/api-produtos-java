# API de Gerenciamento de Produtos 📦

Esta é uma API REST desenvolvida em **Java** utilizando o framework **Spring Boot**. O projeto foi criado como parte dos estudos de desenvolvimento backend para gerenciar um catálogo de produtos.

## 🚀 Funcionalidades

- **Modelo de Dados Completo**: Suporte para ID, Nome, Descrição, Preço e Quantidade em Stock.
- **Arquitetura em Camadas**: Organização clara entre pacotes de modelo (`model`), serviço (`service`) e execução principal.
- **Injeção de Dependências**: Utilização do ecossistema Spring para gestão de componentes.
- **Gestão de Dependências**: Configurado com **Maven** para facilitar a compilação e execução.

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java 17.
- **Framework**: Spring Boot.
- **Gerenciador de Dependências**: Maven.

## 📂 Estrutura do Projeto

```text
src/main/java/org/example/
├── Main.java             # Ponto de entrada da aplicação Spring Boot
├── model/
│   └── Produto.java      # Classe de entidade que representa o produto
└── service/
    └── ProdutoService.java   # Lógica de negócio e manipulação de dados
