package Lab2.Challenge2;

public class Actor {
    private String nume;
    private int varsta;
    private Premiu[] premii;

    public Actor (String nume, int varsta, Premiu[] premii){
        this.nume=nume;
        this.varsta=varsta;
        this.premii=premii;
    }
    public String getNume(String nume ){
        return nume;

    }

}
