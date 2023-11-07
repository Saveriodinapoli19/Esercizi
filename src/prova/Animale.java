package prova;
//Scrivere un programma che contenga una classe
// chiamata Animale ed un metodo chiamato faiIlVerso() che stampi il verso dell'animale.
//Crea poi una sottoclasse chiamata Gatto
// che fa override del metodo faiIlVerso() per miagolare. Prova
// quindi a far stampare il verso di
//Animale e di Gatto.
 class Animale {
   public static void faiIlVerso(){
       System.out.println("Gli animali fanno versi");
   }

    public static void main(String[] args) {
        Gatto gatto= new Gatto();
        gatto.faiIlVerso();
        Animale.faiIlVerso();

        System.out.println("Il gatto : " + gatto);



    }




}
