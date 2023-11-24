public class Main {
    public static void main(String[] args) {
        Kert kert = new Kert();
        Virag sargaVirag = new Virag(3);
        Virag kekVirag = new Virag(6);
        Fa loncFa = new Fa(8);
        Fa narancsFa = new Fa(12);

        kert.novenyHozzaad(sargaVirag);
        kert.novenyHozzaad(kekVirag);
        kert.novenyHozzaad(loncFa);
        kert.novenyHozzaad(narancsFa);

        kert.kertAllapot();
        System.out.println("Öntözés 40");
        kert.ontoz(40);
        System.out.println("Öntözés 70");
        kert.ontoz(70);
    }
}
