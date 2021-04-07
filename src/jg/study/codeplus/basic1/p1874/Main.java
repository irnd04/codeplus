package jg.study.codeplus.basic1.p1874;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static LinkedList<Integer> stack = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void push(int v) {
        sb.append("+\n");
        stack.push(v);
    }

    public static int pop() {
        sb.append("-\n");
        return stack.pop();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            li.add(a);
        }

        int c = 1;
        for (int i : li) {
            while (true) {
                if (c > n) break;
                if (stack.isEmpty() || stack.peek() != i)
                    push(c++);
                else break;
            }
            if (stack.isEmpty()) {
                System.out.println("NO");
                return;
            }
            if (stack.peek() == i) {
                pop();
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb.toString());

    }

}
