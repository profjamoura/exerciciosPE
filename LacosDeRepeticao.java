package org.example;

/*
 Laço de repetição com teste no início, no final e for
 while...do..., do...while..., for
 */
public class LacosDeRepeticao {
    public static void main(String[] args) {
        int contador;

        // teste no inicio:
        System.out.println("Teste no início");
        contador = 0;
        while (contador <3)
        {
            System.out.println(contador);
            contador = contador +1; //contador++;
        }

        // teste no final
        System.out.println("Teste no final");
        contador = 0;
        do {
            System.out.println(contador);
            contador = contador +1; //contador++;
        }
        while (contador <3);

        System.out.println("Teste for");
        // for
        for ( int i=0; i<3 ; i++ ) {
            System.out.println(i);
        }

    }
}
