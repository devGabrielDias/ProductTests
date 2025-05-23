
# 🛒 Sistema de Gerenciamento de Produtos — Testes de Software 📊

Seja bem-vindo(a) ao repositório desta atividade desenvolvida para a matéria de **Testes de Software** do **SENAI**! 🎓✨

Este projeto foi criado com o objetivo de aplicar técnicas de testes unitários em uma aplicação Java que realiza operações de gerenciamento de produtos, incluindo o controle de imagens associadas a esses produtos. Utilizamos **Mockito** para simular comportamentos e **JaCoCo** para analisar a cobertura de código durante a execução dos testes.

---

## 📚 Sobre o Projeto

O projeto consiste em uma aplicação Java responsável por:

- 📥 Cadastrar (salvar) produtos.
- 🗑️ Remover produtos.
- 🔄 Atualizar produtos.

Cada produto possui as seguintes informações:

- 🆔 ID
- 📝 Descrição
- 💵 Preço
- 🖼️ Caminho para a imagem do produto

Além disso, as operações relacionadas à imagem realizam o armazenamento, atualização e remoção do arquivo correspondente no sistema de arquivos.

Através deste projeto, foi possível:

- 📖 Praticar boas práticas de testes unitários.
- 🔍 Simular dependências com **Mockito**.
- 📊 Verificar a cobertura de testes com **JaCoCo**.
- 📝 Garantir a confiabilidade e estabilidade das funcionalidades implementadas.

---

## ✅ Casos de Uso de Teste

Os testes unitários implementados cobrem as seguintes funcionalidades:

- 📥 **Salvar produto corretamente**
  - Verifica se o produto é salvo corretamente, incluindo a cópia da imagem para o diretório de destino.

- 🗑️ **Remover produto corretamente**
  - Confirma se o produto e sua imagem associada são removidos do sistema.

- 🔄 **Atualizar produto corretamente**
  - Testa se as informações e a imagem do produto são atualizadas adequadamente, substituindo a anterior.

Cada um desses casos de uso foi validado com **Mockito** para mockar dependências e **JUnit 5** como framework de teste.

---

## 🛠️ Tecnologias Utilizadas

- ☕ **Java**
- 🧪 **JUnit 5**
- 🎭 **Mockito**
- 📊 **JaCoCo**
- 📝 **Maven** (para gerenciamento de dependências)

---

## 📊 Relatório de Cobertura de Testes

A cobertura de código foi avaliada com **JaCoCo**, garantindo que todas as operações principais da aplicação estão devidamente testadas.

Para gerar o relatório:

```bash
mvn clean test
mvn jacoco:report
```

O relatório será gerado em:

```
target/site/jacoco/index.html
```

---

## 📦 Como Executar os Testes

Clone o repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

Navegue até o diretório do projeto:

```bash
cd seu-repositorio
```

Execute os testes:

```bash
mvn clean test
```

---

## 📌 Considerações

Este projeto faz parte da grade curricular do curso técnico de **Desenvolvimento de Sistemas** no **SENAI**, na disciplina de **Testes de Software**. Ele foi desenvolvido com o objetivo de consolidar os conceitos de:

- Teste unitário em aplicações Java.
- Uso de mocks e simulações de dependências com **Mockito**.
- Análise e geração de relatórios de cobertura de código com **JaCoCo**.
- Organização e boas práticas no desenvolvimento de testes automatizados.

---

## ✨ Autor

👤 Gabriel Dias Santana  

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/gabriel-dias-689a93312/)  
📧 dev.gdiaas@gmail.com  

---
