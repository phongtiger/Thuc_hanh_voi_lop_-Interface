package Fruit;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new orange();
        fruits[1] = new apple();
        for (Fruit fruit:fruits
             ) {
            System.out.println(fruit.howToEat());
        }
        
    }
}
