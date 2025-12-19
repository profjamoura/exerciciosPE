package org.example;

public class Primos1a33 {
    public static void main (String [ ] args){
        // Primos de 1 a 33
        System.out.print("1 2 3 5 7 ");

        for (int i = 8; i <= 33; i++){
            if (!(i % 2 == 0) &&
                    !(i % 3 == 0) &&
                    !(i % 5 == 0) &&
                    !(i % 7 == 0))
            {
                System.out.print(i + " ");
            }
        }
    }
}
