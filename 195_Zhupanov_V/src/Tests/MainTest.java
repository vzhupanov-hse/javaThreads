package Tests;

import hw3.Animal;
import hw3.Cart;
import hw3.Main;
import org.junit.jupiter.api.Assertions;

public class MainTest {

    @org.junit.jupiter.api.Test
    void startX() {
        Cart cart = new Cart(0, 0);
        Thread animal = new Thread(new Animal(60, cart));
        Thread animal2 = new Thread(new Animal(180, cart));
        Thread animal3 = new Thread(new Animal(300, cart));
        Main.start(animal, animal2, animal3);
        cart.turnOff();
        Assertions.assertNotSame(0, cart.getX());
    }

    @org.junit.jupiter.api.Test
    void startY() {
        Cart cart = new Cart(0, 0);
        Thread animal = new Thread(new Animal(60, cart));
        Thread animal2 = new Thread(new Animal(180, cart));
        Thread animal3 = new Thread(new Animal(300, cart));
        Main.start(animal, animal2, animal3);
        cart.turnOff();
        Assertions.assertNotSame(0, cart.getY());
    }
}
