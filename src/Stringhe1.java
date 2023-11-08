//Scrivi un programma Java che abbia un metodo che prenda il carattere
// in Unicode in un indice specifico all'interno di una stringa e lo stampi.
//
//Il metodo dovrà avere nel costruttore una stringa ed
// una posizione e dovrà resituire il carattere in unicode o una stringa di errore.
//Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.

public class Stringhe1 {
    public static void main(String[] args) {
        StringBuilder Frase= new StringBuilder("Oggi è domenica");
        System.out.println(Frase);
        System.out.println("Il carattere è : " + Frase.charAt(0));
        System.out.println("La lunghezza della frase è  " + Frase.length() + " caratteri.");
    }
    }




