package Collections.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class adjustArrayQueue {
    public static void main(String[] args) {
        int[][] matrix = {  {1,1},
                            {1,1}};
        System.out.println(getDirections(matrix, 0, 1));    // true
        System.out.println(getDirections(matrix, 0, 0));    // true
        System.out.println(getDirections(matrix, 1, 1));    // true
        System.out.println(getDirections(matrix, 1, 0));    // false

        System.out.println();

        int[][] matrix2 = { {0, 1, 0},
                            {0, 0, 1},
                            {0, 0, 0}};
        System.out.println(getDirections(matrix2, 0, 2));    // true
        System.out.println(getDirections(matrix2, 1, 2));    // true
        System.out.println(getDirections(matrix2, 1, 0));    // false

        System.out.println();
        boolean result2 = getDirections(new int[][]
                        {
                                {0, 1, 0, 0, 0},
                                {0, 0, 0, 1, 0},
                                {0, 1, 0, 0, 0},
                                {0, 1, 1, 0, 0},
                                {1, 1, 1, 1, 0}
                        },
                1,
                4
        );
        System.out.println(result2);
    }
    static public boolean getDirections(int[][] matrix, int from, int to) {  // from 0, to 3
        // TODO:
        if(matrix[from][to] == 1) return true;

        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[from][i] == 1) {
                que.add(i);
                matrix[from][i] = 0;
            }
        }
        // que : 1
        while(que.isEmpty() == false) {
            int temp = que.poll();
            if(matrix[temp][to] == 1) return true;
            for(int i = 0; i < matrix.length; i++) {
                if(matrix[temp][i] == 1) {
                    que.add(i);
                    matrix[temp][i] = 0;
                }
            }
        }

        return false;
    }

       //큐를 사용한 풀이
   public boolean getDirections2(int[][] matrix, int from, int to) {
     //연결 리스트를 사용하여 큐를 선언합니다.
     Queue<Integer> queue = new LinkedList<>();
     //첫 시작점으로 from을 할당합니다.
     queue.add(from);

     // 방문했다는 것을 표시하기 위해 1차원 배열을 생성합니다. 초기값은 false로 생성됩니다.
     boolean[] isVisited = new boolean[matrix.length];
     // 첫 정점 방문 여부를 표시합니다.
     isVisited[from] = true;

     // queue(방문할 곳)의 사이즈가 0이 될 때까지 반복합니다.
     while(queue.size() > 0) {

       // queue에서 정점을 하나 빼서 now에 할당합니다.
       int now = queue.poll();

       // 목적지인지 검사하고, 목적지라면 true를 반환합니다.
       if(now == to) return true;

       // 해당 정점의 간선들을 확인합니다.
       for(int next = 0; next < matrix[now].length; next++) {
         // 만약, 간선이 있고 방문하지 않았다면
         if(matrix[now][next] == 1 && !isVisited[next]) {
           // queue에 next를 넣습니다. (다음 정점으로 가기 위해)
           queue.add(next);
           // 해당 정점을 방문했다는 것을 표시합니다.
           isVisited[next] = true;
         }
       }
     }
     // 길이 없다면 false를 반환합니다.
     return false;
   }
}
