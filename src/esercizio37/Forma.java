package esercizio37;
enum tipoForma{
    Rettangolo,
    Triangolo;
}
public class Forma {
    protected tipoForma forma;

    public Forma(tipoForma forma) {
        this.forma = forma;
    }

    public float calcolaArea() {
            return 0;
    }

    @Override
    public String toString() {
        return "Io sono un: "+forma.name();
    }
}
