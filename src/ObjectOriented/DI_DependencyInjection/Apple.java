package ObjectOriented.DI_DependencyInjection;

public class Apple extends Fruit {

    public Apple(String name, String color, int kcal, int price) {
        super(name, color, kcal, price);
    }

    public void whoamI() {
        System.out.println("나는 사과야");
    }
}
