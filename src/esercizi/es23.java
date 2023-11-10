package esercizi;//Scrivi un programma che contenga un metodo che prende
//in ingresso un valore numerico e stampa tutti i numeri fino al valore immesso,
//la stampa dovrà saltare il valore uguale a 5.

public class es23 {
    public static void main(String[] args) {
        int x=10;
    System.out.println(salta(x));
    }
   public static int salta(int x){
      for(x=0; x<10; x++){
         if(x==5) {
             continue;

         }
          System.out.print(x);
         }
      return x;
   }
}
