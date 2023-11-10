package esercizi;

//Scrivi un programma che calcoli la lunghezza di una stringa, sulla
// base di questa lunghezza stampi
// "Lunghezza maggiore di 10", "Lunghezza minore di 10" o "Lunghezza pari a 10".
public class Es16{
    public static void main(String[] args){
        String name= "Luca";
        int name1= name.length();

        if(name1>10){
            System.out.println("Il numero è maggiore 10");
        } else if(name1==10){
            System.out.println("Il numero è uguale 10");
        }else{
            System.out.println("Il numero è minore 10");
        }

    }
}