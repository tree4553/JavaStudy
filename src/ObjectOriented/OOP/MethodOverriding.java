package ObjectOriented.OOP;

public class MethodOverriding {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car1 car1 = new Car1();
        MotorBike motorBike = new MotorBike();
        System.out.println();

        bike.run();
        car1.run();
        motorBike.run();
        System.out.println();

        SubClass subClassInstance = new SubClass();
        subClassInstance.callNum();
        System.out.println();

        Student s = new Student();
        System.out.println();
    }
}
class Vehicle {
    void run() {
        System.out.println("ObjectOriented.OOP.Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("ObjectOriented.OOP.Bike is running");
    }
}

class Car1 extends Vehicle {
    void run() {
        System.out.println("ObjectOriented.Class.Car is running");
    }
}

class MotorBike extends Vehicle {
    void run() {
        System.out.println("ObjectOriented.OOP.MotorBike is running");
    }
}

class SuperClass {
    int count = 20; // super.count
}

class SubClass extends SuperClass {
    int count = 15; // this.count

    void callNum() {
        System.out.println("count = " + count);
        System.out.println("this.count = " + this.count);
        System.out.println("super.count = " + super.count);
    }
}

class Human {
    Human() {
        System.out.println("휴먼 클래스 생성자");
    }
}

class Student extends Human { // ObjectOriented.OOP.Human 클래스로부터 상속
    Student() {
        super(); // ObjectOriented.OOP.Human 클래스의 생성자 호출
        System.out.println("학생 클래스 생성자");
    }
}
