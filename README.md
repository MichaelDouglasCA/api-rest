# API REST de Produtos

Este projeto é uma API REST simples construída com **Spring Boot** que gerencia uma entidade chamada **Produto**. A API possui endpoints para listar e adicionar produtos, com uma conexão ao banco de dados utilizando **Spring Data JPA**.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Swagger UI (OpenAPI)**
- **H2 Database (para testes locais)**

## Funcionalidades

### Endpoints da API

- **GET /api/produtos**: Lista todos os produtos cadastrados.
- **POST /api/produtos**: Adiciona um novo produto à lista.

### Exemplo de Respostas:

- **GET /api/produtos**:
  - Retorno: Lista de produtos em formato JSON.
  
- **POST /api/produtos**:
  - Corpo da requisição:
    ```json
    {
      "nome": "Produto Exemplo",
      "preco": 99.99
    }
    ```
  - Resposta:
    ```json
    {
      "id": 1,
      "nome": "Produto Exemplo",
      "preco": 99.99
    }
    ```

## Configuração do Projeto

### Passo 1: Clonando o Repositório

Clone o repositório em sua máquina local:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
