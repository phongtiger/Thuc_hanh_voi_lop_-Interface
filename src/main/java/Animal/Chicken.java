package Animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound() {
        return " Chicken Cuc cuc";
    }
    public String howToEat() {
        return "Could be fried";
    }
}
