//Scrivi un programma Java che abbia un metodo che prenda due
// stringhe e le compari lessico-graficamente.
//
//Il metodo dovrà restituire "Le due stringhe sono uguali" o
// "Le due stringhe sono differenti" basandosi sul risultato del confronto.
//Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.
public class Stringhe {
    public static void main(String[] args) {
            String Frase1 = "Hello";
            String Frase2 = "World";

            String risultatoConfronto = confrontaStringhe(Frase1, Frase2);

            System.out.println(risultatoConfronto);
        }

        public static String confrontaStringhe(String stringa1, String stringa2) {
            int confronto = stringa1.compareTo(stringa2);
            StringBuilder risultato = new StringBuilder("Le due stringhe sono ");

            if (confronto == 0) {
                risultato.append("uguali");
            } else {
                risultato.append("differenti");
            }

            return risultato.toString();
        }
    }


