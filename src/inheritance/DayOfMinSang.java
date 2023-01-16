package inheritance;

import inheritance.car.Car;
import inheritance.person.Person;

public class DayOfMinSang {
    public static void main(String[] args) {

        System.out.println("🌈 구민상의 하루 🌈");

        Car lamborghini = new Car("람보르기니 무르시엘라고", 100);
        Person minsang = new Person("구민상", lamborghini);

        minsang.introduce();
        minsang.eat();
        minsang.drive();
        minsang.sleep();
    }
}

// 슈퍼카를 타는 건물주 구민상의 하루 vs 똥차를 타는 프로그래머 조영현의 하루

// 슈퍼카 객체, 똥차 객체 -> Car
// 구민상 객체 -> Person
// 조영현 객체 -> 프로그래머 -> 직업 -> 사람의 특성도 기본적으로 가지고 있다.
//   -> Programmer extencs Person
