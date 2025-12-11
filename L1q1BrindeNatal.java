package org.example;

import java.util.Objects;
import java.util.Scanner;

public class L1q1BrindeNatal {
    /*
   Retomando os princípios de Teoria dos Conjuntos da UC anterior e usando os dados abaixo,
   leia nome, idade, estado civil e quantidade de filhos. Diga se a mulher terá direito ao
   brinde de Natal que é para as mulheres viúvas ou com filhos. Responda com “Parabéns! Você
   terá direito ao brinde de Natal” para os casos positivos e “Infelizmente, você não terá
   direito ao brinde de Natal…” para os casos que negativos

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


            if ( (estadocivil == 3) || (qtfilhos >= 1) )
                System.out.println("Parabéns! Você terá direito ao brinde de Natal");
            else
                System.out.println("Infelizmente, você não terá direito ao brinde de Natal...");

            System.out.println("Continua? (1 para sim/ 0 para não)");
            digitacao = new Scanner(System.in);
            continua = digitacao.nextInt();
        }
        while (continua == 1);
    }

}
