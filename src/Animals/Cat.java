public class Cat extends Pet {
    public Cat(String name, String disease) {
        super(name, disease);
    }

    @Override
    public String Say() {
        return "miau";
    }
}
