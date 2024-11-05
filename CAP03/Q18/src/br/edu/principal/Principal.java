package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double pesoSaco, racaoGato1, racaoGato2, totalFinal;
        
        System.out.print("Digite o peso do saco de ração em gramas: ");
        pesoSaco = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de ração do primeiro gato em gramas: ");
        racaoGato1 = scanner.nextDouble() / 1000;
        
        System.out.print("Digite a quantidade de ração do segundo gato em gramas: ");
        racaoGato2 = scanner.nextDouble() / 1000;
        
        totalFinal = pesoSaco - 5 * (racaoGato1 + racaoGato2);
        
        System.out.println("Quantidade restante de ração no saco: " + totalFinal + " kg");
    }
}
