package thread;

public class ThreadExample1 {
    public static void main(String[] args) {
        Runnable task1 = new ThreadTask1();
        Thread thread1 = new Thread(task1);

        // 위에꺼랑 같다.
        //Thread thread1 = new Thread(new ThreadTask1());

        thread1.start();

        for(int i = 0; i < 100; i++) {
            System.out.print("@");
        }

        System.out.println();

        ThreadTask2 thread2 = new ThreadTask2();
        thread2.start();
        for(int i = 0; i < 100; i++) {
            System.out.print("@");
        }

        System.out.println();

        // 익명 구현 객체를 활용한 스레드 생성 및 실행
        Thread thread3 = new Thread(new Runnable() {
           public void run() {
               for (int i = 0; i < 100; i++) {
                   System.out.print("$");
               }
           }
        });
        thread3.start();

        // Thread 익명 하위 객체를 활용한 스레드 생성 및 실행
        Thread thread4 = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("%");
                }
            }
        };
        thread4.start();
    }
}

// Runnable을 implements 하는 방식
class ThreadTask1 implements Runnable {
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.print("#");
        }
    }
}

// Thread를 extends 하는 방식
class ThreadTask2 extends Thread {
    public void run() {
        for (int i = 0 ; i < 100; i++ ){
            System.out.print("!");
        }
    }
}