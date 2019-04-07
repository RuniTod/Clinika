public class Dog extends Pet {
    public Dog(String name, String disease) {
        super(name, disease);
    }

    @Override
    public String Say() {
        return "Gav-gav";
    }
}
