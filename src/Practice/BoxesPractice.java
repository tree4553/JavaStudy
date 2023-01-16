package Practice;

public class BoxesPractice {
    public static void main(String[] args) {
        Integer[] boxes = {5, 1, 4, 6};
        Integer[] boxes2 = {1, 5, 7, 9};
        System.out.println(paveBox1(boxes));
        System.out.println(paveBox1(boxes2));
    }

    static int paveBox1(Integer[] boxes) {
        int count = 0;
        while(boxes[0] > 0) {
            for(int i = 0 ; i < boxes.length; i ++) {
                boxes[i] -= 1;
            }
        }

        for(int i = 0 ; i < boxes.length; i++) {
            if(boxes[i] <= 0) {
                count += 1;
            }
            else {
                break;
            }
        }

        return count;
    }

    static int paveBox2(Integer[] boxes) {
        int count = 1;
        for(int i = 1; i < boxes.length; i++) {
            if(boxes[0] >= boxes[i]) {
                count += 1;
            }
            else{
                break;
            }
        }

        return count;
    }
}

