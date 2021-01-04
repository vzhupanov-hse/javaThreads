package Tests;

import hw3.Cart;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @org.junit.jupiter.api.Test
    void isTurnedOn() {
        Cart cart = new Cart(0, 0);
        Assertions.assertEquals(true, cart.isTurnedOn());
    }

    @org.junit.jupiter.api.Test
    void turnOff() {
        Cart cart = new Cart(0, 0);
        cart.turnOff();
        Assertions.assertEquals(false, cart.isTurnedOn());
    }

    @org.junit.jupiter.api.Test
    void getX() {
        Cart cart = new Cart(0, 0);
        Assertions.assertEquals(0, cart.getX());
    }

    @org.junit.jupiter.api.Test
    void getY() {
        Cart cart = new Cart(0, 0);
        Assertions.assertEquals(0, cart.getY());
    }

    @org.junit.jupiter.api.Test
    void changeX() {
        Cart cart = new Cart(0, 0);
        cart.changeX(5);
        Assertions.assertEquals(5, cart.getX());
    }

    @org.junit.jupiter.api.Test
    void changeY() {
        Cart cart = new Cart(0, 0);
        cart.changeY(-7);
        Assertions.assertEquals(-7, cart.getY());
    }
}