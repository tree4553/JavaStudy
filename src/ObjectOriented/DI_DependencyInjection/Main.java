package ObjectOriented.DI_DependencyInjection;

public class Main {
    public static void main(String[] args) {
        Fruit a = new Fruit("딸기", "빨강", 100, 500);
        System.out.println(a.getKcal());

        Apple b = new Apple("사과", "빨강", 200, 1000);
        System.out.println(b.getKcal());

        System.out.println(b.getKcal());
        Fruit c = new Mango("망과", "노랑", 300, 2000);
        a.whoamI();
        b.whoamI();
        c.whoamI();

        Kiwi d = new Kiwi("키위", "초록", 200, 500);

        Grape e = new Grape("포도","보라", 300,5000);

        // DI 미적용 코드
//        Basket basket = new Basket(b, (Mango)c, d);
//        basket.printWhoAmI();

//        ArrayList<Fruit> arr = new ArrayList<>();
//        arr.add(b);
//        arr.add(c);
//        arr.add(d);
//        arr.add(e);
//
//        Basket bas = new Basket(arr);
//        bas.printContains();
    }
}
