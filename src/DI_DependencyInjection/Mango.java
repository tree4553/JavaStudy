package DI_DependencyInjection;

public class Mango extends Fruit {
    public Mango(String name, String color, int kcal, int price) {
        super(name, color, kcal, price);
    }

    public void whoamI() {
        System.out.println("나는 망고야!");
    }
}
