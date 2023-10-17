package zoo;

public class Reptile extends Animal {

    public Reptile(String name, int age) {
        super(name, age);
    }

    @Override
    public void breed() {
        System.out.println("Reptiles breed by laying eggs.");
    }
}
