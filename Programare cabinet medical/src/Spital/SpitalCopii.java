package Spital;

public class SpitalCopii extends Spital{

    protected boolean personalCuRabdare;

    SpitalCopii( String numeSpital, String locatie, int locuriLibere, boolean personalCuRabdare){

        this.numeSpital = numeSpital;
        this.locatie = locatie;
        this.locuriLibere = locuriLibere;
        this.personalCuRabdare = true;

    }

    @Override
    public int getLocuriLibere() {
        return super.getLocuriLibere();
    }

    @Override
    public String getNumeSpital() {
        return super.getNumeSpital();
    }

    @Override
    public String getLocatie() {
        return super.getLocatie();
    }

    public boolean isPersonalCuRabdare() {
        return personalCuRabdare;
    }
}
