public class Main {
    static void main(String[] args) {
        ProdottoLego primoProdotto = new ProdottoLego("Casa", 100);

        Rgb rosso = new Rgb(255,0,0);
        MattoncinoLego primoMattoncino = new MattoncinoLego(rosso, 3, new Dimensione3D());
        primoProdotto.aggiungiMattoncino(primoMattoncino);

        MattoncinoLego[] arrMattoncini = new MattoncinoLego[3];
        arrMattoncini[0] = new MattoncinoLego(new Rgb(2,5,4), 10, new Dimensione3D(2,1,2));
        arrMattoncini[2] = new MattoncinoLego(primoMattoncino);
        primoProdotto.aggiungiMattoncino(arrMattoncini);

        System.out.println("Ho creato il prodotto e inserito vari mattoncini, singoli e array");
        System.out.println(primoProdotto);

        System.out.println();
        System.out.println("Verifico il numero di mattoncini nel prodotto");
        System.out.println(primoProdotto.numeroMattoncini());

        System.out.println();
        System.out.println("Verifico il peso del prodotto");
        System.out.println(primoProdotto.peso());

        System.out.println();
        System.out.println("Elenco i mattoncini con rgb specifico nel prodotto");
        MattoncinoLego[] elenco = primoProdotto.elencoMattonciniDiColore(rosso);
        for (int i = 0; i<elenco.length && elenco[i] != null; i++){
            System.out.println(elenco[i]);
        }

        System.out.println();
        System.out.println("Verifico il numero di mattoncini con codice specifico presenti nel prodotto");
        System.out.println(primoProdotto.numeroMattonciniConCodice(0));

        System.out.println();
        System.out.println("Copio il prodotto e verifico se siano uguali le copie");
        ProdottoLego copiaProdotto = new ProdottoLego(primoProdotto);
        System.out.println(primoProdotto.equals(copiaProdotto));

        System.out.println();
        System.out.println("Creo un nuovo prodotto e verifico che sia diverso dal precedente");
        ProdottoLego secondoProdotto = new ProdottoLego();
        System.out.println(primoProdotto.equals(secondoProdotto));

    }
}
