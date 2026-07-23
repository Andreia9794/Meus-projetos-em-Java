# 📊 Engine de Risco de Crédito (POO Avançada)

> Motor de análise e pontuação de risco de crédito (*credit scoring*) desenvolvido em Java, aplicando conceitos avançados de Orientação a Objetos, Polimorfismo e Design Patterns.

---

## 🎯 Sobre o Projeto

O **Engine de Risco de Crédito** é uma solução de software projetada para simular o motor de decisão de uma instituição financeira ou FinTech. A aplicação avalia o perfil de solicitação de crédito do cliente com base em múltiplos fatores (renda, histórico de pagamentos, idade, comprometimento de renda e garantias) e determina a aprovação, o limite máximo e a taxa de juros aplicada.

> **Objetivo:** Demonstrar domínio em Programação Orientada a Objetos Avançada, aplicando princípios **SOLID**, **Design Patterns** (como Strategy e Template Method) e boa arquitetura de código.

---

## 🛠️ Funcionalidades

- **📈 Cálculo de Score de Risco:** Algoritmo dinâmico que atribui uma pontuação de crédito com base no perfil do solicitante.
- **🏷️ Classificação por Faixas de Risco (Rating):** Agrupamento automático em categorias de risco (ex: *Low Risk/AAA*, *Medium Risk/BBB*, *High Risk/C*).
- **🛡️ Regras de Aprovação e Limites:**
  - Definição automática da margem de crédito permitida.
  - Ajuste de taxas de juros proporcionais ao risco calculado.
  - Negação automática em caso de insustentabilidade financeira (comprometimento excessivo de renda).
- **⚙️ Motores Pluggáveis de Análise:** Arquitetura flexível para alternar a lógica de cálculo sem alterar o código principal.

---

## 💻 Tecnologias e Conceitos Aplicados

- **Linguagem:** Java (JDK 11+)
- **Conceitos Avançados de Software:**
  - **Polimorfismo e Herança:** Construção de diferentes perfis de análise de crédito reutilizando classes base.
  - **Encapsulamento e Imutabilidade:** Proteção de dados sensíveis e regras financeiras da aplicação.
  - **Design Pattern Strategy:** Isolamento dos algoritmos de risco para permitirem expansão futura sem modificar o motor principal (*Open/Closed Principle*).
  - **Tratamento de Exceções Personalizadas:** Lançamento de regras de negócio customizadas para análises reprovadas ou dados inválidos.

---

## 📁 Estrutura do Projeto

```text
Engine de Risco de Crédito/
├── src/
│   ├── model/           # Entidades (Cliente, PropostaCredito, ResultadoAnálise)
│   ├── service/         # Motor principal de decisão (CreditEngineService)
│   ├── strategy/        # Algoritmos e regras de cálculo de score (Strategies)
│   └── exception/       # Exceções personalizadas da regra de negócio
├── Main.java            # Execução de cenários de teste do motor de crédito
└── README.md            # Documentação do projeto