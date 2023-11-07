package esercizio35;

public class Triangolo extends Forma{
    int x= 2;
    int y= 10;
    int z= x*y;
    @Override
    public int calcolaArea() {

        return z;
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
