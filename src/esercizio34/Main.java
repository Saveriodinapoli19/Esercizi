package esercizio34;


public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        int areaForma = forma.calcolaArea();
        System.out.println("Area forma: " + areaForma);

        Rettangolo rettangolo = new Rettangolo(6, 5);
        int areaRettangolo = rettangolo.calcolaArea();
        System.out.println("Area rettangolo: " + areaRettangolo);
        Triangolo triangolo= new Triangolo(5, 7);
        int areaTriangolo= triangolo.calcolaArea();
        System.out.println("Area triangolo: " + areaTriangolo );




    }
}