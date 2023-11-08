package esercizio34;
//A partire dal programma creato precedentemente in cui si richiedeva il
// calcolo dell'area aggiungere una ulteriore classe chiamata
// Triangolo supportando poi il calcolo dell'area per quest'ultima figura
public class Triangolo extends Rettangolo{

    private int base1;
    private int altezza1;

    public Triangolo (int base1, int altezza1) {
        super();
        this.base1 = base1;
        this.altezza1 = altezza1;
    }

    @Override
    public int calcolaArea() {
        int area = base1 * altezza1;
        return area;
    }
}
