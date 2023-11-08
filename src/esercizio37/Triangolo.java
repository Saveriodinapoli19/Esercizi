package esercizio37;

enum tipoForma{
    Triangolo;
}
public class Triangolo extends Forma {
    int num1 = 3;
    int num2 = 5;
    int area = num1 * num2;

    public Triangolo(tipoForma triangolo) {
        this.triangolo = triangolo;
    }

    public static int calcolaArea(int num1, int num2) {
        int area = num1 * num2;
        return area;
    }
private final tipoForma triangolo;
    @Override
    public String toString() {
        return "Triangolo{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", area=" + area +
                '}';
    }
}


