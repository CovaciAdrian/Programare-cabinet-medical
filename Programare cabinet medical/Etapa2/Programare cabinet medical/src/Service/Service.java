package Service;

import Persoane.*;

public class Service {

    public static void afisareBarbati(Client[] pacient, Medic[] medici){

        for(int i = 0; i < medici.length; i++){

            for(int j = 0; j < pacient.length; j++){

                if(pacient[j]!=null)
                if(pacient[j].getGenClient() == "barbat")
                System.out.println("Medicul " + medici[i].getNumeMedic() + " il are ca pacient pe " + pacient[j].getNume());

            }

            System.out.println();

        }

    }

    public static void numarFemei(Client[] pacient, Medic[] medici){

        for(int i = 0; i < medici.length; i++){

            int contor = 0;

            for(int j = 0; j < pacient.length; j++){

                if(pacient[j]!=null)
                    if(pacient[j].getGenClient() == "femeie" && pacient[j].getProblemaClient() == medici[i].getSpecialitateMedic() )
                        contor++;

            }

            if(medici[i]!=null)
            System.out.println("Medicul " + medici[i].getNumeMedic() + " are " + contor + " femei la control");


            System.out.println();

        }

        System.out.println();

    }

}
