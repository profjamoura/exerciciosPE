package org.example;
import java.util.Scanner;
public class verificaNome {
    public static void verifica() {
        String nome;
        Boolean ultNome;
        do {
            System.out.println("Retira 'Neto' do nome");
            System.out.println("Digite o nome completo ");

            Scanner ler = new Scanner(System.in);
            nome = ler.nextLine();
            ultNome = nome.endsWith("neto");
            System.out.println(ultNome);
            if (ultNome) {
                System.out.println(">>> Nome contem 'Neto'");
            } else {
                System.out.println("Nome nao contem 'Neto'");
            }
        }
        while (!nome.equals("."));
    }
}
