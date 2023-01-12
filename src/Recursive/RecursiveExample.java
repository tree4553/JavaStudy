package Recursive;

import java.util.Arrays;

public class RecursiveExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arrSum(arr));
        System.out.println(arrSumRecursive(arr));
    }

    // 일반 반복문
    public static int arrSum(int[] arr) {
        int result = 0;
        for(int elem : arr) {
            result += elem;
        }
        return result;
    }

    // 재귀 함수
    public static int arrSumRecursive(int[] arr) {
        if(arr.length == 0) {
            return 0;
        }
        int[] arrCopy = Arrays.copyOfRange(arr, 1, arr.length);
        return arr[0] + arrSumRecursive(arrCopy);
    }
}
