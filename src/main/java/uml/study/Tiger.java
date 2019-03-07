package uml.study;

public class Tiger extends Animal implements Jumpable {

    private Integer mealSize;

    public Tiger(Integer mealSize) {
        super();
        this.mealSize = mealSize;
    }

    @Override
    public Integer mealSize() {
        return mealSize;
    }

    @Override
    public void jumping() {
        System.out.printf("The %s is jumping for the audiences\n", animalType);
    }
}
