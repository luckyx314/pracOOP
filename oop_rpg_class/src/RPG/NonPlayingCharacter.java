package RPG;

public class NonPlayingCharacter extends RPGCharacter{

    public NonPlayingCharacter(String name, char gender) {
        super(name, gender);
    }

    public void engage() {};
}
