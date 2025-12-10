package org.example;
import java.util.Scanner;

public class AnoBissexto {
    /* Regras para identificar
        O ano deve ser divisível por 4 (ex: 2020, 2024).
        Se o ano for divisível por 100 (ex: 1900, 2100), ele não será bissexto.
        Se o ano for divisível por 400 (ex: 2000), ele será bissexto, mesmo sendo divisível por 100.

        PS: a qt de IFs pode ser diminuída
    */
    public static void main (String[] args){
        int ano;
        Scanner digitacao = new Scanner(System.in);
        System.out.println("Digite um ano para verificar se ele é bissexto");
        ano = digitacao.nextInt();
        if (ano % 4 == 0) {
            if ((ano % 100 != 0) || (ano % 400 == 0)) {
                System.out.println("O ano de " + ano + " é bissexto");
            }
        }
        else {
            System.out.println("O ano de " + ano + " não é bissexto");
        }
    }

}
