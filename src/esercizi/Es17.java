package esercizi;

//Scrivi un programma che contenga un metodo che prende
//in ingresso un valore numerico e restituisca il nome del
// giorno della settimana come stringa o una stringa
//di errore nel caso di valore maggiore di 7 o minore di 1.
public class Es17 {
    public static void main(String[] args) {
        int dayNumber = 9;
        String dayWeek= dayName(dayNumber);
    System.out.println(dayWeek);
    }

public static String dayName(int dayNumber){
  String weekDay= "";
        switch(dayNumber){
       case 1:
           weekDay= ("Il giorno della settimana è lunedì");
           break;
       case 2:
           weekDay=("Il giorno della settimana è martedì");
           break;

       case 3:
           weekDay=("Il giorno della settimana è mercoledì");
           break;
       case 4:
           weekDay=("Il giorno della settimana è giovedì");
           break;

       case 5:
           weekDay=("Il giorno della settimana è venerdì");
           break;
       case 6:
           weekDay=("Il giorno della settimana è sabato");
           break;
       case 7:
           weekDay=("Il giorno della settimana è domenica");
           break;
       default:
           System.out.println("error day not found");


   }

    return weekDay;
}

}