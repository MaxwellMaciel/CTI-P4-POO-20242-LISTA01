package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double n1, n2, n3, p1, p2, p3, media;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        p1 = sc.nextDouble();
        p2 = sc.nextDouble();
        p3 = sc.nextDouble();
        media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
        System.out.println("A média ponderada é: " + media);
    }
}
