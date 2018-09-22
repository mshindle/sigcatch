package com.coffeegem.sigcatch;

public class App {
    private static Thread main;
    public static void main(String[] args) throws Exception {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                System.out.println("TERM");
                main.interrupt();
                for (int i = 0; i < 4; i++) {
                    System.out.println("busy");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {}
                }
                System.out.println("exit");
            }
        }));
        main = Thread.currentThread();
        while (true) {
            Thread.sleep(1000);
            System.out.println("run");
        }
    }
}
