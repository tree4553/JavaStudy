package Practice;

import java.util.Scanner;

public class ItemStorage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            printOperation();
            int op = scan.nextInt();
            switch(op) {
                case 1:
                    addMenu();
                    break;
                case 2:
                    deleteMenu();
                    break;
                case 3:
                    addQuantity();
                    break;
                case 4:

            }
        }
    }

    private static void printOperation() {
        System.out.println("-".repeat(10));
        System.out.println("Operation");
        System.out.println("1. 물건 정보 등록");
        System.out.println("2. 물건 등록 취소");
        System.out.println("3. 제품 입고");
        System.out.println("4. 제품 출고");
        System.out.println("5. 재고 조회");
        System.out.println("6. 프로그램 종료");
        System.out.println("-".repeat(10));
    }
}
