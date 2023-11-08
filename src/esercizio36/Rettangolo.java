package esercizio36;

public class Rettangolo implements Forma{

    private int num1=5;
    private int num2=3;
    private int area= num1*num2;


    @Override
    public int calcolaArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", area=" + area +
                '}';
    }
}
