package oggetti;

public class studente {
    private String nome;
    private String cognome;
    private int id;


    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public int getId() {
        return id;
    }

    public studente(String nome, String cognome, int id){
        this.nome=nome;
        this.cognome=cognome;
        this.id=id;
    }

    @Override
    public String toString() {
        return "studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", id=" + id +
                '}';
    }
}