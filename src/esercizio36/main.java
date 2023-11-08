package esercizio36;
//Scrivere un programma che contenga una interfaccia
//Forma ed un metodo chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che implementano
//Forma ed implementano il metodo per il calcolo dell'area.
public class main {
    public static void main(String[] args) {
        Rettangolo rettangolo= new Rettangolo();
        Triangolo triangolo= new Triangolo();
        rettangolo.calcolaArea();
        triangolo.calcolaArea();
        System.out.println("L'Area del Rettangolo è = " + rettangolo);
        System.out.println("L'Area del Triangolo è = " + triangolo);
    }

}

