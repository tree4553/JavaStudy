package ObjectOriented.inheritance.person;

import ObjectOriented.inheritance.car.Car;

public class Person {

    private String name;
    private Car car;

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public void sleep() {
        System.out.printf("%s이(가) 잠을 잡니다.\n", name);
        System.out.println("쿨쿨쿨...zzZ");
    }

    public void eat() {
        System.out.printf("%s이(가) 밥을 먹습니다.\n", name);
        System.out.println("여유롭게 냠냠냠");
    }

    public void introduce() {
        System.out.printf("안녕하세요. 저는 %s입니다.\n", name);
    }

    public void drive() {
        car.operate();
    }
}

