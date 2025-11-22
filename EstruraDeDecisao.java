package org.example;
/* Obs: Operadores
aritméticos +,-,*,/,%
atribuição =, +=, -=
lógicos &&, ||, !, ^
comparação ==, !=, >, <, >=, <=
 */

public class EstruraDeDecisao {
    public static void main(String[] args) {

        int idade, censura;
        idade = 17;
        censura = 18;
        // usando SE
        if (idade < 18){
            System.out.println("SE: Pessoa menor de 18 anos");
        }

        // usando SE e SENAO
        if (idade < 18){
            System.out.println(">>SE/SENAO: Pessoa menor de 18 anos");
        }
        else {
            System.out.println("SE/>>SENAO: Pessoa maior de 18 anos");
        }

        // usando SE, SENAO, OU
        if ((idade < 18) || (censura >= 18)){
            System.out.println(">>SE/SENAO/OU: filme não recomendado para algumas pessoas");
        }
        else {
            System.out.println("SE/>>SENAO/OU: filme liberado para maioria das essoas");
        }
        // usando SE, SENAO, E
        if ((idade < 18) && (censura >=18)){
            System.out.println(">>SE/SENAO/E: duas condições ultrapassadas");
        }
        else {
            System.out.println("SE/>>SENAO/E: somente uma ou nenhuma das consições ultrapassada(s)");
        }



    }
}
