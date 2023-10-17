package zoo;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void breed() {
        System.out.println("Birds breed by laying eggs.");
    }
}
