package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double pes, polegadas, jardas, milhas;
        
        System.out.print("Digite a medida em pés: ");
        pes = scanner.nextDouble();
        
        polegadas = pes * 12;
        jardas = pes / 3;
        milhas = jardas / 1760;
        
        System.out.println(pes + " pés correspondem a " + polegadas + " polegadas.");
        System.out.println(pes + " pés correspondem a " + jardas + " jardas.");
        System.out.println(pes + " pés correspondem a " + milhas + " milhas.");
    }
}
