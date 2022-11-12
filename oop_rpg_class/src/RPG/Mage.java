package RPG;

public class Mage extends Hero{
    private int skillCharges;
    private int spellChannelling;

    public Mage(String name, char gender) {
        super(name, gender);
        super.setHeroClass("Mage");
    }

    // setters
    public void setSkillCharges(int count) {
        skillCharges = count;
    }
    public void setSpellChannelling(int time) {
        spellChannelling = time;
    }

    // getters
    public int getSkillCharges() {
        return skillCharges;
    }
    public int getSpellChannelling() {
        return spellChannelling;
    }

    // abstract method overrides
    public void engage() {};
    public void useSkill() {};
    public void useItem() {};
}
