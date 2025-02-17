Aqui está um modelo de `README.md` para o seu repositório:

```markdown
# API REST com Spring Boot

Este projeto é uma implementação de uma API REST simples utilizando **Spring Boot 3** com **Java 17**. A API permite gerenciar produtos, incluindo operações de listagem e adição de produtos. A API está documentada utilizando **Swagger** para facilitar o uso e testes.

## Tecnologias Utilizadas

- **Java 17**: Versão LTS mais recente da linguagem Java.
- **Spring Boot 3**: Framework para desenvolvimento de aplicações Java com configuração automática.
- **Spring Data JPA**: Acesso fácil e eficiente ao banco de dados.
- **Swagger/OpenAPI**: Documentação automática da API.
- **H2 Database (opcional)**: Banco de dados em memória para armazenar os dados dos produtos.

## Funcionalidades

A API possui os seguintes endpoints:

### 1. **GET /api/produtos**
   - Retorna uma lista de todos os produtos cadastrados na aplicação.
   - **Exemplo de resposta**:
     ```json
     [
       {
         "id": 1,
         "nome": "Produto Exemplo",
         "preco": 29.99
       }
     ]
     ```

### 2. **POST /api/produtos**
   - Permite adicionar um novo produto.
   - **Exemplo de corpo de requisição**:
     ```json
     {
       "nome": "Produto Novo",
       "preco": 49.99
     }
     ```
   - **Exemplo de resposta**:
     ```json
     {
       "id": 2,
       "nome": "Produto Novo",
       "preco": 49.99
     }
     ```

## Como Executar o Projeto

### Requisitos

- **Java 17** ou superior.
- **Maven** para gerenciamento de dependências e build.

### Passos para Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/MichaelDouglasCA/api-rest.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd api-rest
   ```

3. Execute o projeto:
   - Com Maven Wrapper:
     ```bash
     .\mvnw spring-boot:run
     ```

4. A aplicação será executada localmente em `http://localhost:8080`.

### Acessando a Documentação da API (Swagger)

Após a aplicação estar rodando, você pode acessar a documentação da API no Swagger UI em:

```
http://localhost:8080/swagger-ui/
```

## Melhorias Futuras

- **Autenticação**: Implementar autenticação e autorização com Spring Security.
- **Validação de Dados**: Utilizar anotações como `@Valid` para validar os dados de entrada.
- **Deploy**: Realizar o deploy da aplicação em plataformas como Railway ou Heroku.
- **Banco de Dados Relacional**: Configurar um banco de dados relacional real (MySQL/PostgreSQL) ao invés de usar o banco em memória.

## Contribuições

Se você deseja contribuir com o projeto, fique à vontade para enviar um **Pull Request** ou abrir **Issues** com sugestões ou melhorias.

---

Feito com 💙 por [Michael Douglas](https://github.com/MichaelDouglasCA)
```

