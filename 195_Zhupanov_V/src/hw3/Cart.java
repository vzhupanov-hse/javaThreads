package hw3;

import java.util.Random;

public class Cart {
    private double x;
    private double y;
    private boolean turnedOn;

    public Cart(int x, int y) {
        this.x = x;
        this.y = y;
        turnedOn = true;
    }

    /**
     * метод для получения значения переменной turnedOn
     *
     * @return значение, нужно ли еще передвигать телегу
     */
    public boolean isTurnedOn() {
        return turnedOn;
    }

    /**
     * придает значение false признаку передвижения телеги
     */
    public void turnOff() {
        turnedOn = false;
    }

    /**
     * метод для получения значения переменной x
     *
     * @return координту x телеги
     */
    public synchronized double getX() {
        return x;
    }

    /**
     * метод для получения значения переменной y
     *
     * @return координту y телеги
     */
    public synchronized double getY() {
        return y;
    }

    /**
     * изменение координты x телеги
     *
     * @param dif число, на которое нужно изменить x
     */
    public synchronized void changeX(double dif) {
        x += dif;
    }

    /**
     * изменение координты y телеги
     *
     * @param dif число, на которое нужно изменить y
     */
    public synchronized void changeY(double dif) {
        y += dif;
    }
}
