package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double deposito, taxaJuros, rendimento, total;

        System.out.print("Digite o valor do depósito: ");
        deposito = scanner.nextDouble();
        System.out.print("Digite a taxa de juros (%): ");
        taxaJuros = scanner.nextDouble();
        
        rendimento = deposito * (taxaJuros / 100);
        total = deposito + rendimento;

        System.out.println("Rendimento: " + rendimento);
        System.out.println("Valor total: " + total);
    }
}
