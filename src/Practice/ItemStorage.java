package Practice;

import java.util.Scanner;

public class ItemStorage {
    static Item[] storage = new Item[5];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < storage.length; i++) {
            storage[i] = new Item();
        }

        while(true) {
            printOperation();
            int op = scan.nextInt();
            String inputName;
            int inputNum;
            switch(op) {
                case 1:
                    System.out.printf("제품 이름을 입력하세요. : ");
                    inputName = scan.next();
                    addMenu(inputName);
                    showItems();
                    break;
                case 2:
                    System.out.printf("제품 이름을 입력하세요. : ");
                    inputName = scan.next();
                    deleteMenu(inputName);
                    showItems();
                    break;
                case 3:
                    showItems();
                    System.out.printf("제품 이름을 입력하세요. : ");
                    inputName = scan.next();
                    System.out.printf("수량을 입력하세요. : ");
                    inputNum = scan.nextInt();
                    addQuantity(inputName, inputNum);
                    showItems();
                    break;
                case 4:
                    showItems();
                    System.out.printf("제품 이름을 입력하세요. : ");
                    inputName = scan.next();
                    System.out.printf("수량을 입력하세요. : ");
                    inputNum = scan.nextInt();
                    removeQuantity(inputName, inputNum);
                    showItems();
                    break;
                case 5:
                    showItems();
                    break;
                default:
                    System.out.println("종료");
                    return;
            }
            System.out.println("계속 하려면 enter 입력");
            scan.nextLine();
            scan.nextLine();
        }
    }

    private static void printOperation() {
        System.out.println("-".repeat(20));
        System.out.println("기능");
        System.out.println("-".repeat(20));
        System.out.println("1. 제품 등록");
        System.out.println("2. 제품 제거");
        System.out.println("3. 제품 입고");
        System.out.println("4. 제품 출고");
        System.out.println("5. 재고 조회");
        System.out.println("6. 프로그램 종료");
        System.out.println("-".repeat(20));
        System.out.printf("원하는 기능을 입력하세요. : ");
    }

    private static int findIndexByName(String name) {
        for (int i = 0; i < storage.length; i++) {
            if(storage[i].getName().equals(name) == true) return i;
        }
        return -1;
    }

    private static void addMenu(String name) {
        int n = findIndexByName("등록 가능");
        if(n == -1) {
            System.out.println("제품 가득참. 제품 등록 불가.");
            return;
        }
        storage[n].setName(name);
        storage[n].setQuantity(0);
    }

    private static void deleteMenu(String name) {
        int n = findIndexByName(name);
        if(n == -1) {
            System.out.println("제품 없음. 제품 제거 불가.");
            return;
        }
        storage[n].setName("등록 가능");
        storage[n].setQuantity(0);
    }

    private static void addQuantity(String name, int num) {
        int n = findIndexByName(name);
        if(n == -1) {
            System.out.println("제품 없음. 수량 추가 불가.");
            return;
        }
        storage[n].addQuantity(num);
    }

    private static void removeQuantity(String name, int num) {
        int n = findIndexByName(name);
        if(n == -1) {
            System.out.println("제품 없음. 수량 제거 불가.");
            return;
        }
        if(storage[n].getQuantity() - num < 0) {
            System.out.println("갯수 초과. 수량 제거 불가.");
            return;
        }
        storage[n].removeQuantity(num);
    }

    private static void showItems() {
        System.out.println("-".repeat(20));
        System.out.println("현재 등록된 제품 및 수량");
        for (int i = 0; i < storage.length; i++) {
            System.out.printf("> %s : %d개\n", storage[i].getName(), storage[i].getQuantity());
        }
        System.out.println("-".repeat(20));
    }
}

class Item{
    private String name;
    private int quantity;

    public Item() {
        this.name = "등록 가능";
        this.quantity = 0;
    }

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void removeQuantity(int quantity) {
        this.quantity -= quantity;
    }
}
