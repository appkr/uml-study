package uml.study;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    private FoodStock foodStock;

    @Before
    public void setUp() {
        this.foodStock = FoodStock.getInstance();
    }

    @Test
    public void testFeedAnimal() {
        // Given
        foodStock.fillFood(100);

        // When
        ZooKeeper zk1 = new ZooKeeper();
        Elephant a1 = new Elephant(10);
        Tiger a2 = new Tiger(5);
        zk1.addAnimal(a1);
        zk1.addAnimal(a2);
        zk1.feedAnimals(foodStock);
        a1.swimming();
        a2.jumping();

        // Then
        assertTrue((100 - 10 - 5) == FoodStock.getStock());
    }

    @Test(expected = RuntimeException.class)
    public void testOutOfStock() {
        // Given
        foodStock.fillFood(10);

        // When
        ZooKeeper zk2 = new ZooKeeper();
        zk2.addAnimal(new Elephant(20));
        zk2.feedAnimals(foodStock);
    }

    @After
    public void tearDown() {
        this.foodStock.disposeOfFood();
        System.out.println("---");
    }

}
