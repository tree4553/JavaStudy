package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Subtitle {
    public static void main(String[] args) {
//        final String adminId = "admin";
//        final String adminPw = "0000";
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("admin id: ");
//        String inputId = scan.nextLine();
//        System.out.println("admin pw: ");
//        String inputPw = scan.nextLine();
//
//        if(adminId.equals(inputId) == false || adminPw.equals(inputPw) == false) {
//            System.out.println("Wrong id or pw.");
//            return;
//        }

        System.out.println("subtitle");
        String subtitle = "아 열받아 시발 킹받네 미친";
        System.out.println(subtitle);
        System.out.println("purify");
        String purified = purify(subtitle);
        System.out.println(purified);
    }

    static public String purify(String subtitle) {
        String[] badWords = {"킹", "시발", "꺼져", "미친"};
        String[] goodWords = {"열", "사랑", "용기", "희망"};
        String[] words = subtitle.split(" ");

        // 향상된 for문은 값 수정을 할 수 없다.
//        for(String word : words) {
//            for (int i = 0; i < badWords.length; i++) {
//                if(word.equals(badWords[i]) == true) {
//                    word = goodWords[i];
//                }
//            }
//        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < badWords.length; j++) {
                if(words[i].contains(badWords[j]) == true) {
                    words[i] = words[i].replace(badWords[j], goodWords[j]);
                }
            }
        }

        // words.toString()은 주소값을 담아서 준다.
        //String result = words.toString();

        // [ ] , 가 포함된 문자열이 담긴다.
        //String result = Arrays.toString(words);

        String result = String.join(" ", words);

        return result;
    }
}
