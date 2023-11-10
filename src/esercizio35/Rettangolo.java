package esercizio35;

public  class Rettangolo extends Forma {
    private int base;
    private int altezza;

    public Rettangolo(int base, int altezza){
        this.base= base;
        this.altezza=altezza;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", area=" + calcolaArea() +
                '}';
    }

    @Override
    public int calcolaArea() {
        int area = base * altezza;
        return area;
    }



}


