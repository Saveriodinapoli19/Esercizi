package esercizio39;

public class Esercizio39 {
    public static void main(String[] args) {
        String frase = "Oggi è domenica";
        int indiceValido = 5;
        OttieniUnicode ottieniUnicode = new OttieniUnicode();
        System.out.println(ottieniUnicode.ottieniCarattereUnicode(frase, indiceValido));
        int indiceNonValido = 89;
        System.out.println(ottieniUnicode.ottieniCarattereUnicode(frase, indiceNonValido));

    }
}
