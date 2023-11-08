package esercizio34;




public class Rettangolo extends Forma {
    private int base;
    private int altezza;

    public Rettangolo (int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public Rettangolo() {

    }

    @Override
    public int calcolaArea() {
        int area = base * altezza;
        return area;
    }
}








