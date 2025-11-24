package org.example;

import java.util.Scanner;

public class ParouImpar {
    public static void main(String[] args) {
        int numero;
        int divisor = 2;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite um número inteiro ");
        numero=ler.nextInt();

        if (numero % divisor == 0 ) {
            System.out.println("O número " + numero + " é par");
        }
        else {
            System.out.println("O número " + numero + " é impar");
        }
    }
}
