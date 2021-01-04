package hw3;

import java.util.Random;

public class Animal implements Runnable {
    private int angle;
    private int s;
    private Random rnd;
    private Cart cart;

    public Animal(int angle, Cart cart) {
        rnd = new Random();
        this.angle = angle;
        s = rnd.nextInt(10) + 1;
        //передаем ссылку на телегу
        this.cart = cart;
    }

    @Override
    public void run() {
        while (cart.isTurnedOn()) {
            //изменение координта телеги
            cart.changeX(s * Math.cos(angle));
            cart.changeY(s * Math.sin(angle));
            //ожидание некоторое количество времени до следующего выполнения
            try {
                Thread.sleep(rnd.nextInt(4000) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
