package Kert;
import java.util.ArrayList;

abstract class Noveny {

    protected double vizmennyiseg;
    public Noveny(double vizmennyiseg) {
        this.vizmennyiseg = vizmennyiseg;
    }
    abstract boolean szuksegVizre();
    abstract void ontoz(double mennyiseg);

    public static void main(String[] args) {
        Kert kert = new Kert();
        Virag sargaVirag = new Virag(3);
        Virag kekVirag = new Virag(1);
        Fa loncFa = new Fa(1);
        Fa narancsFa = new Fa(4);

        kert.novenyHozzaad(sargaVirag);
        kert.novenyHozzaad(kekVirag);
        kert.novenyHozzaad(loncFa);
        kert.novenyHozzaad(narancsFa);

        kert.kertAllapot();
        System.out.println("\nÖntözés 40\n");
        kert.ontoz(40);
        System.out.println("\nÖntözés 70\n");
        kert.ontoz(70);
    }
}

class Virag extends Noveny {
    public Virag(double vizmennyiseg) {
        super(vizmennyiseg);
    }

    @Override
    boolean szuksegVizre() {
        return this.vizmennyiseg < 5;
    }

    @Override
    void ontoz(double mennyiseg) {
        this.vizmennyiseg += mennyiseg * 0.75;
    }
}

class Fa extends Noveny {
    public Fa(double vizmennyiseg) {
        super(vizmennyiseg);
    }

    @Override
    boolean szuksegVizre() {
        return this.vizmennyiseg < 30;
    }

    @Override
    void ontoz(double mennyiseg) {
        this.vizmennyiseg += mennyiseg * 0.4;
    }
}

class Kert {
    private ArrayList<Noveny> novenyek = new ArrayList<>();

    public void novenyHozzaad(Noveny noveny) {
        novenyek.add(noveny);
    }

    public void kertAllapot() {
        for (Noveny noveny : novenyek) {
            if (noveny instanceof Virag) {
                System.out.print("A virágnak ");
            } else if (noveny instanceof Fa) {
                System.out.print("A fának ");
            }

            if (noveny.szuksegVizre()) {
                System.out.println("vízre van szüksége");
            } else {
                System.out.println("nincs szüksége vízre");
            }
        }
    }

    public void ontoz(double mennyiseg) {
        for (Noveny noveny : novenyek) {
            if (noveny.szuksegVizre()) {
                noveny.ontoz(mennyiseg);
            }
        }
        kertAllapot();
    }
}

