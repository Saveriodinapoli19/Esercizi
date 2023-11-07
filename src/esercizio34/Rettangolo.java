package esercizio34;



public class Rettangolo extends Forma {
    private int x = 6;
    private int y = 6;
    private int z = x * y;


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Rettangolo(int x, int y){
        this.x = x;
        this.y = y;
        this.z = z;
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









