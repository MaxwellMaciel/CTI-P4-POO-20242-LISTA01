package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double alturaDesejada, alturaDegrau;
        int degrausNecessarios;

        System.out.print("Digite a altura desejada (em metros): ");
        alturaDesejada = scanner.nextDouble();
        System.out.print("Digite a altura de cada degrau (em metros): ");
        alturaDegrau = scanner.nextDouble();

        degrausNecessarios = (int) (alturaDesejada / alturaDegrau); 

        System.out.println("Número de degraus necessários: " + degrausNecessarios);
    }
}
