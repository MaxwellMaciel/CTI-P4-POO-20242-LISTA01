package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal, perc, aumento, novosal;

        System.out.print("Digite o salário do funcionário: ");
        sal = sc.nextDouble();
        System.out.print("Digite o percentual de aumento: ");
        perc = sc.nextDouble();

        aumento = sal * perc / 100;
        System.out.println("Valor do aumento: " + aumento);

        novosal = sal + aumento;
        System.out.println("Novo salário: " + novosal);
    }
}
