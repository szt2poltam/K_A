package zoo;

public class Mammal extends Animal {

    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void breed() {
        System.out.println("Mammals breed by giving birth to live young.");
    }
}
