package esercizi;//Scrivi un programma che contenga un metodo che crea un array e
// lo riempie con i numeri da 1 a 10 e che che calcoli la somma dei
// numeri contenuti nell'array inizializzato e la stampi a video.

public class es24 {
    public static void main (String[] args) {
            int[] numeri = Array();
            System.out.println("The sum of the elements of the array is: " + sum(numeri));
        }
        public static int[] Array() {
            int[] numeri = new int[]{1,2,3,4,5,6,7,8,9,10};
            for (int i = 0; i < numeri.length; i ++) {
                numeri[i] = i + 1;
            }
            return numeri;
        }
        public static int sum(int[] numeri) {
            int sum = 0;
            for (int num1 : numeri) {
                sum += num1;
            }
            return sum;
        }
    }