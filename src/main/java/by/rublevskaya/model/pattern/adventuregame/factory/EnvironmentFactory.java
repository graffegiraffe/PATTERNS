package by.rublevskaya.model.pattern.adventuregame.factory;

import by.rublevskaya.model.pattern.adventuregame.environment.City;
import by.rublevskaya.model.pattern.adventuregame.environment.Desert;
import by.rublevskaya.model.pattern.adventuregame.environment.Forest;
import by.rublevskaya.model.pattern.adventuregame.environment.GameEnvironment;

public class EnvironmentFactory {
    public static GameEnvironment createEnvironment(String type) {
        switch (type.toLowerCase()) {
            case "desert":
                return new Desert();
            case "forest":
                return new Forest();
            case "city":
                return new City();
            default:
                throw new IllegalArgumentException("unknown character type: " + type);
        }
    }
}
