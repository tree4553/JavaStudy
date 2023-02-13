package ObjectOriented.java_basic;

public class Interface_example implements MakeIt{

    public int eatInt(int a) {
        return 0;
    }
}
// A 문자열에 있는 모든 숫자들을 더해서 저장할 변수를 하나 만든다.
// B 문자열에 있는 숫자와 공백이 아닌 갯수를 저장할 변수를 하나 만든다.

// for문으로 문자열의 한자리씩을 숫자인지 확인한다.
// 숫자이면은 A에 더해준다.
// 문자이면 B에 1을 더해준다.
// 힌트 : char , ASCII

// A를 B로 나눠서 소숫점 첫째자리에서 반올림한 값을 반환한다.