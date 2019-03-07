package uml.study;

public final class FoodStock {

    private static FoodStock INSTANCE;
    private static Integer stock = 0;

    private FoodStock() { }

    public static FoodStock getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FoodStock();
        }

        return INSTANCE;
    }

    public static Integer getStock() {
        return stock;
    }

    public void fillFood(Integer amount) {
        stock = stock + amount;
    }

    public synchronized void consumeFood(Integer amount) {
        if (amount > stock) {
            throw new RuntimeException("Insufficient Food");
        }

        stock = stock - amount;
    }

    public void disposeOfFood() {
        stock = 0;
    }

}
