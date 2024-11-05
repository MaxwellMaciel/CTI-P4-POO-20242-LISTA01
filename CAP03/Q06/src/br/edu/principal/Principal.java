package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double salarioBase, gratificacao, imposto, salarioLiquido;

        System.out.print("Digite o salário base: ");
        salarioBase = scanner.nextDouble();
        
        gratificacao = salarioBase * 0.05;
        imposto = salarioBase * 0.07;
        
        salarioLiquido = salarioBase + gratificacao - imposto;

        System.out.println("O salário a receber é: " + salarioLiquido);
    }
}
