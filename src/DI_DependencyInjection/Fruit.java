package DI_DependencyInjection;

public class Fruit {
    private String name;

    public Fruit(String name, String color, int kcal, int price) {
        this.name = name;
        this.color = color;
        this.kcal = kcal;
        this.price = price;
    }

    private String color;
    private int kcal;
    private int price;

    public int getKcal() {
        return kcal + 100;
    }

    public void whoamI() {
        System.out.println("나는 과일이야.");
    }
}
