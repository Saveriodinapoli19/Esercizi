//Scrivi un programma che contenga un metodo che crea un array e
// lo riempie con i numeri da 1 a 10 e che che calcoli la somma dei
// numeri contenuti nell'array inizializzato e la stampi a video.
public class es24 {
    public static void main(String[] args){
int[] numeri = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
sum(numeri);
    }
public static int sum(int[] numeri){
        int somma= 0;
 for(int i=0; i< numeri.length; i++){
     somma += numeri[i];

     System.out.println(somma);
 }
return somma;
    }
}

