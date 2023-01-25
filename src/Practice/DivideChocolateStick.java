package Practice;

import java.util.ArrayList;

public class DivideChocolateStick {
    public static void main(String[] args) {
        ArrayList<Integer[]> a = divideChocolateStick(10, 20);
        for(Integer[] b : a) {
            for(int c : b) {
                System.out.println(c);
            }
            System.out.println();
        }
    }

    static public ArrayList<Integer[]> divideChocolateStick(int M, int N) {
        // TODO:
        ArrayList<Integer[]> result = new ArrayList<>();
        int repeat = Math.min(M, N);
        for (int i = 1; i < repeat; i++) {
            if(M % i == 0 && N % i == 0) {
                result.add(new Integer[]{i, M / i, N / i});
            }
        }
        return result;
    }

}
