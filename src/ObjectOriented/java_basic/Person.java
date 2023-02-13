package ObjectOriented.java_basic;

public class Person {
    private String name;
    private int age;
    private String phone;
    private String email;

    public Person(String inputName, int inputAge, String inputPhone) {
        this.name = inputName;
        this.age = inputAge;
        this.phone = inputPhone;
    }

    public String eatAge(int age) {
//        System.out.printf("현재 너의 나이는 %d살 입니다.\n", age);
        age += 1;
        String result = "";
        result = String.format("한살 더 먹은 너의 나이는 %d살 입니다.", age);
        return result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void whoAmI() {
        System.out.println("나는 사람입니다.");
    }
}
