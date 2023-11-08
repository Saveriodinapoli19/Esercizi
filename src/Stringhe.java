//Scrivi un programma Java che abbia un metodo che prenda due
// stringhe e le compari lessico-graficamente.
//
//Il metodo dovrà restituire "Le due stringhe sono uguali" o
// "Le due stringhe sono differenti" basandosi sul risultato del confronto.
//Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.
public class Stringhe {
    public static void main(String[] args) {
        StringBuilder frase1= new StringBuilder("Oggi è domenica");
        StringBuilder frase2= new StringBuilder ("Domani è domenica");


        if(frase1.equals(frase2)){
            System.out.println("Le due stringhe sono uguali");
        }else{
            System.out.println("Le due stringhe sono differenti");
        }
    }


}
