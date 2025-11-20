package org.example;

import java.util.Scanner;

public class consumoDoCarro {
    public static void main(String[] args) {        Scanner input = new Scanner(System.in);
        String nome;
        double consumo;
        int km;
        int lts, lts2;
        System.out.println("Digite o nome do carro: ");
        nome = input.nextLine();
        System.out.println("Digite a quilometragem percorrida: ");
        km = input.nextInt();
        System.out.println("Digite a qt de combustivel na saida (origem): ");
        lts = input.nextInt();
        System.out.println("Digite a qt de combustivel atualizado: ");
        lts2 = input.nextInt();
        System.out.println("O consumo do " + nome + " esta em  " + km/(lts-lts2) + " km/l");


    }
}
