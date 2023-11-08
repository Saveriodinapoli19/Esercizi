package esercizio36;

public class Triangolo implements Forma{
    private int num1=10;
    private int num2=5;
    private int area= num1*num2;

    @Override
    public int calcolaArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", area=" + area +
                '}';
    }
}
