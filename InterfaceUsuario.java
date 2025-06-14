package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner;

    public InterfaceUsuario() {
        this.scanner = new Scanner(System.in);
    }
    public double pedirValorImovel() {
        double valorImovel;
        while (true) {
            try {
                System.out.print("Digite o valor do imóvel: ");
                valorImovel = scanner.nextDouble();
                if (valorImovel <= 0) {
                    System.out.println("Erro: Valor do imóvel deve ser maior que zero.");
                } else {
                    return valorImovel;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor inválido. Por favor, digite um valor numérico.");
                scanner.next();
            }
        }
    }
    public int pedirPrazoFinanciamento() {
        int prazoFinanciamento;
        while (true) {
            try {
                System.out.print("Digite o prazo do financiamento (em anos): ");
                prazoFinanciamento = scanner.nextInt();
                if (prazoFinanciamento <= 0) {
                    System.out.println("Erro: Prazo do financiamento deve ser maior que zero.");
                } else {
                    return prazoFinanciamento;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor inválido. Por favor, digite um valor inteiro.");
                scanner.next();
            }
        }
    }

    public double pedirTaxaJurosAnual() {
        double taxaJurosAnual;
        while (true) {
            try {
                System.out.print("Digite a taxa de juros anual (%): ");
                taxaJurosAnual = scanner.nextDouble();
                if (taxaJurosAnual <= 0) {
                    System.out.println("Erro: Taxa de juros anual deve ser maior que zero.");
                } else {
                    return taxaJurosAnual / 100;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor inválido. Por favor, digite um valor numérico.");
                scanner.next();
            }
        }
    }
}