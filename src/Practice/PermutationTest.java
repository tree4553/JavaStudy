package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.sort;

public class PermutationTest {
    public static void main(String[] args) {
        ArrayList<Integer[]> temp = new ArrayList<>();
        temp = newChickenRecipe(new int[]{1111,1,10,111}, 2);
        for(Integer[] a : temp) {
            for(Integer b : a) System.out.println(b);
            System.out.println();
        }
    }

    static public ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {
        ArrayList<Integer[]> result = new ArrayList<>();
        ArrayList<Integer> elems = new ArrayList<>();
        // 0이 두개 이하인 재료들 고르기
        for(int elem : stuffArr) {
            String temp = String.valueOf(elem);
            int countZero = 0;
            for (int i = 0; i < temp.length(); i++) {
                if(temp.charAt(i) == '0') countZero += 1;
            }
            if(countZero <= 2) elems.add(elem);
        }

        // 갯수가 고르는 수보다 작으면 null 반환
        if(elems.size() < choiceNum) return null;
        // 오름차순으로 고른 재료들 정렬
        Collections.sort(elems);
        // 방문 여부 배열 생성
        boolean[] visited = new boolean[elems.size()];

        result = permutation(choiceNum, elems, new Integer[]{}, visited, 0, result);

        return result;
    }

    private static ArrayList<Integer[]> permutation(int choiceNum, ArrayList<Integer> elems, Integer[] keep, boolean[] visited, int depth, ArrayList<Integer[]> result) {
        // 갯수 채우면 결과에 더해서 반환
        if(depth == choiceNum) {
            result.add(keep);
            return result;
        }
        // 방문 여부 확인해서 재료 추가, 재귀 호출
        for (int i = 0; i < elems.size(); i++) {
            if(visited[i] == false) {
                visited[i] = true;
                Integer[] temp = Arrays.copyOf(keep, keep.length + 1);
                temp[temp.length - 1] = elems.get(i);

                result = permutation(choiceNum, elems, temp, visited, depth + 1, result);
                // 재료를 넣는 순서에 따라서 맛이 달라지므로
                // 재귀가 끝났을때 다시 재료를 사용할 수 있도록 방문 여부 false 처리
                visited[i] = false;
            }
        }
        return result;
    }
}
