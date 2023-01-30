package Practice;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] output = reverseArr(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(output));
    }

    public static int[] reverseArr(int[] arr) {
        // 전에 푼건디 왜 기억이 안나니
        // 재귀로 풀어야된다
        // 인자로 배열 하나만 넘겨줘도 풀수있는거였나
        // 다른 함수 하나 만들어서 풀엇던거 같기도 한데
        // 전에 했던 생각 똑같이 하고 있네
        // 배열을자르고 붙여서 풀엇던거 같은데
        if(arr.length == 0) return arr;

        // 헤드 테일로 나눠서 더했던거 같은데
        // array copy 쓰고
        int[] head = new int[];

        return arr;
    }
}
