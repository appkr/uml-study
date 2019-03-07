package uml.study;

public class Elephant extends Animal implements Swimmable {

    private Integer mealSize;

    public Elephant(Integer mealSize) {
        super();
        this.mealSize = mealSize;
    }

    @Override
    public Integer mealSize() {
        return mealSize;
    }

    @Override
    public void swimming() {
        System.out.printf("The %s is swimming for the audiences\n", animalType);
    }
}
