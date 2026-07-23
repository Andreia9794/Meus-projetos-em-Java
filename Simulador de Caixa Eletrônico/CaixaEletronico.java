import java.util.Scanner;

class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado!\n", valor);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado!\n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Titular: %s | Saldo: R$ %.2f\n", titular, saldo);
    }
}

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("Estudante ADS", 500.00);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=== CAIXA ELETRÔNICO ===");
            System.out.println("1. Ver Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> conta.exibirSaldo();
                case 2 -> {
                    System.out.print("Valor do depósito: R$ ");
                    conta.depositar(scanner.nextDouble());
                }
                case 3 -> {
                    System.out.print("Valor do saque: R$ ");
                    conta.sacar(scanner.nextDouble());
                }
                case 4 -> System.out.println("Saindo... Obrigado!");
                default -> System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}