package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double custo, convite, qtd;

        System.out.print("Digite o custo do espetáculo: ");
        custo = scanner.nextDouble();

        System.out.print("Digite o preço do convite: ");
        convite = scanner.nextDouble();

        qtd = custo / convite; 

        int convitesNecessarios = (int) Math.ceil(qtd);

        System.out.println("Quantidade de convites a serem vendidos: " + convitesNecessarios);
        
        scanner.close();
    }
}
