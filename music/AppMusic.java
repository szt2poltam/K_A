package Classes.music;

abstract class Instrument {
    protected String name;

    public abstract void play();
}

abstract class StringedInstrument extends Instrument {
    protected int numberOfStrings;

    public abstract void sound();
}

class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        this.name = "Elektromos gitár";
    }

    @Override
    public void sound() {
        System.out.println(numberOfStrings + " húr 'Twang' hangot ad ki.");
    }

    @Override
    public void play() {
        sound();
    }
}

class BassGuitar extends StringedInstrument {
    public BassGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        this.name = "Basszus gitár";
    }

    @Override
    public void sound() {
        System.out.println(numberOfStrings + " húr, 'Duum-duum-duum' hangot ad ki.");
    }

    @Override
    public void play() {
        sound();
    }
}

class Violin extends StringedInstrument {
    public Violin(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        this.name = "Hegedű";
    }

    @Override
    public void sound() {
        System.out.println(numberOfStrings + " húr, 'Screech' hangot ad ki.");
    }

    @Override
    public void play() {
        sound();
    }
}

public class AppMusic {
    public static void main(String[] args) {
        ElectricGuitar electricGuitar = new ElectricGuitar(6);
        BassGuitar bassGuitar = new BassGuitar(4);
        Violin violin = new Violin(4);

        electricGuitar.play();
        bassGuitar.play();
        violin.play();
    }
}
