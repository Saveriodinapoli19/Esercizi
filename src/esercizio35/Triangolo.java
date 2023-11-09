package esercizio35;

public class Triangolo extends Forma{
    private int base=5;
    private int altezza=10;
    private int area= base*altezza/2;

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
