package esercizio35;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo= new Rettangolo(6,5);
        Triangolo triangolo= new Triangolo(10,5);
        int areaRettangolo = rettangolo.calcolaArea();
        int areaTriangolo = triangolo.calcolaArea();

        System.out.println("L'area del rettangolo è : " + areaRettangolo);
        System.out.println("L'area del triangolo è : "  + areaTriangolo);
    }


}
