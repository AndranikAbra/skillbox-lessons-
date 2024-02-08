public class Basket {

    private static int count = 0;
    private static int basketCount = 0;
    private String items = "";
    private static int totalPrice = 0;
    private double totalWeight = 0;
    private int limit;
    private static int totalCount = 0;
    private static int averagePrice;


    public Basket() {;
        count = count + 1;
        totalCount = totalCount + 1;
        basketCount = basketCount + 1;
        items = "Список товаров: ";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int limit) {
        this();
        this.items = this.items + items;
        this.limit = limit;
        this.totalPrice = this.totalPrice + totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public static int getItemCountForAllBaskets() {
        return 0;
    }

    public static int getItemCostForAllBaskets() {
        return 0;
    }

    public static int averagePrice() {
        return averagePrice / totalPrice;
    }

    public void add(String name, int price, int i, int i1) {
        add(name, price, 1);
    }


    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " + count + " шт. "
                + " Стоимость состовляет " + price + " рублей: ";
        totalPrice = totalPrice + count * price;
        averagePrice = Basket.getTotalCost() / Basket.count; //Средняя стомимость всех корзин.
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public static int getAveragePrice() {
        return averagePrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public static int getTotalCost() {
        return 0;
    }

    public static int getBasketCount() {
        return basketCount;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.println("Общая стомиость товара в корзине " + totalPrice + " руб. ");
            System.out.println("Общий вес товаров в корзине " + totalWeight + " кг. ");
            System.out.println("Общее количество корзин " + Basket.count + " шт. ");
            System.out.println("Средняя стоимость всех корзин " + Basket.averagePrice());
        }
    }
}