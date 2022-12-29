package Class;

public class ClassTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("외부 클래스 사용하여 내부 클래스 기능 호출");
        outer.testClass();
    }
}


class Outer {
    private int num = 1;
    private static int sNum = 2;

    private InClass inClass;

    public Outer() {
        inClass = new InClass();
    }

    class InClass {
        int inNum = 10;

        void Test() {
            System.out.println("Class.Outer num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("Class.Outer sNum = " + sNum + "(외부 클래스의 정적 변수)");
        }
    }

    public void testClass() {
        inClass.Test();
    }
}