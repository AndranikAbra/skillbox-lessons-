public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket(100);
        vasyaBasket.add("Молоко",40,2,50);
        vasyaBasket.print("Корзина Васи");
        System.out.println();

        Basket mashaBasket = new Basket(200);
        mashaBasket.add("Молоко",40,1,50);
        mashaBasket.add("Хлеб",80,1,3);
        mashaBasket.print("Корзина Маши");
        System.out.println();

        Basket katyaBasket = new Basket("",500);
        katyaBasket.add("Стул",200,1,2000);
        katyaBasket.print("Корзина Кати");
        System.out.println(Basket.getBasketCount());
        System.out.println(Basket.getTotalCost());
        System.out.println(Basket.getCount());
        System.out.println(Basket.getAveragePrice());

    }
}