package org.example;
//  unidimensionais
public class TiposdeDadosArrayMulti {
    public static void main(String[] args) {
        // criando as variáveis
        String[] [] apto;
        apto = new String[10][4];

        String strAndar, strApto;

        // atribuindo valores às variáveis e lembrar do 1o índice igual a zero
        for (int andar = 0; true; andar++) {
            for (int ap=0; ap <= 3; ap++) {
                strAndar = Integer.toString(andar);
                strApto = Integer.toString(ap+1);
                apto[andar][ap] = (strAndar + " " + strApto);
                System.out.println("andar e apto " + apto [andar][ap]);
            }
        }
    }

}
