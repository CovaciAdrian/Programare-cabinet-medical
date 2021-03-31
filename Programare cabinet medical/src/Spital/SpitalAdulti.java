package Spital;

public class SpitalAdulti extends Spital{

    protected boolean personalCuRabdare;

    SpitalAdulti(String numeSpital, String locatie, int locuriLibere, boolean personalCuRabdare){

        this.numeSpital = numeSpital;
        this.locatie = locatie;
        this.locuriLibere = locuriLibere;
        this.personalCuRabdare = false;

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
