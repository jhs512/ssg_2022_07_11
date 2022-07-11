package com.ll.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private Scanner sc;
    private int wiseSayingsLastId;

    private List<WiseSaying> wiseSayings;

    public App() {
        sc = new Scanner(System.in);
        wiseSayingsLastId = 0;
        wiseSayings = new ArrayList<>();
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
                case "목록":
                    list();
                    break;
                case "종료":
                    break outer;
            }
        }

        sc.close();
    }

    private void list() {
        System.out.println(wiseSayings);
    }

    private void write() {
        int id = ++wiseSayingsLastId;
        System.out.printf("명언 : ");
        String content = sc.nextLine();
        System.out.printf("작가 : ");
        String author = sc.nextLine();

        WiseSaying wiseSaying = new WiseSaying(id, content, author);

        wiseSayings.add(wiseSaying);

        System.out.printf("%d번 명언이 등록되었습니다.\n", id);
    }
}
