package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double vlr_sal, qtd_kw, vlr_kw, vlr_reais, desc, vlr_desc;

        System.out.print("Digite o valor do salário mínimo: ");
        vlr_sal = scanner.nextDouble();

        System.out.print("Digite a quantidade de quilowatts consumida: ");
        qtd_kw = scanner.nextDouble();

        vlr_kw = vlr_sal / 5;
        vlr_reais = vlr_kw * qtd_kw;
        desc = vlr_reais * 0.15;
        vlr_desc = vlr_reais - desc;

        System.out.println("Valor de cada quilowatt: R$ " + vlr_kw);
        System.out.println("Valor a ser pago pela residência: R$ " + vlr_reais);
        System.out.println("Valor a ser pago com desconto de 15%: R$ " + vlr_desc);
    }
}
