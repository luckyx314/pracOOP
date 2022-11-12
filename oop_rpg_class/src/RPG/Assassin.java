package RPG;

public class Assassin extends Hero{
    private int daggerCount;

    public Assassin(String name, char gender) {
        super(name, gender);
        super.setHeroClass("Assassin");
        super.setIsAlive(true);
        super.setHp(200);
        super.setMana(160);
        super.setDamage(300);

    }

    // setters
    public void setDaggerCount(int daggers) {
        this.daggerCount = daggers;
    }

    // getters
    public int getDaggerCount() {
        return daggerCount;
    }

    // abstract method overrides
    public void engage() {};
    public void useSkill() {};
    public void useItem() {};
}
