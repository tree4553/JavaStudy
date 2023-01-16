package abstraction.ineheritance;

abstract class Animal { // 추상 클래스
    public abstract void cry();
}
interface Pet { // 인터페이스
    public abstract void play();
}

class Dog extends Animal implements Pet { // Animal 클래스 상속 & Pet 인터페이스 구현
    public void cry(){
        System.out.println("멍멍!");
    }

    public void play(){
        System.out.println("원반 던지기");
    }
}

class Cat extends Animal implements Pet { // Animal 클래스 상속 & Pet 인터페이스 구현
    public void cry(){
        System.out.println("야옹~!");
    }

    public void play(){
        System.out.println("쥐 잡기");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.cry();
        dog.play();
        cat.cry();
        cat.play();
    }
}