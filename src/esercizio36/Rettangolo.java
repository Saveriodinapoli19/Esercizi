package esercizio36;

public class Rettangolo implements Forma{

    private int base;
    private int altezza;



    public Rettangolo(int num1, int num2){
        this.base= num1;
        this.altezza= num2;


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
        int area= base*altezza;
        return area;
    }
}


