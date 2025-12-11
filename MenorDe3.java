package org.example;
import java.util.Scanner;

public class MenorDe3 {
    public static void main (String [ ] args){
        // menor de 3 números dados
        int menor;
        int [] meuArray = new int[3]; //uso de vetor, array, matriz

        Scanner teclado = new Scanner(System.in);
        for (int i=0; i<3; i++){
            System.out.println("Digite o " + (i+1) + "o. numero");
            teclado = new Scanner(System.in);
            meuArray[i] = teclado.nextInt();
        }
        if (meuArray[0] < meuArray[1]) { menor = meuArray[0];}
        else {menor = meuArray[1];}
        if (meuArray[2] < menor) { menor = meuArray[2];}
        System.out.println(" o menor é " + menor);
    }
}
