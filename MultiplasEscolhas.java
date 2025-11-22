package org.example;

import java.util.Scanner;

public class MultiplasEscolhas {
    public static void main(String[] args) {
        int op;
        String nome;

        System.out.println("Escolha uma das opções de pagamento");
        System.out.println("1.débito 2.crédito 3.pix 4.dinheiro");
        Scanner ler = new Scanner(System.in);
        op = ler.nextInt();

        switch (op) {
            case 1:
                System.out.println("Aproxime o cartão para pag em débito");
                break;
            case 2:
                System.out.println("Aproxime o cartão para pag em crédito");
                break;
            case 3:
                System.out.println("Aguarde o QR CODE");
                break;
            case 4:
                System.out.println("Pague diretamente à pessoa que lhe atendeu");
                break;
            default:
                System.out.println("opção não válida");
        }
    }
}
