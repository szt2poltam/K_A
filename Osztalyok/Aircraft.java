class Aircraft {
    protected String type;
    protected int maxAmmo;
    protected int baseDamage;
    protected int ammo;

    public Aircraft(String type, int maxAmmo, int baseDamage) {
        this.type = type;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.ammo = 0;
    }

    public class Main {
        public static void main(String[] args) {
            F16 f16 = new F16();
            F35 f35 = new F35();
    
            f16.refillAmmo(5);
            f35.refillAmmo(10);
    
            System.out.println(f16.getStatus());
            System.out.println(f35.getStatus());
        }
    }

    public int fight() {
        int damage = ammo * baseDamage;
        ammo = 0;
        return damage;
    }

    public int refillAmmo(int ammoToAdd) {
        int remainingAmmo = Math.min(ammoToAdd, maxAmmo - ammo);
        ammo += remainingAmmo;
        return ammoToAdd - remainingAmmo;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return "Type " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + (ammo * baseDamage);
    }

    public boolean isPriority() {
        return type.equals("F35");
    }
}

class F16 extends Aircraft {
    public F16() {
        super("F16", 8, 30);
    }
}

class F35 extends Aircraft {
    public F35() {
        super("F35", 12, 50);
    }
}




