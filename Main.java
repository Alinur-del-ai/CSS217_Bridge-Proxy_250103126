interface Weapon {
    void use();
}
class Sword implements Weapon {
    public void use() {
        System.out.println("Slash! Dealing 20 physical damage.");
    }
}

class MagicWand implements Weapon {
    public void use() {
        System.out.println("Zap! Dealing 35 magic damage.");
    }
}

abstract class Hero {
    protected Weapon weapon;

    Hero(Weapon weapon) {
        this.weapon = weapon;
    }

    public abstract void attack();
}

class Knight extends Hero {
    Knight(Weapon weapon) {
        super(weapon);
    }

    public void attack() {
        weapon.use();
    }
}

class Wizard extends Hero {
    Wizard(Weapon weapon) {
        super(weapon);
    }

    public void attack() {
        weapon.use();
    }
}

public class Main {
    public static void main(String[] args) {
        Hero knight1 = new Knight(new Sword());
        Hero knight2 = new Knight(new MagicWand());

        knight1.attack();
        knight2.attack();
    }
}
