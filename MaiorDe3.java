package org.example;
import java.util.Scanner;

public class MaiorDe3 {
    public static void main (String [ ] args){
        // maior de 3 números dados
        int maior;
        int [] meuArray = new int[3]; //uso de vetor, array, matriz

        Scanner teclado = new Scanner(System.in);
        for (int i=0; i<3; i++){
            System.out.println("Digite o " + (i+1) + "o. numero");
            teclado = new Scanner(System.in);
            meuArray[i] = teclado.nextInt();
        }
        if (meuArray[0] > meuArray[1]) { maior = meuArray[0];}
        else {maior = meuArray[1];}
        if (meuArray[2] > maior) { maior = meuArray[2];}
        System.out.println(" o maior é " + maior);
    }
}
