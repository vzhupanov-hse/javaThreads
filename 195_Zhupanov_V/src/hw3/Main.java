package hw3;

public class Main {

    public static void main(String args[]) {
        int cart_x = 0;
        int cart_y = 0;
        if (args.length == 1)
            cart_x = Integer.parseInt(args[0]);
        if (args.length == 2) {
            cart_x = Integer.parseInt(args[0]);
            cart_y = Integer.parseInt(args[1]);
        }
        //запоминаем время начала работы программы
        long start_sec = System.currentTimeMillis();
        //создаем телегу
        Cart cart = new Cart(cart_x, cart_y);
        //создаем треды
        Thread swan = new Thread(new Animal(60, cart));
        Thread crayfish = new Thread(new Animal(180, cart));
        Thread pike = new Thread(new Animal(300, cart));
        start(swan, crayfish, pike);
        outputInformation(start_sec, cart);
        //заканчиваем работу тредов
        cart.turnOff();
        //выводим результирующие координаты телеги
        System.out.println();
        System.out.printf("%.2f %.2f", cart.getX(), cart.getY());
    }

    /**
     * Выводит информацию о координатах телеги каждые 2 секунды на протяжении 25 секунд
     *
     * @param start_sec время начала работы программы
     * @param cart      объект класса Cart, представляющий собой передвигаемую телегу
     */
    public static void outputInformation(long start_sec, Cart cart) {
        while (System.currentTimeMillis() - start_sec <= 25000) {
            //вывод информации о координатах телеги
            System.out.printf("%.2f %.2f\n", cart.getX(), cart.getY());
            //ожидание 2 секунды до следующего исполнения
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Запускает треды
     *
     * @param swan     тред-лебедь
     * @param crayfish тред-рак
     * @param pike     тред-щука
     */
    public static void start(Thread swan, Thread crayfish, Thread pike) {
        swan.start();
        crayfish.start();
        pike.start();
    }
}
