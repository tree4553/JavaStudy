package Practice;

import java.util.Scanner;

public class TextStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("자신의 유닛 정보를 입력하세요.");
        System.out.printf("name : ");
        String myName = scan.next();
        System.out.printf("attack : ");
        int myAttack = scan.nextInt();
        System.out.printf("defense : ");
        int myDefense = scan.nextInt();
        System.out.printf("health : ");
        int myHealth = scan.nextInt();
        Unit myUnit = new Unit(myName, myAttack, myDefense, myHealth);

        myUnit.showInfo();

        System.out.println("상대 유닛 정보를 입력하세요.");
        System.out.printf("name : ");
        String enemyName = scan.next();
        System.out.printf("attack : ");
        int enemyAttack = scan.nextInt();
        System.out.printf("defense : ");
        int enemyDefense = scan.nextInt();
        System.out.printf("health : ");
        int enemyHealth = scan.nextInt();
        Unit enemyUnit = new Unit(enemyName, enemyAttack, enemyDefense, enemyHealth);
        enemyUnit.showInfo();

        while(true) {
            if(Unit.attackEnemy(myUnit, enemyUnit) == 0) {
                System.out.println("더 이상 공격할 수 없습니다.");
                System.out.println("상대 유닛이 제거되었습니다.");
                break;
            }
        }
    }


}

class Unit {
    String name;
    int attck;
    int defense;
    int health;

    public Unit(String name, int attck, int defense, int health) {
        this.name = name;
        this.attck = attck;
        this.defense = defense;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getAttck() {
        return attck;
    }

    public int getDefense() {
        return defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void showInfo() {
        System.out.println("-".repeat(20));
        System.out.printf("name : %s\n", this.getName());
        System.out.printf("attack : %d\n", this.getAttck());
        System.out.printf("defense : %d\n", this.getDefense());
        System.out.printf("health : %d\n", this.getHealth());
        System.out.println("-".repeat(20));
    }

    static public int attackEnemy(Unit my, Unit enemy) {
        System.out.println("-".repeat(20));
        System.out.printf("[%s]유닛이 [공격]하였습니다.\n", my.getName());
        enemy.setHealth(enemy.getHealth() - my.getAttck());
        if(enemy.getHealth() < 0) enemy.setHealth(0);
        System.out.printf("[%s]유닛의 남은 [체력]은 %d 입니다.\n", enemy.getName(), enemy.getHealth());
        System.out.println("-".repeat(20));
        return enemy.getHealth();
    }
}