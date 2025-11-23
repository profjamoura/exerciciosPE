package org.example;

import java.util.Scanner;

public class SeSenaoJuntos {
    public static void main(String[] args) {
        // um uso possivel de if e else if
        // teste de renda familiar e imposto de renda
        Scanner ler = new Scanner(System.in);
        System.out.println("digite a renda familiar ");
        Double resp = ler.nextDouble();
        if (resp >= 4664.68 ) {
            System.out.println("alíquota 27,5% dedução R$ 908,73");
        }
            else if (resp >= 3751.06){
                System.out.println("alíquota 22,5% dedução R$ 675,49");
            }
                else if (resp >= 2826.66){
                    System.out.println("alíquota 15,0% dedução R$ 394,16");
                }
                    else if (resp >= 2428.81){
                        System.out.println("alíquota 7,5% dedução R$ 182,16");
                    }
                    else {
                        System.out.println("isento");
                    }
    }
}
