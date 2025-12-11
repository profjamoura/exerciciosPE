package org.example;

import java.util.Scanner;

public class L1q2MenorComFilho {
    /*
   2.Usando a tabela da questão 1, leia os dados e
   diga se a mulher é menor de idade e possui filhos.
   Diga “menor de idade com filhos”

    */
    public static void main(String[] args) {
        String nome;
        int idade;
        int estadocivil;
        int qtfilhos;
        int continua;

        do {

            System.out.println("Digite nome");
            Scanner digitacao = new Scanner(System.in);
            nome = digitacao.nextLine();
            System.out.println("Digite a idade atual");
            digitacao = new Scanner(System.in);
            idade = digitacao.nextInt();

            System.out.println("Digite o estado civil (1 p/ casada, 2 p/ solteira e 3 p/ viúva)");
            digitacao = new Scanner(System.in);
            estadocivil = digitacao.nextInt();

            System.out.println("Digite a Qt de filhos");
            digitacao = new Scanner(System.in);
            qtfilhos = digitacao.nextInt();


            if ( (idade < 18) && (qtfilhos >= 1) )
                System.out.println("Menor de idade com filhos");

            System.out.println("Continua? (1 para sim/ 0 para não)");
            digitacao = new Scanner(System.in);
            continua = digitacao.nextInt();
        }
        while (continua == 1);
    }

}
