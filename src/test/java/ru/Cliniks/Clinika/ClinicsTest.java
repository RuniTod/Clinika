package ru.Cliniks.Clinika;

import Excepticon.UserExcepticon;
import org.junit.Test;
import Animals.Dog;
import Human.Pacient;
import Human.Sex;

import static org.junit.Assert.*;

public class ClinicsTest {

    @Test
    public void add() throws Exception {
        Clinics clinics = new Clinics(2);
        clinics.add(new Pacient(Sex.MEN, 21,"Peter", new Dog("MANY","DEBIL")));
        assertEquals((Integer) 1,clinics.getLength());
    }

    @Test
    public void delete() throws Exception {
        Clinics clinics = new Clinics(5);
        clinics.add(new Pacient(Sex.MEN, 21,"Peter", new Dog("MANY","DEBIL")));
        clinics.delete(1,Choose.PACIENT);
        assertEquals((Integer) 0,clinics.getLength());

    }
}