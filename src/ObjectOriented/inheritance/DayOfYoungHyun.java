package ObjectOriented.inheritance;

import ObjectOriented.inheritance.car.Car;
import ObjectOriented.inheritance.person.Programmer;

public class DayOfYoungHyun {
    public static void main(String[] args) {

        System.out.println("π μ‘°μνμ νλ£¨ π");

        Car bongorghini = new Car("λ΄κ³ λ₯΄κΈ°λ λ¬΄μΌμ€μλΌκ³ ", 20);
        Programmer younghyun = new Programmer("μ‘°μν", bongorghini, "μ½λμ€νμ΄μΈ ", true);

        younghyun.introduce();
        younghyun.commute();
        younghyun.work();
        younghyun.eat();
        younghyun.sleep();
    }
}

