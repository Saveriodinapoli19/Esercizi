package esercizio36;

public class Triangolo implements Forma{
    private int base;
    private int altezza;
    private int area= base*altezza/2;


    public Triangolo(int num1, int num2){
        this.base= num1;
        this.altezza= num2;


    }


    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", area=" + area +
                '}';
    }

    @Override
    public int calcolaArea() {
        int area= base*altezza/2;
        return area;
    }
}
