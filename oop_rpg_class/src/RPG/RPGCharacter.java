package RPG;

public abstract class RPGCharacter {
    static final int maxLevel = 100;
    private String name;
    private char gender;
    private int level = 1;
    private int damage;
    private boolean isAlive;
    private int hp;
    private int mana;

    public RPGCharacter(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public void setIsAlive(boolean status) {
        isAlive = status;
    }
    public void setLevel(int level) {
        this.level = level;
    };
    public void setDamage(int damage) {
        this.damage = damage;
    };

    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public int getLevel() {
        return level;
    }
    public int getDamage() {
        return damage;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public int getHp() {
        return hp;
    }
    public int getMana() {
        return mana;
    }
    public int getMaxLevel() {
        return maxLevel;
    }

    public abstract void engage();
}
