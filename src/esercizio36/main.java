package esercizio36;
//Scrivere un programma che contenga una interfaccia
//Forma ed un metodo chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che implementano
//Forma ed implementano il metodo per il calcolo dell'area.
public class main {
    public static void main(String[] args) {
        Rettangolo rettangolo= new Rettangolo(6,6);
        Triangolo triangolo= new Triangolo(10,5);

        System.out.println("L'Area del Rettangolo è = " + rettangolo.calcolaArea());
        System.out.println("L'Area del Triangolo è = " + triangolo.calcolaArea());
    }

}

