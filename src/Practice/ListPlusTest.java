package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ListPlusTest {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(a.length);
        int[] b = Arrays.copyOfRange(a, 0, a.length - 1);
        System.out.println(Arrays.toString(b));

    }
}
