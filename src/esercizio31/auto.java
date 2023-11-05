package esercizio31;
//cilindrata, targa, marca e modello.
public class auto {
    private int cilindrata;
    private String targa;
    private String marca;
    private String  modello;

    public void setCilindrata(int cilindrata1){
        cilindrata=cilindrata1;
    }
    public int getCilindrata(){
        return cilindrata;
    }
    public void setTarga(String targa1){
        targa=targa1;
    }
    public String getTarga(){
        return targa;
    }
    public void setMarca(String marca1){
        marca=marca1;
    }
    public String getMarca(){
        return marca;
    }
    public void setModello(String modello1){
        modello=modello1;
    }
    public String getModello(){
        return modello;
    }


    @Override
    public String toString() {
        return "auto{" +
                "cilindrata=" + cilindrata +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}
