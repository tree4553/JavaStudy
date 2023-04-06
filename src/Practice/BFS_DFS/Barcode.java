package Practice.BFS_DFS;

public class Barcode {
    public static void main(String[] args) {
        System.out.println(barcode(3));

        System.out.println(isValid("123131"));

    }
    static public String barcode(int len) {
        return aux("", len);
    }

    static public boolean isValid(String str) {
        // index 관리를 편하게 하기 위해 string reverse
        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();
        // 인접한 두 개의 부분 수열이 동일한지 확인한다.
        // 최대 절반 길이만큼만 두 개의 부분 수열이 가능하다.
        int halfLen = (int)Math.floor((double) str.length() / 2);

        for(int i = 1; i <= halfLen; i++) {
            String a =reverse.substring(0, i);
            String b =reverse.substring(i, i + i);
            if(reverse.substring(0, i).equals(reverse.substring(i, i + i))) {
                return false;
            }
        }
        return true;
    }

    static public String aux(String str, int len) {
        String chr = "123";
        // 유효성을 통과해서 만든 길이 len의 str을 리턴한다.
        if(str.length() == len) return str;
        // 조건을 만족하는 가장 작은 수를 찾고 있으므로,
        // 1, 2, 3 순서대로 검토한다.
        // 실제 수(number) 비교는 필요없다.
        for(int i = 0; i < chr.length(); i++) {
            String currentStr = str + chr.charAt(i);
            if(isValid(currentStr)) {
                String founded = aux(currentStr, len);
                if(founded != null) return founded;
            }
        }
        // 현재 str에서 1, 2, 3을 이어붙여서 유효한 문자열을 만들 수 없는 경우
        return null;
    }
}
