package ru.Cliniks.Clinika;


import Animals.Pet;
import Excepticon.UserExcepticon;
import Human.Pacient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Clinics {

    private Integer size;
    private HashMap<Integer, Pacient> pacients = new HashMap<>();

    public Clinics(Integer size) {
        this.size = size;
    }

    public Integer getLength(){
        return pacients.size();
    }

    public void add(Pacient pacient) throws UserExcepticon {
        if (this.pacients.size() < this.size) {
            this.pacients.put(this.pacients.size()+1,pacient);
        } else  throw new UserExcepticon("Мест в клинике нет!");

    };
    public void delete(Integer id, Choose choose) throws UserExcepticon {
        if (this.pacients.size() > 0){
            switch (choose){
                case PACIENT:
                    this.pacients.remove(id);
                    break;
                case PET:
                    this.pacients.get(id).setPet(null);
                    break;
                default:
                    throw new UserExcepticon("Неизвестное значение: " + choose);
            }
        }
    }

    public HashMap<Integer,Pacient> getPacients(){
        return this.pacients;
    }

    public List<Pacient> findForPet(String petName){
        List<Pacient> listPacients = new ArrayList<>();
        for (Pacient pacient:this.pacients.values()) {
            if (pacient.getPet() != null){
                if (pacient.getPet().getName() == petName){
                    listPacients.add(pacient);
                }
            }
        }
        return listPacients;
    }

    protected List<Pacient> findForPacient(String pacientName){
        List<Pacient> listPacients = null;
        for (Pacient pacient:this.pacients.values()) {
            if (pacient.getName() == pacientName){
                listPacients.add(pacient);
            }
        }
        return listPacients;
    }

    protected Pet getPet(Integer id){
        return pacients.get(id).getPet();
    }



}
