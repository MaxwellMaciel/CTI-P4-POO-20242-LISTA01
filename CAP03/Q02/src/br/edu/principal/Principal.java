package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, media;

        System.out.print("Digite a nota 1: ");
        n1 = sc.nextDouble();
        
        System.out.print("Digite a nota 2: ");
        n2 = sc.nextDouble();
        
        System.out.print("Digite a nota 3: ");
        n3 = sc.nextDouble();
        
        media = (n1 + n2 + n3)/ 3;

        System.out.println("A média é: " + media);
    }
}
