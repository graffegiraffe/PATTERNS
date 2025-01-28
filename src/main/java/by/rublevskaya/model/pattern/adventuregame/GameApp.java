package by.rublevskaya.model.pattern.adventuregame;

import by.rublevskaya.model.pattern.adventuregame.characters.GameCharacter;
import by.rublevskaya.model.pattern.adventuregame.environment.GameEnvironment;
import by.rublevskaya.model.pattern.adventuregame.factory.CharacterFactory;
import by.rublevskaya.model.pattern.adventuregame.factory.EnvironmentFactory;

import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a character (mage, warrior, archer): ");
        String chosenCharacter = scanner.nextLine().toLowerCase();
        System.out.println("Select location (desert, forest, city): ");
        String chosenEnvironment = scanner.nextLine().toLowerCase();
        try {
            GameCharacter character = CharacterFactory.createCharacter(chosenCharacter);
            GameEnvironment environment = EnvironmentFactory.createEnvironment(chosenEnvironment);
            System.out.println(character.getDescription() + " is located in " + environment.getDescription() + ".");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
