package Practice;

public class ToUpperCase {
    public static void main(String[] args) {
        String a = "nEVER  gIVE uP";
        System.out.println(letterCapitalize2(a));

    }
    static public String letterCapitalize(String str) {
        // TODO:
        if(str.equals("")) return "";
        String result = "";
        String[] arr = str.split(" ");

//        for(String temp : arr) {
//            char a = temp.charAt(0);
//            char b = Character.toUpperCase(temp.charAt(0));
//            temp.replace(temp.charAt(0), Character.toUpperCase(temp.charAt(0)));
//            result += temp;
//        }

        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            temp.replace(temp.charAt(0), Character.toUpperCase(temp.charAt(0)));
            result += temp;
        }

        return result;
    }

    static public String letterCapitalize2(String str) {
        if(str.length() == 0) return "";

        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            if(words[i].isEmpty()) {
            } else {
                words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
            }
        }

//        for(int i = 0; i < words.length; i++) {
//            if(words[i].isEmpty()) {
//            } else {
//                words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
//            }
//        }

        result = String.join(" ", words);
        return result;
    }
}
