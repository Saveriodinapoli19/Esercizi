package esercizio35;

public  class Rettangolo extends Forma {
    private int base=6;
    private int altezza=5;
    private int area= base*altezza;

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", area=" + area +
                '}';
    }

    @Override
    public int calcolaArea() {
        int area = base * altezza;
        return area;
    }



}


