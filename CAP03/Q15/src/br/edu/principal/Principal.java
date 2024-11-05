package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double precoFabrica, percDistribuidor, percImpostos, lucroDistribuidor, valorImpostos, precoFinal;
        
        System.out.print("Digite o preço de fábrica do carro: ");
        precoFabrica = scanner.nextDouble();
        
        System.out.print("Digite o percentual de lucro do distribuidor: ");
        percDistribuidor = scanner.nextDouble();
        
        System.out.print("Digite o percentual de impostos: ");
        percImpostos = scanner.nextDouble();
        
        lucroDistribuidor = precoFabrica * (percDistribuidor / 100);
        valorImpostos = precoFabrica * (percImpostos / 100);
        precoFinal = precoFabrica + lucroDistribuidor + valorImpostos;
        
        System.out.println("Lucro do distribuidor: R$ " + lucroDistribuidor);
        System.out.println("Valor dos impostos: R$ " + valorImpostos);
        System.out.println("Preço final ao consumidor: R$ " + precoFinal);
        
        scanner.close();
    }
}
