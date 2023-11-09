package esercizio37;


public class Triangolo extends Forma {
    int num1 = 3;
    int num2 = 5;
    int area = num1 * num2;

    private final tipoForma Triangolo;

    public Triangolo(tipoForma triangolo) {
        this.Triangolo = triangolo;
    }

    public static int calcolaArea(int num1, int num2) {
        int area = num1 * num2;
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


