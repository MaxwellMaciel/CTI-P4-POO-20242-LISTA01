package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double salario, cheque1, cheque2, cpmf1, cpmf2, saldo;
        
        System.out.print("Digite o salário do trabalhador: ");
        salario = scanner.nextDouble();
        
        System.out.print("Digite o valor do primeiro cheque: ");
        cheque1 = scanner.nextDouble();
        
        System.out.print("Digite o valor do segundo cheque: ");
        cheque2 = scanner.nextDouble();
        
        cpmf1 = cheque1 * 0.0038;
        cpmf2 = cheque2 * 0.0038;
        
        saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
        
        System.out.println("Valor do primeiro cheque: R$ " + cheque1);
        System.out.println("Valor do segundo cheque: R$ " + cheque2);
        System.out.println("CPMF do primeiro cheque: R$ " + cpmf1);
        System.out.println("CPMF do segundo cheque: R$ " + cpmf2);
        System.out.println("Saldo restante: R$ " + saldo);
    }
}
