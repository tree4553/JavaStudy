package DI_DependencyInjection;

public class Kiwi extends Fruit {
    public Kiwi(String name, String color, int kcal, int price) {
        super(name, color, kcal, price);
    }

    public void whoamI() {
        System.out.println("나는 키위야~~");
    }
}
