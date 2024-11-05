package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int anoAtual, anoNascimento, idadeAtual, idade2050;
        
        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();
        
        System.out.print("Digite o seu ano de nascimento: ");
        anoNascimento = scanner.nextInt();
        
        idadeAtual = anoAtual - anoNascimento;
        idade2050 = 2050 - anoNascimento;
        
        System.out.println("Sua idade atual é: " + idadeAtual + " anos.");
        System.out.println("Em 2050, você terá: " + idade2050 + " anos.");
    }
}
