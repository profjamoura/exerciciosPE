package org.example;
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner tecla = new Scanner(System.in);
        int angulo = 0;
        int catetoAdjacente = 0;
        String nome = "";
        do {
            System.out.println("Calculo da altura do predio");
            System.out.print("Digite o nome do predio ");
            nome = tecla.nextLine();
            System.out.print("Digite a distancia do predio ate a medicao do angulo em metros ");
            catetoAdjacente = tecla.nextInt();
            System.out.print("Digite o angulo de projecao ");
            angulo = tecla.nextInt();
        }
        while ((angulo >= 90) || (angulo <0));
        double catetoOposto = Math.tan((Math.PI/180) * angulo) * catetoAdjacente;
        tecla.close();
        System.out.println("O " + nome + " tem " + catetoOposto + " m");
        System.out.println("tangente de " + angulo + " = " + Math.tan((Math.PI/180) * angulo));
    }
}
// (Math.PI/180) * angulo