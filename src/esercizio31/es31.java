//Scrivere un programma che contenga una classe che definisce un
//Auto che abbia come proprietà cilindrata, targa, marca e modello.
//Per questa classe saranno necessari
// i metodi accessori (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Auto.
//In questo caso la nota importante è rendere le proprietà
// della classe auto accessibili solo attraverso i metodi
package esercizio31;

public class es31 {
    public static void main(String[] args){
        auto auto= new auto();
        auto.setCilindrata(1500);
        auto.setTarga("AB123CD");
        auto.setMarca("FIAT");
        auto.setModello("PANDA");
    System.out.println(auto);
    }






}
