# 🏧 Simulador de Caixa Eletrônico (ATM)

> Aplicação interativa que simula as operações essenciais de um caixa eletrônico real, incluindo saques, depósitos, transferências e verificação de saldo.

---

## 🎯 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de simular a lógica de funcionamento de um caixa eletrônico comercial. O sistema gerencia transações financeiras de forma segura, garantindo validações de saldo, limites operacionais e a distribuição correta de cédulas no momento do saque.

> **Objetivo:** Praticar a lógica de programação, tratamento de exceções, validações de entrada do usuário e organização do código em módulos funcionais.

---

## 🛠️ Funcionalidades

- **🔒 Autenticação Simples:** Validação do usuário e senha antes de liberar o menu principal.
- **💰 Consulta de Saldo:** Exibição clara e atualizada do valor disponível em conta.
- **💵 Depósito de Valores:** Atualização do saldo em tempo real após a validação do valor digitado.
- **💸 Saque de Cédulas:** 
  - Validação de saldo suficiente.
  - Lógica para calcular a distribuição eficiente de notas (ex: R$ 100, R$ 50, R$ 20 e R$ 10).
- **📋 Extrato / Histórico:** Registro das últimas movimentações efetuadas na sessão.

---

## 💻 Tecnologias e Conceitos Aplicados

- **Linguagem:** *(Substitua aqui pela sua linguagem: Python, Java, C#, JS, etc.)*
- **Conceitos de Software:**
  - Controladores de fluxo e laços de repetição (`while`, `switch/case`).
  - Tratamento de exceções e erros de digitação (`try/except` ou `try/catch`).
  - Estrutura de dados para registro do histórico de transações.
  - Formatação e exibição de valores monetários.

---

## 📁 Estrutura do Projeto

```text
simulador-caixa-eletronico/
├── src/                # Código-fonte principal
├── README.md           # Documentação do projeto
└── .gitignore          # Arquivos ignorados pelo versionamento