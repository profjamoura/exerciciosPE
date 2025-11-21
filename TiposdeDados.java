package org.example;

public class TiposdeDados {
    public static void main(String[] args) {
        // criando as variáveis
        int inteiro;
        double decimal;
        String texto;
        boolean simOunao;

        // atribuindo valores às variáveis
        inteiro = 1;
        decimal = 1.01;
        texto = "Um conteúdo em texto";
        simOunao = true;

        // mostrando os valores
        System.out.println("Conteúdos:");
        System.out.println("inteiro " + inteiro + " decimal " + decimal + " texto " + texto +
                " lógica " + simOunao);

        // atribuindo novo valores às variáveis
        inteiro = 2;
        decimal = 1;
        texto = "Um conteúdo em texto e número: 3";
        simOunao = false;

        // mostrando os valores
        System.out.println("Conteúdos:");
        System.out.println("inteiro " + inteiro + " decimal " + decimal + " texto " + texto +
                " lógica " + simOunao);

    }

}
