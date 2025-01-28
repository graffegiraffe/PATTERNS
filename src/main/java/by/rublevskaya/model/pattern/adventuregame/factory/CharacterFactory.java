package by.rublevskaya.model.pattern.adventuregame.factory;

import by.rublevskaya.model.pattern.adventuregame.characters.Archer;
import by.rublevskaya.model.pattern.adventuregame.characters.GameCharacter;
import by.rublevskaya.model.pattern.adventuregame.characters.Mage;
import by.rublevskaya.model.pattern.adventuregame.characters.Warrior;

public class CharacterFactory {
    public static GameCharacter createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "mage":
                return new Mage();
            case "warrior":
                return new Warrior();
            case "archer":
                return new Archer();
            default:
                throw new IllegalArgumentException("unknown character type: " + type);
        }
    }
}