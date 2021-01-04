package Tests;

import hw3.Animal;
import hw3.Cart;
import org.junit.jupiter.api.Assertions;

public class AnimalTest {

    @org.junit.jupiter.api.Test
    void runX() {
        Cart cart = new Cart(0, 0);
        Thread animal = new Thread(new Animal(60, cart));
        animal.start();
        cart.turnOff();
        Assertions.assertNotSame(0, cart.getX());
    }

    @org.junit.jupiter.api.Test
    void runY() {
        Cart cart = new Cart(0, 0);
        Thread animal = new Thread(new Animal(60, cart));
        animal.start();
        cart.turnOff();
        Assertions.assertNotSame(0, cart.getY());
    }
}
