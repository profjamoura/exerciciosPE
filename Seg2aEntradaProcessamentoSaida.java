package org.example;
// importação de biblioteca java para ler dados do teclado
import java.text.DecimalFormat;
import java.util.Scanner;

public class Seg2aEntradaProcessamentoSaida {
    public static void main(String[] args) {
        // criando variável
        String nome;
        double altura, peso;
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // entrada dos dados com saída para solicitação
        System.out.println("Digite o nome :");
        nome = ler.nextLine();

        System.out.println("Digite a altura em metros Ex.: 1,80:");
        altura = ler.nextDouble();

        System.out.println("Digite o peso em kg :");
        peso = ler.nextDouble();

        // mostrando o resultado sem guardar em variável
        // sem formatação
        System.out.println("O IMC de " + nome + " é " + (peso / (altura*altura)) );

        //com formatação de duas casas decimais
        System.out.println("O IMC de " + nome + " é " + df.format((peso / (altura*altura))) );
    }
}
