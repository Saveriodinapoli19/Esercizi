package esercizi;

import java.util.Arrays;

//Scrivi un programma che contenga un metodo che
//crea un array e lo riempie con dei caratteri.
//Questo metodo dovrà poi stampare tutte le occorrenze del
//carattere 'a' o 0 in caso non ce ne siano.
public class es25 {
    public static void main(String[] args) {
        myChar();
    }
    public static void myChar() {
        char[] caratteri = {'a', 'd', 'r', 'a', 'b', 'c'};
        for (int i = 0; i < caratteri.length; i++) {
            if (caratteri[i] == 'a') {
                System.out.println(caratteri[i]);
            } else {
                System.out.println('0');
            }
        }

    }
}

