package com.ll.exam;

import java.util.Scanner;

public class App {
    private Scanner sc;
    private int wiseSayingsLastId;

    public App() {
        sc = new Scanner(System.in);
        wiseSayingsLastId = 0;
    }

    public void run() {
        System.out.println("== 명언 SSG ==");

        outer:
        while (true) {
            System.out.printf("명령) ");
            String cmd = sc.nextLine();

            switch (cmd) {
                case "등록":
                    write();
                    break;
                case "종료":
                    break outer;
            }
        }

        sc.close();
    }

    private void write() {
        int id = ++wiseSayingsLastId;
        System.out.printf("명언 : ");
        String content = sc.nextLine();
        System.out.printf("작가 : ");
        String author = sc.nextLine();

        WiseSaying wiseSaying = new WiseSaying(id, content, author);

        System.out.printf("%d, %s, %s\n", wiseSaying.id, wiseSaying.content, wiseSaying.author);

        System.out.printf("%d번 명언이 등록되었습니다.\n", id);
    }
}
