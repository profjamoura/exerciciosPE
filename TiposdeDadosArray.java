package org.example;
//  unidimensionais
public class TiposdeDadosArray {
    public static void main(String[] args) {
        // criando as variáveis
        int[] dado6lados;
        dado6lados = new int[6];

        String[] semana = new String[7];

        // atribuindo valores às variáveis e lembrar do 1o índice igual a zero
        for (int i=0; i<=5; i++) {
            dado6lados[i] = i+1;
            System.out.println(dado6lados[i]);
        }

        semana[0] = "dom"; semana[1]="seg"; semana[2]="ter"; semana[3]="qua";
        semana[4]="qui"; semana[5]="sex"; semana[6]="sab";

        for (int j=0; j<=6; j++) {
            System.out.println(semana[j]);
        }
    }

}
