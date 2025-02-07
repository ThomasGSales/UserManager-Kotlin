# UserManagerApp

Um sistema de gerenciamento de usuários desenvolvido com **Spring Boot** e **Kotlin**. Este projeto permite cadastrar, listar, editar e excluir usuários, utilizando integração com banco de dados e validação de formulários com Thymeleaf.

## Tecnologias Utilizadas

- **Linguagem:** Kotlin
- **Framework Backend:** Spring Boot
- **Banco de Dados:** MySQL
- **Template Engine:** Thymeleaf
- **Frontend:** Bootstrap 5
- **ORM:** Spring Data JPA (Hibernate)

---

## Funcionalidades

- **Cadastro de Usuários:** Preenchimento de formulário com validação de campos (nome, e-mail, senha, CPF e cargo).
- **Listagem de Usuários:** Exibição de uma tabela com todos os usuários cadastrados, incluindo ações de edição e exclusão.
- **Edição de Usuários:** Alteração de informações cadastradas.
- **Exclusão de Usuários:** Remoção de registros com um link direto.

---

## Pré-requisitos

1. **Java 17+** instalado.
2. **Kotlin** configurado no ambiente.
3. **MySQL** rodando localmente.
4. **Maven** para gerenciar dependências.

---

## Configuração do Banco de Dados

Crie uma base de dados no MySQL para o projeto e configure as credenciais no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/<database-name>
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>

