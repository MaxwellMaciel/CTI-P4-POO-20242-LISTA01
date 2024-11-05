package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal, novosal;
        
        System.out.print("Digite o salário do funcionário: ");
        sal = sc.nextDouble();
        
        novosal = sal + (sal * 0.25);
        
        System.out.println("O novo salário é:"+ novosal);
    }
}
