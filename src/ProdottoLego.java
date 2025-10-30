public class ProdottoLego {
    private int codiceIdentificativo;
    private static int incrementoCodice = 0;
    private String denominazione;
    private MattoncinoLego[] arrayMattoncini;
    private int arraySize = 0;

    public void aggiungiMattoncino(MattoncinoLego mattoncino){
        if(arraySize < arrayMattoncini.length){
            aggiungi(mattoncino);
        }else {
            aumentaDimArray();
            aggiungi(mattoncino);
        }
    }

    private void aggiungi(MattoncinoLego mattoncino){
        int indice = trovaIndiceArray(mattoncino);
        if(indice != arraySize) {
            for (int i = arraySize; i > indice; i--) {
                arrayMattoncini[i] = arrayMattoncini[i - 1];
            }
        }
        arrayMattoncini[indice] = mattoncino;
        arraySize++;
    }

    private int trovaIndiceArray(MattoncinoLego mattoncino){
        if (arraySize == 0){
            return 0;
        }
        int i = 0;
        while (i<arraySize && arrayMattoncini[i].getCodiceIdentificativo() <= mattoncino.getCodiceIdentificativo()){
            i++;
        }
        return i;
    }

    private void aumentaDimArray(){
        MattoncinoLego[] nuovoArrayMattoncini = new MattoncinoLego[arrayMattoncini.length*2];
        for (int i = 0; i<arrayMattoncini.length; i++){
            nuovoArrayMattoncini[i] = arrayMattoncini[i];
        }
        arrayMattoncini = nuovoArrayMattoncini;
    }

    public void aggiungiMattoncino(MattoncinoLego[] mattoncini){
        for (int i = 0; i<mattoncini.length; i++){
            if(mattoncini[i] != null){
                aggiungiMattoncino(mattoncini[i]);
            }
        }
    }

    public int numeroMattoncini(){
        return arraySize;
    }

    public float peso(){
        float pesoTotale = 0;
        for (int i = 0; i<arraySize; i++){
            pesoTotale += arrayMattoncini[i].getPeso();
        }
        return pesoTotale;
    }

    public MattoncinoLego[] elencoMattonciniDiColore(Rgb colore){
        MattoncinoLego[] elencoMattoncini = new MattoncinoLego[arraySize];
        int a = 0;
        for (int i = 0; i<arraySize; i++){
            if (arrayMattoncini[i].getColore().equals(colore)){
                elencoMattoncini[a++] = arrayMattoncini[i];
            }
        }
        return elencoMattoncini;
    }

    public int numeroMattonciniConCodice(int codiceIdentificativo){
        int num = 0;
        for (int i = 0; i<arraySize; i++){
            if (arrayMattoncini[i].getCodiceIdentificativo() == codiceIdentificativo){
                num++;
            }
        }
        return num;
    }

    public ProdottoLego(){
        codiceIdentificativo = incrementoCodice++;
        denominazione = "set " + codiceIdentificativo;
        arrayMattoncini = new MattoncinoLego[1000];
    }

    public ProdottoLego(String denominazione, int pezziSet){
        codiceIdentificativo = incrementoCodice++;
        this.denominazione = denominazione;
        arrayMattoncini = new MattoncinoLego[pezziSet];
    }

    public ProdottoLego(ProdottoLego prodottoDaCopiare){
        this(prodottoDaCopiare.denominazione, prodottoDaCopiare.arrayMattoncini.length);
        codiceIdentificativo = prodottoDaCopiare.codiceIdentificativo;
        for (int i = 0; i<prodottoDaCopiare.arraySize; i++){
            this.aggiungi(prodottoDaCopiare.arrayMattoncini[i]);
        }
    }

    public boolean equals(ProdottoLego prodottoDaConfrontare){
        if (prodottoDaConfrontare.arraySize != arraySize){
            return false;
        }
        for (int i = 0; i<arraySize; i++){
            if (!arrayMattoncini[i].equals(prodottoDaConfrontare.arrayMattoncini[i])){
                return false;
            }
        }
        return codiceIdentificativo == prodottoDaConfrontare.codiceIdentificativo && denominazione.equals(prodottoDaConfrontare.denominazione);
    }

    public String toString(){
        return "Prodotto[codice: " + codiceIdentificativo + ", denominazione: " + denominazione + ", mattoncini: " + arryToString() + "]";
    }

    private String arryToString(){
        String arr = "[";
        for (int i = 0; i<arraySize; i++){
            arr += "C: " + arrayMattoncini[i].getCodiceIdentificativo();
            if(i< arraySize-1){
                arr += ", ";
            }
        }
        arr += "]";
        return arr;
    }
}
