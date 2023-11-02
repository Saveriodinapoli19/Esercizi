//Scrivere un programma che contenga una
// classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
//Per questa classe saranno necessari i metodi accessori
// (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Auto.
package esercizio30;

public class es30 {
    public static void main(String[] args) {
        auto auto1 = new auto(1400, "Panda", "AB123CD", "Fiat");
    System.out.println("Auto:"+ auto1);
        }
    }