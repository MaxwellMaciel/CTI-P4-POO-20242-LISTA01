package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double horasTrabalhadas, salarioMinimo, valorHora, salarioBruto, imposto, salarioLiquido;
        
        System.out.print("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = scanner.nextDouble();
        
        System.out.print("Digite o valor do salário mínimo: ");
        salarioMinimo = scanner.nextDouble();
        
        valorHora = salarioMinimo / 2;
        salarioBruto = valorHora * horasTrabalhadas;
        imposto = salarioBruto * 0.03; 
        salarioLiquido = salarioBruto - imposto;
        
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Imposto (3%): R$ " + imposto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}
