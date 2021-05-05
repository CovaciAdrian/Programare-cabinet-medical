package Service;

import Persoane.*;
import Spital.*;
import Service.*;

import java.util.Scanner;

public class Meniu implements Audit {

    public void meniu(Client[] pacient, Medic[] medic, Spital[] spital) {
        System.out.println("------Selectati o optiune :------");
        System.out.println();
        System.out.println("1.Afisare numar pacienti");
        System.out.println("2. Afisare nume pacienti");
        System.out.println("3. Afisare spitale cu locuri libere");
        System.out.println("4. Afisare medici in functie de specializarea lor");
        System.out.println("5. Adaugare pacienti fiecarui medic ( fiecare pacient viziteaza toti medicii din sectia cu probleme )");
        System.out.println("6. Numarul de pacienti pentru fiecare medic");
        System.out.println("7. Afisare toti barbatii care sunt asignati pentru fiecare medic");
        System.out.println("8. Cate femei sunt atribuite fiecarui medic pentru control");
        System.out.println("9.Iesire");
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("Introduceti numarul corespunzator comenzii pe care doriti sa o executati :");
        Scanner scanner = new Scanner(System.in);
        int comanda = scanner.nextInt();
        Service service = new Service();
        while (comanda >= 10) {
            System.out.println("Alegeti o optiune valida.");
            comanda = scanner.nextInt();
        }

        do {

            switch (comanda) {
                case 1: {
                    audit("Afisare numar pacienti");

                    System.out.println();
                    System.out.println("In total sunt " + pacient.length + " pacienti.");


                }

                break;

                case 2: {
                    audit("Afisare nume pacienti");


                    System.out.println();
                    for(int i=0; i< pacient.length; i++){

                        pacient[i].Afisare();

                    }
                }

                break;

                case 3: {
                    audit("Afisare spitale cu locuri libere");


                    for(int i=0; i< spital.length; i++){

                        if(spital[i]!=null)
                        if(spital[i].getLocuriLibere()!=0){
                            System.out.println(spital[i].getNumeSpital());
                        }

                    }
                }

                break;

                case 4: {
                    audit("Afisare medici in functie de specializarea lor");


                    for(int i=0; i< medic.length; i++){

                        if(medic[i].getSpecialitateMedic().equals("chirurg")) {
                            System.out.println( "Medicul " + medic[i].getNumeMedic() + " este " + medic[i].getSpecialitateMedic());
                        }

                    }

                    System.out.println();

                    for(int i=0; i< medic.length; i++){

                        if(medic[i].getSpecialitateMedic().equals("familie")) {
                            System.out.println( "Medicul " + medic[i].getNumeMedic() + " este de " + medic[i].getSpecialitateMedic());
                        }

                    }

                    System.out.println();

                    for(int i=0; i< medic.length; i++){


                        if(medic[i].getSpecialitateMedic().equals("ortoped")) {
                            System.out.println( "Medicul " + medic[i].getNumeMedic() + " este " + medic[i].getSpecialitateMedic());
                        }

                    }

                    System.out.println();

                    for(int i=0; i< medic.length; i++){

                        if(medic[i].getSpecialitateMedic().equals("psihiatru")) {

                            System.out.println( "Medicul " + medic[i].getNumeMedic() + " este " + medic[i].getSpecialitateMedic());
                        }

                    }

                    System.out.println();
                }

                break;
                case 5: {
                    audit("Adaugare pacienti fiecarui medic ( fiecare pacient viziteaza toti medicii din sectia cu probleme )");


                    for (int i = 0; i < medic.length; i++) {

                        for (int j = 0; j < pacient.length; j++) {

                            if(pacient[j]!=null)
                                if (pacient[j].getProblemaClient().equals(medic[i].getSpecialitateMedic()) && pacient[j].getAles() == 0 )

                                    medic[i].adaugaPacientiMedicului(pacient[j]);
                                    ///pacient[j].setAles(1);

                        }

                    }
                }

                break;


                case 6: {
                    audit("Numarul de pacienti pentru fiecare medic");


                    for (int i = 0; i < medic.length; i++) {

                        if(medic[i]!=null)
                        System.out.println("Medicul " + medic[i].getNumeMedic() + " are " + medic[i].getNumarPacientiMedic() + " pacienti.");

                    }
                }

                break;

                case 7: {
                    audit("Afisare toti barbatii care sunt asignati pentru fiecare medic");

                    Service.afisareBarbati(pacient, medic);

                }

                break;

                case 8: {
                    audit("Cate femei sunt atribuite fiecarui medic pentru control");

                    Service.numarFemei(pacient, medic);
                }

                break;

                case 9: {
                    audit("Iesire din aplicatie");
                    System.exit(0);
                }

                break;
            }
            System.out.println("Mai doriti sa executati alta comanda?");
            System.out.println("1.Da        2.Nu (Iesire) ");
            int reset = scanner.nextInt();
            if (reset == 1)
            {
                System.out.println("------Selectati o optiune :------");
                System.out.println();
                System.out.println("1.Afisare numar pacienti");
                System.out.println("2. Afisare nume pacienti");
                System.out.println("3. Afisare spitale cu locuri libere");
                System.out.println("4. Afisare medici in functie de specializarea lor");
                System.out.println("5. Adaugare pacienti fiecarui medic ( fiecare pacient viziteaza toti medicii din sectia cu probleme )");
                System.out.println("6. Numarul de pacienti pentru fiecare medic");
                System.out.println("7. Afisare toti barbatii care sunt asignati pentru fiecare medic");
                System.out.println("8. Cate femei sunt atribuite fiecarui medic pentru control");
                System.out.println("9.Iesire");
                System.out.println("---------------------------------");
                System.out.println();
                System.out.println("Introduceti numarul corespunzator comenzii pe care doriti sa o executati :");
                comanda = scanner.nextInt();
            }
            else {
                System.exit(1);
            }
        }while (comanda < 10);

    }
}