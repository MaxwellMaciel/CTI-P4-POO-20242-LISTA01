package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double hora, m;
        int h, conversao;

        System.out.print("Digite a hora (formato HH.MM): ");
        hora = scanner.nextDouble();

        h = (int) hora; 
        m = hora - h; 
        conversao = (h * 60) + (int) (m * 100);
        System.out.println("A hora digitada em minutos é: " + conversao);
    }
}