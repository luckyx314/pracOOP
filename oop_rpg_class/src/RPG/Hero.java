package RPG;
import java.util.ArrayList;

public abstract class Hero extends RPGCharacter{
    private String heroClass;
    private float exp;
    private ArrayList<Skill> skills = new ArrayList<Skill>();

    public Hero(String name, char gender) {
        super(name, gender);
    }

    // setters
    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public void addSkill(
            String name,
            boolean isActive,
            int cooldown,
            boolean isInstantKill,
            int damage,
            String element) {
        Skill newSkill = new Skill(name,isActive,cooldown,isInstantKill,damage,element);
        this.skills.add(newSkill);
    }



    // getters
    public String getHeroClass() {
        return heroClass;
    }

    public Skill getSkill(int index) {
        return skills.get(index);
    }

    public int getSkillLen() {
        return this.skills.size();
    }

    public float getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return
                "\nHero Information: " +
                "\nName: " + super.getName() +
                "\nGender: " + super.getGender() +
                "\nHero Class: " + this.heroClass +
                "\nLevel: " + super.getLevel() +
                "\nDamage: " + super.getDamage() +
                "\nIs Alive: " + super.isAlive() +
                "\nHP: " + super.getHp() +
                "\nMana: " + super.getMana()+
                "\nExp: " + this.exp + "\n";
    }

    public abstract void useSkill();
    public abstract void useItem();


}
