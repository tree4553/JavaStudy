package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ListPlusTest {
    public static void main(String[] args) {
//        int[] a = {1,2,3};
//        System.out.println(a.length);
//        int[] b = Arrays.copyOfRange(a, 0, a.length - 1);
//        System.out.println(Arrays.toString(b));

        ArrayList<Integer> abc = new ArrayList<>();
        abc.add(1);
        abc.add(2);
        abc.remove(1);
        System.out.println(abc.toString());

        ArrayList<Integer> qwe = new ArrayList<>();
        qwe.add(1);
        qwe.add(2);
        qwe.remove((Integer) 1);
        System.out.println(qwe.toString());

        int size = qwe.get(0);
        int[][] qwer = new int[size][size];

    }
}
