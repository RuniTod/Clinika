import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Clinics {

    private Integer size;
    private HashMap<Integer,Pacient> pacients = new HashMap<>();

    public Clinics(Integer size) {
        this.size = size;
    }

    protected Integer getLength(){
        return pacients.size();
    }

    protected void add(Pacient pacient) throws Exception {
        if (this.pacients.size() < this.size) {
            this.pacients.put(this.pacients.size()+1,pacient);
        } else  throw new Exception("Мест в клинике нет!");

    };
    protected void delete(Integer id,Choose choose){
        if (this.pacients.size() > 0){
            switch (choose){
                case PACIENT:
                    this.pacients.remove(id);
                    break;
                case PET:
                    this.pacients.get(id).setPet(null);
                    break;
                default:
                    throw new IllegalStateException("Неизвестное значение: " + choose);
            }
        }
    }

    protected HashMap<Integer,Pacient> getPacients(){
        return this.pacients;
    }

    protected List<Pacient> findForPet(String petName){
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
