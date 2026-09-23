package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double saldo = 0.0;
        int opcao;

        System.out.println("======== Caixa Eletrônico ========");
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Seja bem-vindo(a), " + nome + "!");

        do {
            System.out.println("\nPara continuar o atendimento, escolha uma das opções abaixo: ");
            System.out.println("1- Consultar Saldo");
            System.out.println("2- Realizar Depósito");
            System.out.println("3- Realizar Saque");
            System.out.println("4- Sair");
            System.out.print("Digite sua opção: ");
            opcao = entrada.nextInt();

            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo é: R$ %.2f\n", saldo);
                    break;
                case 2:
                    System.out.print("Insira o valor do depósito: R$ ");
                    double deposito = entrada.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Erro: Valor inválido.");
                    }
                    break;
                case 3:
                    System.out.print("Insira o valor do Saque: R$ ");
                    double saque = entrada.nextDouble();

                    if (saque > saldo) {
                        System.out.println("Erro: Saldo insuficiente.");
                    } else if (saque <= 0) {
                        System.out.println("Erro: Valor inválido.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;
                case 4:
                    System.out.println(nome + ", atendimento encerrado com sucesso!");
                    break;

                default:
                    System.out.println("Erro: Opção Inválida.");
                    break;
            }
        } while (opcao != 4);
    }
}