package java_basic;

public class Baeksu extends Person {
    public Baeksu(String inputName, int inputAge, String inputPhone) {
        super(inputName, inputAge, inputPhone);
    }

    public String kimbaeksuPassword() {
        return "김백수의 비밀번호는 486입니다.";
    }

    public void whoAmI() {
        System.out.println("나는 개백수 쓰레기입니다.");
    }
}
