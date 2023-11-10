package esercizio39;//Scrivi un programma Java che abbia un metodo che prenda il carattere
// in Unicode in un indice specifico all'interno di una stringa e lo stampi.
//
//Il metodo dovrà avere nel costruttore una stringa ed
// una posizione e dovrà resituire il carattere in unicode o una stringa di errore.
//Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.

//Il indexOf()metodo restituisce l' indice (la posizione) della prima occorrenza
// di un testo specificato in una stringa (inclusi gli spazi bianchi):



public class OttieniUnicode {

     public String ottieniCarattereUnicode(String frase, int indice) {
        StringBuilder risultato = new StringBuilder();

        if (indice >= 0 && indice < frase.length()) {
            char carattere = frase.charAt(indice);
            risultato.append("Il carattere Unicode all'indice ")
                    .append(indice)
                    .append(" è: \\u ")
                    .append(Integer.toHexString(carattere | 0x10000).substring(1));
        } else {
            risultato.append("Errore: Indice non valido.");
        }

        return risultato.toString();
    }
}


