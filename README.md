# 🚀 Sistema de Gestão de Clientes - API REST (Spring Boot)

API REST desenvolvida com **Spring Boot** para gestão de clientes em um laboratório de calibração, aplicando boas práticas de arquitetura, validação de dados e versionamento de banco.

---

## 💡 Por que este projeto é relevante?

Este projeto simula um sistema real utilizado em empresas, abordando:

* Organização em camadas (Controller, Repository, DTO)
* Separação de responsabilidades
* Persistência com JPA
* Versionamento de banco com Flyway
* Boas práticas utilizadas no mercado backend Java

---

## 🛠️ Tecnologias Utilizadas

* ☕ Java 17
* 🚀 Spring Boot
* 🌐 Spring Web
* 🗄️ Spring Data JPA
* 🐬 MySQL
* 🔄 Flyway
* ⚡ Lombok
* 🧪 JUnit

---

## 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas:

* **Controller** → Entrada das requisições HTTP
* **Repository** → Acesso ao banco de dados
* **DTOs** → Controle de entrada e saída de dados
* **Entities** → Representação das tabelas no banco

---

## 📁 Estrutura do Projeto

```
src/main/java/dina/voll/api/
├── cliente/
│   ├── Cliente.java
│   ├── ClienteRepository.java
│   ├── DadosCadastroCliente.java
│   ├── DadosAtualizacaoCliente.java
│   └── DadosListagemCliente.java
│
├── controller/
│   ├── ClienteController.java
│   └── HelloController.java
│
├── endereco/
│   ├── Endereco.java
│   └── DadosEndereco.java
│
└── ApiApplication.java
```

---

## 🔥 Funcionalidades

* ✅ Cadastro de clientes
* 📋 Listagem de clientes
* ✏️ Atualização de dados
* ❌ Exclusão lógica (soft delete com campo `ativo`)
* 🛡️ Validação de dados nas requisições

---

## 🗃️ Banco de Dados

Gerenciado com **Flyway**, garantindo versionamento e consistência.

Scripts de migração:

```
V1__create-table-cliente.sql
V2__alter-table-clientes-add-column-telefone.sql
V3__alter-table-clientes-add-column-ativo.sql
```

---

## 🌐 Endpoints

| Método | Endpoint       | Descrição         |
| ------ | -------------- | ----------------- |
| GET    | /clientes      | Listar clientes   |
| POST   | /clientes      | Cadastrar cliente |
| PUT    | /clientes      | Atualizar cliente |
| DELETE | /clientes/{id} | Exclusão lógica   |

---

## ▶️ Como Executar o Projeto

### 🔹 Pré-requisitos

* Java 17 ou superior
* MySQL

---

### 🔹 Passos

Clone o repositório:

```
git clone https://github.com/CarlosEduLopes/api-calibracao.git
cd api-calibracao
```

Configure o banco de dados no arquivo `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

Execute o projeto:

```
./mvnw spring-boot:run
```

No Windows:

```
mvnw.cmd spring-boot:run
```

---

## 🧪 Como testar a API

Você pode testar os endpoints utilizando:

* Postman
* Insomnia
* cURL

Exemplo de endpoints:

```
POST   /clientes
GET    /clientes
PUT    /clientes
DELETE /clientes/{id}
```

---

## 🏆 Status do Projeto

🚧 Em evolução contínua

Melhorias planejadas:

* 🔐 Autenticação com JWT
* 📄 Documentação com Swagger
* ☁️ Deploy em nuvem
* 📱 Integração com aplicativo Flutter

---

## 🧠 Diferenciais

✔ Uso de DTOs para desacoplamento
✔ Exclusão lógica (boa prática de mercado)
✔ Versionamento de banco com Flyway
✔ Estrutura pronta para escalar

---

## 👨‍💻 Autor

Desenvolvido por **Carlos Lopes**

---

## 💼 Objetivo

Projeto desenvolvido com foco em evolução profissional e preparação para oportunidades como **Desenvolvedor Backend Java**.

---

## ⭐ Se este projeto te ajudou

Deixe uma estrela no repositório 😉
