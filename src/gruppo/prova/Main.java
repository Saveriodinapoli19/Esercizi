package gruppo.prova;

public class Main {
    public static void main(String[] args) {
        Gatto gatto= new Gatto();
        Animale animale = new Animale();
        Animale.faiIlVerso();
        Gatto.faiIlVerso();
        System.out.println("Il Gatto " + gatto);
        System.out.println(animale);
    }
}
