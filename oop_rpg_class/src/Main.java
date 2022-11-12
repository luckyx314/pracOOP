import RPG.*;
import RPG.RPGCharacter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hero name: ");
        String name = scanner.next();
        System.out.print("Gender: ");
        char gender = scanner.next().charAt(0);

        Hero h1 = new Archer(name, gender);

        System.out.println(h1);
        h1.addSkill(
                "Fire ball",
                true,
                10,
                true,
                100,
                "fire");
        h1.addSkill(
                "Fire ball",
                true,
                10,
                true,
                100,
                "fire");

        System.out.println("Skills:");

        for (int i = 0; i <h1.getSkillLen(); i++) {
            String comma = ",";
            if (i == h1.getSkillLen()-1)
                comma = "";
            System.out.println(h1.getSkill(i) + comma);
        }
    }
}