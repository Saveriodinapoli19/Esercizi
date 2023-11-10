package esercizi;

//Scrivi un programma che contenga un metodo che prende in
// ingresso un carattere e ne identifica il tipo per un operazione di
// algebra (+ addizione - sottrazione * moltiplicazione / divisione).
//Nel caso non riesca ad identificare il tipo di operazione dovrà
// restituire una stringa di errore.
public class es18 {
    public static void main(String[] args){
    char x= '/';
   char y= carattere(x);
    }
public static char carattere(char x){
    switch(x){
        case '+':
            System.out.println("addizione");
          break;
        case '-':
            System.out.println("sottrazione");
            break;
        case '*':
            System.out.println("moltiplicazione");
          break;
        case '/':
            System.out.println("divisione");
           break;
        default:
            System.out.println("error");
    }
return x;
    }
}
