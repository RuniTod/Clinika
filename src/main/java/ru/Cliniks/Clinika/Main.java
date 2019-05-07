package ru.Cliniks.Clinika;

import Animals.Cat;
import Animals.Dog;
import Animals.Pet;
import Human.Pacient;
import Human.Sex;

import java.util.Map;

public class Main {


    public static void showPacientsForCliniks(Clinics clinics) {
        for (Pacient pacient:clinics.getPacients().values()) {
            showPacients(pacient);
            if (pacient.getPet() != null){
                System.out.println(" ------- Питомец --------");
                System.out.println("Имя питомца: " + pacient.getPet().getName());
                System.out.println("Болезнь: " + pacient.getPet().getDisease());
            }
        }
    }

    public static void showPacients(Pacient pacient){
        System.out.println(" ------- Пациент --------");
        System.out.println("Имя пациента: " + pacient.getName());
        System.out.println("Пол пациента: " + pacient.getSex());
        System.out.println("Возраст пациента: " + pacient.getAge());
    }

    public static void main(String[] args) throws Exception {
        Clinics clinics = new Clinics(10);
        clinics.add(new Pacient(Sex.MEN, 21,"Peter", new Dog("MANY","DEBIL"),0));
        clinics.add(new Pacient(Sex.WOMEN, 35,"Sara",new Cat("POPY","BURBON"),1));
        System.out.println("Количесство: " + clinics.getLength());
        for (Map.Entry<Integer,Pacient> CurrentPacient:clinics.findForPetID("POPY").entrySet()) {
            clinics.delete(CurrentPacient.getKey(),Choose.PET);
        }

        showPacientsForCliniks(clinics);
        clinics.delete(1,Choose.PACIENT);
        System.out.println("------Найденные пациенты start------");
        for (Pacient pacient:clinics.findForPet("POPY")) {
            showPacients(pacient);
        }
        System.out.println("------Найденные пациенты end------");
        showPacientsForCliniks(clinics);
    }
}
