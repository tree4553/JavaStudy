package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MissHouseMeal {
    public static void main(String[] args) {
        ArrayList<String[]> output = missHouseMeal(new String[]{"eggroll", "kimchi", "fishSoup"});
        output.sort((a,b) -> Arrays.toString(a).compareTo(Arrays.toString(b)));
        for(String[] a : output){
            for(String b : a) {
                System.out.println(b);
            }
            System.out.println();
        }
    }
    static public ArrayList<String[]> missHouseMeal(String[] sideDishes) {
        // TODO:
        Arrays.sort(sideDishes);
        ArrayList<String[]> result = new ArrayList<>();
        boolean[] visited = new boolean[sideDishes.length];
        for(int i = 0; i < sideDishes.length; i++) {
            result.addAll(permutation(i, sideDishes, new String[]{}, new ArrayList<String[]>(), visited));
        }
        String[] last = new String[sideDishes.length];
        for (int i = 0; i < sideDishes.length; i++) {
            last[i] = sideDishes[i];
        }
        result.add(last);
        return result;
    }

    static public ArrayList<String[]> permutation(int count, String[] dishes, String[] keep, ArrayList<String[]> result, boolean[] visited) {
        if(keep.length == count) {
            result.add(keep);
            return result;
        }
        for (int i = 0; i < dishes.length; i++) {
            if(visited[i] == false) {
                visited[i] = true;
                String[] copy = Arrays.copyOf(keep, keep.length + 1);
                copy[copy.length - 1] = dishes[i];
                result = permutation(count, dishes, copy, result, visited);
                visited[i] = false;
            }
        }
        return result;
    }

}
