package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.print("Digite um número positivo: ");
        numero = scanner.nextDouble();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        double raizQuadrada = Math.sqrt(numero);
        double raizCubica = Math.cbrt(numero);

        System.out.println("Quadrado: " + quadrado);
        System.out.println("Cubo: " + cubo);
        System.out.println("Raiz quadrada: " + raizQuadrada);
        System.out.println("Raiz cúbica: " + raizCubica);
    }
}
