package esercizio35;

public class Triangolo extends Forma{
    private int base;
    private int altezza;
    private int area= base*altezza/2;


    public Triangolo(int base, int altezza){
        this.base= base;
        this.altezza= altezza;
    }
    @Override
    public int calcolaArea() {
        int area = base * altezza/2;
        return area;
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", area=" + area +
                '}';
    }
}
