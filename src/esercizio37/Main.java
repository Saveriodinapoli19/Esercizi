package esercizio37;
//Scrivere un programma che contenga una classe chiamata Forma
// ed un metodo chiamato calcolaArea()
// che stampi l'area della forma specifica.
//Crea poi due sottoclassi Triangolo e
// Rettangolo che estendono Forma e che abbiano un
// tipo che ne identifichi la Forma in maniera univoca usando una enum.
public class Main {
    public static void main(String[] args) {
        Triangolo triangolo= new Triangolo(tipoForma.Triangolo);
        Rettangolo rettangolo= new Rettangolo(tipoForma.Rettangolo);

        Rettangolo.calcolaArea();
        Triangolo.calcolaArea();

        System.out.println("L'Area del rettangolo è = " + rettangolo);
        System.out.println("L'Area del triangolo è = " + triangolo);
    }
}
