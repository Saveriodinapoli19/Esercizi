package esercizio33;
//Scrivere un programma che contenga una classe chiamata
// Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma.
//Crea poi una sottoclasse chiamata Rettangolo che
// fa override del metodo calcolaArea() per calcolare l'area del rettangolo.
 class Forma  {
  public static void main(String[] args){

      Rettangolo rettangolo1= new Rettangolo(6,6 );
      System.out.println(rettangolo1);
      System.out.println("L' Area della forma è = " + calcolaArea());


  }



    public static int calcolaArea() {
    int x= 5;
    int y=5;
    int z= x*y;
return z;
  }



}