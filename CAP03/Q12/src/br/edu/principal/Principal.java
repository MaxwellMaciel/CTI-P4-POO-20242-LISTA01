package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double num1, num2, r1, r2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (maior que zero): ");
        num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número (maior que zero): ");
        num2 = scanner.nextDouble();

        if (num1 > 0 && num2 > 0) {
            r1 = Math.pow(num1, num2);  
            r2 = Math.pow(num2, num1);  

            System.out.println(num1 + " elevado a " + num2 + " é " + r1);
            System.out.println(num2 + " elevado a " + num1 + " é " + r2);
        } else {
            System.out.println("Ambos os números devem ser maiores que zero.");
        }
    }
}

