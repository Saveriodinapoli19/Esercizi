package esercizio35;

public  class Rettangolo extends Forma {
   int x= 6;
   int y= 6;
   int z= x*y;
    @Override
    public int calcolaArea() {
        return z;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}


