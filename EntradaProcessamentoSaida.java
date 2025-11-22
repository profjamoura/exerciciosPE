package org.example;
// importação de biblioteca java para ler dados do teclado
import java.util.Scanner;

public class EntradaProcessamentoSaida {
    public static void main(String[] args) {
        // criando variável
        String nome;
        Scanner ler = new Scanner(System.in);

        nome = ler.nextLine();

        // mostrando nome
        System.out.println(nome);
    }
}
