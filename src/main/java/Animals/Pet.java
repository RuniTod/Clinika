package Animals;


import Animals.Animal;

public class Pet implements Animal {

    private String name;
    private String disease;

    public Pet(String name, String disease) {
        this.name = name;
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String Say() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
