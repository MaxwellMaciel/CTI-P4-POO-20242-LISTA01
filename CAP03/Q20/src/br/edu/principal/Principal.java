package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double angulo, altura, escada, radiano;
        
        System.out.print("Digite o ângulo formado com o chão (em graus): ");
        angulo = scanner.nextDouble();
        System.out.print("Digite a altura da parede (em metros): ");
        altura = scanner.nextDouble();
        
        radiano = angulo * 3.14 / 180;
        escada = altura / Math.sin(radiano);
        
        System.out.println("Comprimento da escada necessário: " + escada + " metros");

    }
}
