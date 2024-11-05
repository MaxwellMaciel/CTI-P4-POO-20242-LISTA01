package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double base, altura, area;

        System.out.print("Digite a base do triângulo: ");
        base = scanner.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        altura = scanner.nextDouble();
        
        area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);
    }
}
