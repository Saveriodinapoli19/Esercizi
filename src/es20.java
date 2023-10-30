//Scrivi un programma che contenga un metodo che prende
//in ingresso un valore numerico e restituisca la tabellina
// aritmetica di quel numero che dovrà essere stampata a video.
public class es20 {
    public static void main(String[] args)
    { int x = 3; ciclo(x);
    }
    public static void ciclo(int numero) {
        for (int x = 0; x <= 10; x++) {
            System.out.println(x + " x " + numero + " = " + x * numero);
        }
    }
}