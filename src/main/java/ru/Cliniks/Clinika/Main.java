package ru.Cliniks.Clinika;

import ru.Cliniks.Clinika.Animals.Cat;
import ru.Cliniks.Clinika.Animals.Dog;
import ru.Cliniks.Clinika.Choose;
import ru.Cliniks.Clinika.Clinics;
import ru.Cliniks.Clinika.Human.Pacient;
import ru.Cliniks.Clinika.Human.Sex;

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

        clinics.add(new Pacient(Sex.MEN, 21,"Peter", new Dog("MANY","DEBIL")));
        clinics.add(new Pacient(Sex.WOMEN, 35,"Sara",new Cat("POPY","BURBON")));

        System.out.println("Количесство: " + clinics.getLength());
        clinics.delete(1, Choose.PET);
        clinics.delete(1,Choose.PACIENT);
        System.out.println("------Найденные пациенты start------");
        for (Pacient pacient:clinics.findForPet("POPY")) {
            showPacients(pacient);
        }
        System.out.println("------Найденные пациенты end------");
        showPacientsForCliniks(clinics);
    }



}
