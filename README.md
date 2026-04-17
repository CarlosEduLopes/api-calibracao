# 🚀 API de Gestão de Clientes - Laboratório de Calibração

API REST desenvolvida com **Spring Boot** para gerenciamento de clientes e seus dados em um ambiente de laboratório de calibração.

Este projeto foi construído com foco em boas práticas de mercado, organização em camadas e escalabilidade, simulando um cenário real de sistema corporativo.

---

## 🧩 Problema Resolvido

Laboratórios de calibração precisam gerenciar:

* Cadastro de clientes
* Atualizações frequentes de dados
* Histórico de alterações
* Integração futura com equipamentos e ordens de serviço

Esta API resolve esse problema com uma estrutura robusta, segura e preparada para crescimento.

---

## ⚙️ Tecnologias e Stack

* ☕ Java 17
* 🚀 Spring Boot
* 🌐 Spring Web
* 🗄️ Spring Data JPA
* 🐬 MySQL
* 🔄 Flyway (versionamento do banco)
* ⚡ Lombok
* 🧪 JUnit (testes básicos)

---

## 🏗️ Arquitetura

O projeto segue o padrão de arquitetura em camadas:

* **Controller** → Entrada das requisições HTTP
* **Service (regra de negócio - implícita/organizada)**
* **Repository** → Acesso ao banco de dados
* **DTOs** → Controle de entrada/saída de dados
* **Entities** → Modelagem do banco

---

## 📁 Estrutura do Projeto

```id="tree1"
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
* 📋 Listagem paginada de clientes
* ✏️ Atualização de dados
* ❌ Exclusão lógica (soft delete com campo `ativo`)
* 📦 Separação clara entre DTOs e entidades
* 🛡️ Validação de dados nas requisições

---

## 🗃️ Banco de Dados

Gerenciado com **Flyway**, garantindo versionamento e consistência.

Scripts disponíveis:

```id="sql1"
V1__create-table-cliente.sql
V2__alter-table-clientes-add-column-telefone.sql
V3__alter-table-clientes-add-column-ativo.sql
```

---

## 🌐 Endpoints Principais

| Método | Endpoint       | Descrição         |
| ------ | -------------- | ----------------- |
| GET    | /clientes      | Listar clientes   |
| POST   | /clientes      | Cadastrar cliente |
| PUT    | /clientes      | Atualizar cliente |
| DELETE | /clientes/{id} | Exclusão lógica   |

---

## ▶️ Como Executar

### Pré-requisitos

* Java 17+
* MySQL

### Passos

```id="run1"
git clone https://github.com/seu-usuario/seu-repo.git
cd seu-repo
```

Configure o banco:

```id="run2"
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

Execute:

```id="run3"
./mvnw spring-boot:run
```

---

## 🧠 Diferenciais do Projeto

✔ Uso de **DTOs para desacoplamento**
✔ Implementação de **exclusão lógica (boa prática real)**
✔ Versionamento de banco com **Flyway**
✔ Código organizado e pronto para escalar
✔ Estrutura próxima de projetos usados em empresas

---

## 🚀 Próximos Passos (Roadmap)

* 🔐 Autenticação com JWT
* 📊 Logs e monitoramento
* 📦 Integração com sistema de equipamentos
* 📱 Integração com app Flutter
* ☁️ Deploy em cloud (Render / Railway / AWS)

---

## 👨‍💻 Autor

Carlos Lopes

---

## 💼 Sobre o Projeto

Este projeto foi desenvolvido com foco em evolução profissional e prática de desenvolvimento backend com Java e Spring Boot, visando oportunidades como **Desenvolvedor Backend Java**.

---

## ⭐ Se este projeto te ajudou ou chamou atenção

Deixe uma estrela no repositório 😉
