package Algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14888
public class B_14888_연산자_끼워넣기 {
    public static int min = Integer.MAX_VALUE;
    public static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 값들에 대한 삽입이나 삭제 동작이 없으니까, 조회에 속도가 빠른 ArrayList 대신에 배열을 쓰자
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Integer[] numbers = new Integer[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        // [0] = + , [1] = - , [2] = * , [3] = /
        int[] operators = new int[4];
        for (int i = 0; i < operators.length; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        // 숫자들 사이에 연산자를 끼워넣어서 최대값, 최소값을 구해야 하는데
        // 숫자들을 정렬시킨 후 최대값 구할때는 곱하기, 더하기, 빼기, 나누기 순으로 연산하게 하고
        // 최소값을 구할때는 숫자들 반대 순서로 곱하기, 더하기, 빼기, 나누기 순으로 연산하게 하면 되려나
        // 주어지는 정수들이 1이상 100이하의 자연수니까 별탈없이 돌아갈 것 같다.

        // 으어 조건 겁나 더러워 지는데 이게 맞나..
        // 일단 만들자
        // V1
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        int min = numbers[0];
//        int max = numbers[numbers.length - 1];
//        for (int i = 0; i < n - 1; i++) {
//            if (operators[2] != 0) {     // *
//                max *= numbers[numbers.length - 2 - i];
//                min *= numbers[i + 1];
//                operators[2] -= 1;
//                continue;
//            }
//
//            if (operators[0] != 0) {     // +
//                max += numbers[numbers.length - 2 - i];
//                min += numbers[i + 1];
//                operators[0] -= 1;
//                continue;
//            }
//
//            if (operators[1] != 0) {     // -
//                max -= numbers[numbers.length - 2 - i];
//                min -= numbers[i + 1];
//                operators[1] -= 1;
//                continue;
//            }
//
//            if (operators[3] != 0) {     // /
//                max /= numbers[numbers.length - 2 - i];
//                min /= numbers[i + 1];
//                operators[3] -= 1;
//                continue;
//            }
//        }
        // 생각대로 만들긴 했는데 예제에서 예외 케이스 발견
        // [3, 4, 5] , [1, 0, 1, 0] 일때 최대값이 (3 + 4) * 5 = 35 가 나와야 하는데 3 + (4 * 5) = 23
        // 곱하기 연산이 먼저 실행되어서 오답이 된다.

        // 최소값 구할때 numbers를 오름차순, 최대값 구할때 numbers를 내림차순으로 만들어서 연산자 우선순위를 줘서 구해주면 될거같은데
        // 문제에서 바라는 풀이가 이게 맞을까...


        // V2
        // 최소값 구할때는 오름차순, 최대값 구할때는 내림차순
        // operators는 복사해서 사용하자
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        int min = numbers[0];
//        int[] minOperators = new int[operators.length];
//        System.arraycopy(operators, 0, minOperators, 0, operators.length - 1);
//
//        for (int i = 0; i < n - 1; i++) {
//            if (minOperators[2] != 0) {     // *
//                min *= numbers[i + 1];
//                minOperators[2] -= 1;
//                continue;
//            }
//
//            if (minOperators[0] != 0) {     // +
//                min += numbers[i + 1];
//                minOperators[0] -= 1;
//                continue;
//            }
//
//            if (minOperators[1] != 0) {     // -
//                min -= numbers[i + 1];
//                minOperators[1] -= 1;
//                continue;
//            }
//
//            if (minOperators[3] != 0) {     // /
//                min /= numbers[i + 1];
//                minOperators[3] -= 1;
////                continue; // 생략 가능
//            }
//        }
//
//        int max = numbers[numbers.length - 1];
//        Arrays.sort(numbers, Collections.reverseOrder());       // numbers가 Integer[] 이여야 함수가 실행 가능하네
//        System.out.println(Arrays.toString(numbers));
//        int[] maxOperators = new int[operators.length];
//        System.arraycopy(operators, 0, maxOperators, 0, operators.length - 1);
//
//        for (int i = 0; i < n - 1; i++) {
//            if (maxOperators[2] != 0) {     // *
//                max *= numbers[i + 1];
//                maxOperators[2] -= 1;
//                continue;
//            }
//
//            if (maxOperators[0] != 0) {     // +
//                max += numbers[i + 1];
//                maxOperators[0] -= 1;
//                continue;
//            }
//
//            if (maxOperators[1] != 0) {     // -
//                max -= numbers[i + 1];
//                maxOperators[1] -= 1;
//                continue;
//            }
//
//            if (maxOperators[3] != 0) {     // /
//                max /= numbers[i + 1];
//                maxOperators[3] -= 1;
////                continue; // 생략 가능
//            }
//        }
        // 조짐 안됨
        // 재귀로 풀어야 되는 문제인거 같다라는 생각이 들긴 했는데
        // 어떻게 해야되나..



        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int num, int idx) {

    }
}
