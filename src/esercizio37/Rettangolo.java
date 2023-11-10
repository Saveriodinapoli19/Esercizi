package esercizio37;

public class Rettangolo extends Forma{
    int num1 = 3;
    int num2 = 3;

    public Rettangolo(tipoForma forma) {
        super(forma);
    }

    @Override
    public float calcolaArea() {

        float area = num1 * num2;
        return area;
    }
}
