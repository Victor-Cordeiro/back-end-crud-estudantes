# API de Cadastro de Estudantes - Spring Boot

Esta é uma API REST desenvolvida com **Spring Boot** para gerenciamento de estudantes. A API permite a realização de operações de CRUD (Criar, Ler, Atualizar e Deletar) para o gerenciamento dos dados de estudantes em um banco de dados PostgreSQL.

## Funcionalidades

- **GET /estudantes**: Retorna a lista de todos os estudantes.
- **POST /estudantes**: Adiciona um novo estudante.
- **PUT /estudantes/{id}**: Atualiza os dados de um estudante existente.
- **DELETE /estudantes/{id}**: Deleta um estudante pelo ID.
- **GET /estudantes/{id}**: Obtém os detalhes de um estudante específico pelo ID.

## Tecnologias

- **Spring Boot**: Framework Java para desenvolvimento de APIs RESTful.
- **JPA (Java Persistence API)**: Para interação com o banco de dados.
- **PostgreSQL**: Banco de dados relacional para armazenamento dos dados dos estudantes.
- **Lombok**: Biblioteca Java para reduzir boilerplate code (ex.: getters, setters, construtores).

## Pré-requisitos

- **Java 11 ou superior**.
- **Maven** para gerenciamento de dependências.
- **PostgreSQL** instalado e configurado no seu sistema.

## Configuração do Banco de Dados

Certifique-se de que o banco de dados PostgreSQL está rodando na sua máquina e configure a URL do banco de dados no arquivo `application.properties` conforme abaixo:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/estudantes
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.jpa.hibernate.ddl-auto=update



A API estará disponível em: http://localhost:8080
