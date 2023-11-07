package esercizio34;
class Forma {
    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(6, 6);
        Triangolo triangolo= new Triangolo(6,6);
        System.out.println(rettangolo1);
        System.out.println("L' Area della forma è = " + calcolaArea());
        System.out.println(triangolo);


    }


    public static int calcolaArea() {
        int x = 5;
        int y = 5;
        int z = x * y;
        return z;
    }
}
