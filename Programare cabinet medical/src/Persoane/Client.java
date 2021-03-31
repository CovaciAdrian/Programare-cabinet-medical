package Persoane;

public class Client extends Persoana{

    private String genClient;
    private String problemaClient;

    Client (){

        this.nume = " ";
        this.varsta = 0;
        this.genClient = " ";
        this.problemaClient = " ";

    }

    Client ( String nume, int varsta, String genClient, String problemaClient){

        this.nume = nume;
        this.varsta = varsta;
        this.genClient = genClient;
        this.problemaClient = problemaClient;

    }

    public String getProblemaClient(){

        return problemaClient;

    }

    public String toString(){

        return ( nume + " " + varsta + " " + genClient + " " + problemaClient);

    }

}
