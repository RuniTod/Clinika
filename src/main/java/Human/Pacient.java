package Human;

import Animals.Pet;

public class Pacient {

    private Sex sex;
    private Integer Age;
    private String Name;
    private Pet pet;
    private Integer id;

    public Pacient(Sex sex, Integer age, String name, Pet pet, Integer id) {
        this.sex = sex;
        Age = age;
        Name = name;
        this.pet = pet;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pacient(Sex sex, Integer age, String name, Pet pet) {
        this.sex = sex;
        Age = age;
        Name = name;
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
