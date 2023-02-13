package ObjectOriented.java_basic;

public class Main {
    public static void main(String[] args) {
        Person A = new Person("이정철", 32, "010-1234-5678");
        String older = A.eatAge(32);
        System.out.println(older);

        Baeksu B = new Baeksu("김백수", 20, "010-9876-5432");
        String aging = B.eatAge(20);

        Person temp = (Person) B; // 업캐스팅
        //Baeksu temp2 = (Baeksu) A; // 다운캐스팅

        //Baeksu Z = new Person("a", 1, "c");

        System.out.println(aging);

        B.setName("김수백");
        System.out.println(B.getName());
        System.out.println(B.kimbaeksuPassword());

        GeonmulZu C = new GeonmulZu("이부자", 50, "019-1234-5678");
        C.giveMeMoney();
        System.out.println(C.getName());

        Person[] personArr = new Person[3];
        personArr[0] = A;
        personArr[1] = (Person)B;
        personArr[2] = (Person)C;

        for (int i = 0; i < personArr.length; i++) {
            personArr[i].whoAmI();
        }

        A.whoAmI();
        B.whoAmI();
        C.whoAmI();
    }
}
