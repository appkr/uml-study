package uml.study;

public abstract class Animal {

    protected String animalType = getClass().getSimpleName();

    public Animal() { }

    public abstract Integer mealSize();

    public void eat(FoodStock foodStock) {
        foodStock.consumeFood(mealSize());
        System.out.printf("%s is eating %d unit of food%n", animalType, mealSize());
    }

}
