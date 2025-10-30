public class Dimensione3D {
    private float larghezza;
    private float lunghezza;
    private float altezza;

    public void setLarghezza(float larghezza) {
        if (larghezza > 0){
            this.larghezza = larghezza;
        }else {
            this.larghezza = -1;
        }
    }

    public void setLunghezza(float lunghezza) {
        if (lunghezza > 0){
            this.lunghezza = lunghezza;
        }else {
            this.lunghezza = -1;
        }
    }

    public void setAltezza(float altezza) {
        if (altezza > 0){
            this.altezza = altezza;
        }else {
            this.altezza = -1;
        }
    }

    public float getLarghezza() {
        return larghezza;
    }

    public float getLunghezza() {
        return lunghezza;
    }

    public float getAltezza() {
        return altezza;
    }

    public Dimensione3D(){
        larghezza = 1;
        lunghezza = 1;
        altezza = 1;
    }

    public Dimensione3D(float larghezza, float lunghezza, float altezza){
        this.setLarghezza(larghezza);
        this.setLunghezza(lunghezza);
        this.setAltezza(altezza);
    }

    public Dimensione3D(Dimensione3D dimensioneDaCopiare){
        this(dimensioneDaCopiare.larghezza, dimensioneDaCopiare.lunghezza, dimensioneDaCopiare.altezza);
    }

    public boolean equals(Dimensione3D dimDaConfrontare){
        return larghezza == dimDaConfrontare.larghezza && lunghezza == dimDaConfrontare.lunghezza && altezza == dimDaConfrontare.altezza;
    }

    public String toString(){
        return "Dim3D[largezza: " + larghezza + ", lunghezza: " + lunghezza + ", altezza: " + altezza + "]";
    }
}
