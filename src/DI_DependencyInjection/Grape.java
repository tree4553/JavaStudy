package DI_DependencyInjection;

public class Grape extends Fruit {
    public Grape(String name, String color, int kcal, int price) {
        super(name, color, kcal, price);
    }

    public void whoamI() {
        System.out.println("나는 포도야....");
    }
}
