package org.example;
/*
Para verificar se um objeto é ouro verdadeiro, você pode seguir estes métodos:
Teste do ímã: O ouro não é magnético. Se a peça grudar em um ímã, pode não ser ouro puro.
Teste da cerâmica: Esfregue a peça de ouro suavemente em uma superfície de cerâmica. Se deixar um rastro dourado, é ouro verdadeiro; se deixar um rastro preto ou cinza, pode ser falso.
Teste do vinagre: Puxe algumas gotas de vinagre na peça. Se não houver mudança de cor, é ouro verdadeiro; se escurecer ou mudar de cor, pode ser falso.
Verifique a marcação: Procure marcas de pureza como 18K, 14K ou 24K, que indicam a quantidade de ouro na peça.
Teste da densidade: Use uma balança para pesar a peça e compare com os pesos padrão do ouro puro. A densidade do ouro puro é 19,32 g/cm³.
+-------------------------------------------------+
|ima, ceramica, vinagre, marcacao, densidade, ouro|
+-------------------------------------------------+
 */

import java.util.Objects;
import java.util.Scanner;

public class eOuro {
    public static void main(String[] args) {
        System.out.println("passou no teste do imã (s/n)?");
        Scanner soun1 = new Scanner(System.in);
        String simOuNao1 = soun1.nextLine();
        if (Objects.equals(simOuNao1, "s")) {
            System.out.println("passou no teste da cerâmica (s/n)?");
            Scanner soun2 = new Scanner(System.in);
            String simOuNao2 = soun2.nextLine();
            if (Objects.equals(simOuNao2, "s")) {
                System.out.println("passou no teste do vinagre (s/n)?");
                Scanner soun3 = new Scanner(System.in);
                String simOuNao3 = soun3.nextLine();
                if (Objects.equals(simOuNao3, "s")) {
                    System.out.println("passou no teste da marcacao (s/n)?");
                    Scanner soun4 = new Scanner(System.in);
                    String simOuNao4 = soun4.nextLine();
                    if (Objects.equals(simOuNao4, "s")) {
                        System.out.println("passou no teste da densidade (s/n)?");
                        Scanner soun5 = new Scanner(System.in);
                        String simOuNao5 = soun5.nextLine();
                        if (Objects.equals(simOuNao5, "s")) {
                            System.out.println("Eh ouro!!!");
                        }
                        else {
                            System.out.println("Não é ouro!");
                        }
                        soun4.close();
                        soun5.close();
                    } else {
                        System.out.println("Não é ouro!");
                    }
                    soun3.close();
                } else {
                    System.out.println("Não é ouro!");
                }
                soun2.close();
            } else {
                System.out.println("Não é ouro!");
            }
            soun1.close();
        }

    }

}