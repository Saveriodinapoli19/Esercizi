package esercizio34;
//A partire dal programma creato precedentemente in cui si richiedeva il
// calcolo dell'area aggiungere una ulteriore classe chiamata
// Triangolo supportando poi il calcolo dell'area per quest'ultima figura
public class Triangolo extends Rettangolo{

    public Triangolo(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "x=" +getX()+
                ", y=" + getY() +
                ", z=" + getZ() +
                '}';
    }
}
