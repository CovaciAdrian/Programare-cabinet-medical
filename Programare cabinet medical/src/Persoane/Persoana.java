package Persoane;

public class Persoana {

    protected String nume;
    protected int varsta;

    Persoana(){

        this.nume = " ";
        this.varsta = 0;

    }

    Persoana ( String nume, int varsta){

        this.nume = nume;
        this.varsta = varsta;

    }

    public String getNume(){

        return nume;

    }

}
