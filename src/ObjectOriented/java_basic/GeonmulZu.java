package ObjectOriented.java_basic;

public class GeonmulZu extends Person{
    public GeonmulZu(String inputName, int inputAge, String inputPhone) {
        super(inputName, inputAge, inputPhone);
    }

    public void giveMeMoney() {
        System.out.println("돈내놔");
    }

    public void whoAmI() {
        System.out.println("내가 주님보다 높은 건물주다 이말이야.");
    }
}
