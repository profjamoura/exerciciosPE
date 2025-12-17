package org.example;

import java.util.Scanner;

public class L1q3Grupos {
    /*
    Retomando os princípios de Teoria dos Conjuntos da UC
    anterior e usando os dados abaixo,leia sexo (use 1 para
    mulheres), CTPS assinada (1=S ou 2=N?), possui filhos (1=S
    ou 2=N?) e diga a qual grupo a pessoa pertence, de A a J:
    Obs: pode ser melhorado usando-se somatório para as respostas
    */
    public static void main(String[] args) {
        String nome;
        int sexo;
        int ctps;
        int qtfilhos;
        String grupo;
        int continua;

        do {
            System.out.println("Digite nome");
            Scanner digitacao = new Scanner(System.in);
            nome = digitacao.nextLine();

            System.out.println("Digite o sexo (1 p/ mulher)");
            digitacao = new Scanner(System.in);
            sexo = digitacao.nextInt();

            System.out.println("Possui carteira de trabalho assinada? (1 p/ sim, 2 p/ não");
            digitacao = new Scanner(System.in);
            ctps = digitacao.nextInt();

            System.out.println("Digite a Qt de filhos");
            digitacao = new Scanner(System.in);
            qtfilhos = digitacao.nextInt();

            // sexo, ctps, qtfilhos
            if (sexo == 1) { //mulher
                if (ctps == 1) { //carteira
                    if (qtfilhos > 0) { //com filhos
                        grupo = "J";
                    } else { //sem filhos
                        grupo = "H";
                    }
                }
                else { //mulher sem carteira
                    if (qtfilhos > 0 ){ //com filhos
                        grupo = "G";
                    }
                    else {
                        grupo = "D";
                    }
                }

            } else // não é mulher
              {
                  if (ctps == 1){ //carteira
                      if (qtfilhos > 0){ //com filhos
                          grupo = "I";
                      } else { //sem filhos
                          grupo = "E";
                      }
                  }
                  else {
                          grupo = "F";
                      }
            }
            System.out.println(nome + " pertence ao grupo " + grupo);System.out.println("Continua? (1 para sim/ 0 para não)");
            digitacao = new Scanner(System.in);
            continua = digitacao.nextInt();
        }
        while (continua == 1);
    }
}
