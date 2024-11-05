package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double num, i, f, a;

        System.out.print("Digite um número real: ");
        num = scanner.nextDouble();

        i = Math.floor(num); 
        f = num - i; 
        a = Math.round(num); 

        System.out.println("Parte inteira: " + i);
        System.out.println("Parte fracionária: " + f);
        System.out.println("Arredondamento: " + a);
    }
}
