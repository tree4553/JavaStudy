package Practice;

public class BoringBlackJack {
    public static void main(String[] args) {
        System.out.println(boringBlackjack(new int[]{1,2,3,4}));
    }
    static public int boringBlackjack(int[] cards) {
        // TODO:
        int result = 0;
        for(int i = 0; i < cards.length; i++) {
            for(int j = i + 1; j < cards.length; j++) {
                for(int k = j + 1; k < cards.length; k++) {
                    if(isPrime(cards[i] + cards[j] + cards[k]) == true) {
                        result += 1;
                    }
                }
            }
        }
        return result;
    }

    static public boolean isPrime(int input) {
        for(int i = 2; i*i <= input; i++) {
            if (input % i == 0) return false;
        }
        return true;
    }
}
