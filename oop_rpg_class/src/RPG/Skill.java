package RPG;

public class Skill {
    private String name;
    private boolean isActive;
    private int cooldown;
    private boolean isInstantKill;
    private int damage;
    private String element;

    public Skill(String name, boolean isActive, int cooldown, boolean isInstantKill, int damage, String element) {
        this.name = name;
        this.isActive = isActive;
        this.cooldown = cooldown;
        this.isInstantKill = isInstantKill;
        this.damage = damage;
        this.element = element;
    }

    @Override
    public String toString() {
        return
                "{" +
                "\n\tSkill name: " + name +
                "\n\tIs Active: " + isActive +
                "\n\tCooldown: " + cooldown + "s" +
                "\n\tInstant Kill: " + isInstantKill +
                "\n\tDamage: " + damage +
                "\n\tElement: " + element +
                "\n}";
    }
}
