package esercizio35;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo= new Rettangolo();
        Triangolo triangolo= new Triangolo();
        rettangolo.calcolaArea();
        triangolo.calcolaArea();

        System.out.println(rettangolo);
        System.out.println(triangolo);
    }


}
