package esercizio30;

public class auto {
    private int cilindrata;
    private String modello;
    private String targa;
    private String marca;


    public int getCilindrata(){
        return cilindrata;
    }

    public String getModello() {
        return modello;
    }
    public String getTarga() {
        return targa;
    }
    public String getMarca() {

        return marca;

    }


     public auto( int cilindrata, String modello, String targa, String marca){
            this.cilindrata = cilindrata;
            this.modello = modello;
            this.targa = targa;
            this.marca = marca;

        }

    @Override
    public String toString() {
        return "auto{" +
                "cilindrata=" + cilindrata +
                ", modello='" + modello + '\'' +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}

