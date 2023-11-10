package esercizio37;


public class Triangolo extends Forma {
    int num1 = 3;
    int num2 = 5;


    public Triangolo(tipoForma forma) {
        super(forma);
    }
    @Override
    public float calcolaArea() {
        float area = (float)(num1 * num2)/2;
        return area;
    }
}


