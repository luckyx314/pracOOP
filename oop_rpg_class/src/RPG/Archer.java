package RPG;

public class Archer extends Hero{
    private int arrowCount;
    public Archer(String name, char gender) {
        super(name, gender);
        super.setHeroClass("Archer");
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
