package Class;

public class ConstructorExample {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor("ABC");
        Constructor constructor3 = new Constructor(1,2);

        CarConstructor c = new CarConstructor("Model X", "빨간색", 250);
        System.out.println("제 차는 " + c.getModelName() + "이고, 컬러는 " +  c.getColor() + "입니다.");

    }
}

class Constructor {
    Constructor() {
        System.out.println("1번 생성자");
    }

    Constructor(String str) {
        System.out.println("2번 생성자");
    }

    Constructor(int a, int b) {
        System.out.println("3번 생성자");
    }
}

class CarConstructor {
    private String modelName;
    private String color;
    private int maxSpeed;

    public CarConstructor(String modelName, String color, int maxSpeed) {
        this.modelName = modelName;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }
}
