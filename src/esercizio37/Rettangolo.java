package esercizio37;
enum tipoForma1{
    Rettangolo;
}
public class Rettangolo extends Forma{
    int num1 = 3;
    int num2 = 3;
    int area = num1 * num2*3;
private final tipoForma1 rettagolo;

    public Rettangolo(tipoForma1 rettagolo) {
        this.rettagolo = rettagolo;
    }

    public static int calcolaArea(int num1,int num2) {

        int area = num1 * num2*3;
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
