package RPG;

public class Archer extends Hero{
    private int arrowCount;
    public Archer(String name, char gender) {
        super(name, gender);
        super.setHeroClass("Archer");
        super.setIsAlive(true);
        super.setHp(200);
        super.setMana(200);
        super.setDamage(200);
    }


    // setters
    public void setArrowCount(int arrows) {
        this.arrowCount = arrows;
    }

    // getters
    public int getArrowCount() {
        return arrowCount;
    }

    // abstract method overrides
    public void engage() {};
    public void useSkill() {};
    public void useItem() {};
}
