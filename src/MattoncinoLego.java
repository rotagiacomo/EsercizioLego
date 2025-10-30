public class MattoncinoLego {
    private int codiceIdentificativo;
    static private int incrementoCodice = 0;
    private Rgb colore;
    private float peso;
    private Dimensione3D dimensione;

    public void setColore(Rgb colore) {
        this.colore = colore;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setDimensione(Dimensione3D dimensione) {
        this.dimensione = dimensione;
    }

    public int getCodiceIdentificativo() {
        return codiceIdentificativo;
    }

    public Rgb getColore() {
        return colore;
    }

    public float getPeso() {
        return peso;
    }

    public Dimensione3D getDimensione(){
        return dimensione;
    }

    public MattoncinoLego(){
        codiceIdentificativo = incrementoCodice++;
        colore = new Rgb();
        peso = 1;
        dimensione = new Dimensione3D();
    }

    public MattoncinoLego(Rgb colore, float peso, Dimensione3D dimensione){
        codiceIdentificativo = incrementoCodice++;
        this.colore = colore;
        this.peso = peso;
        this.dimensione = dimensione;
    }

    public MattoncinoLego(MattoncinoLego mattoncinoDaCopiare){
        codiceIdentificativo = mattoncinoDaCopiare.codiceIdentificativo;
        colore = mattoncinoDaCopiare.colore;
        peso = mattoncinoDaCopiare.peso;
        dimensione = mattoncinoDaCopiare.dimensione;
    }

    public boolean equals(MattoncinoLego mattoncinoDaConfrontare){
        return codiceIdentificativo == mattoncinoDaConfrontare.codiceIdentificativo && colore.equals(mattoncinoDaConfrontare.colore) && peso == mattoncinoDaConfrontare.peso && dimensione.equals(mattoncinoDaConfrontare.dimensione);
    }

    public String toString(){
        return "Mattoncino[codice: " + codiceIdentificativo + ", colore: " + colore + ", peso: " + peso + ", dimensione: " + dimensione + "]";
    }
}
