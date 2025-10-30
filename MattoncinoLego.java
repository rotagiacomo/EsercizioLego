public class MattoncinoLego {
    private int codiceIdentificativo;
    static private int incrementoCodice = 0;
    private Rgb colore;
    private float peso;

    public void setColore(Rgb colore) {
        this.colore = colore;
    }

    public void setPeso(float peso) {
        this.peso = peso;
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

    public MattoncinoLego(){
        codiceIdentificativo = incrementoCodice++;
        colore = new Rgb();
        peso = 1;
    }

    public MattoncinoLego(Rgb colore, float peso){
        codiceIdentificativo = incrementoCodice++;
        this.colore = colore;
        this.peso = peso;
    }

    public MattoncinoLego(MattoncinoLego mattoncinoDaCopiare){
        codiceIdentificativo = mattoncinoDaCopiare.codiceIdentificativo;
        colore = mattoncinoDaCopiare.colore;
        peso = mattoncinoDaCopiare.peso;
    }

    public boolean equals(MattoncinoLego mattoncinoDaConfrontare){
        return codiceIdentificativo == mattoncinoDaConfrontare.codiceIdentificativo && colore.equals(mattoncinoDaConfrontare.colore) && peso == mattoncinoDaConfrontare.peso;
    }

    public String toString(){
        return "Mattoncino[codice: " + codiceIdentificativo + ", colore: " + colore + ", peso: " + peso + "]";
    }
}
