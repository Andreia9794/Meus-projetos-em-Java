# 📚 Catalogador de Biblioteca Universitária

> Sistema em Java projetado para organizar e gerenciar o acervo de livros de uma universidade, classificando as obras por categorias acadêmicas e autores.

---

## 🎯 Sobre o Projeto

O **Catalogador de Biblioteca Universitária** simula a rotina de organização de um acervo acadêmico. Ele permite cadastrar obras literárias e técnicas, associá-las a áreas do conhecimento específicas (como Programação, Banco de Dados e Engenharia de Software) e realizar consultas dinâmicas no acervo.

> **Objetivo:** Demonstrar o uso de conceitos fundamentais da Programação Orientada a Objetos (POO) em Java para resolução de problemas de organização e busca de dados no mundo real.

---

## 🛠️ Funcionalidades

- **📖 Cadastro de Livros:** Registro completo de títulos, autores e suas respectivas áreas do conhecimento.
- **🏷️ Categorização Automática:** Classificação das obras via `Enum` para evitar duplicidade ou erros de digitação nas categorias.
- **🔍 Consulta por Categoria:** Filtro rápido para listar todas as obras pertencentes a uma área específica do acervo.
- **📋 Gestão Dinâmica do Acervo:** Uso de estruturas de coleções dinâmicas para armazenamento flexível de dados.

---

## 💻 Tecnologias e Conceitos Aplicados

- **Linguagem:** Java (JDK 11+)
- **Conceitos de Software:**
  - **Programação Orientada a Objetos (POO):** Encapsulamento, classes e objetos.
  - **Enumerações (`Enum`):** Padronização e tipagem forte para as categorias acadêmicas.
  - **Coleções (`List` / `ArrayList`):** Manipulação e listagem dinâmica de dados em memória.
  - **Separação de Responsabilidades:** Classes isoladas para representação de dados (`Livro`), regras de negócio (`Acervo`) e execução (`Main`).

---

## 📁 Estrutura do Projeto

```text
Catalogador de Biblioteca Universitaria/
├── Main.java         # Classe principal (execução e testes)
├── Livro.java        # Modelo que representa a estrutura de um livro
├── Categoria.java    # Enum com as áreas do conhecimento disponíveis
├── Acervo.java       # Gerenciador do acervo (métodos de cadastro e busca)
└── README.md         # Documentação do projeto