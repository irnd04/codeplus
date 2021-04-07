package jg.study.codeplus.basic1.p10799;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int before = 0;
        int count = 0;
        int sum = 0;
        for (char ch : sc.nextLine().toCharArray()) {
            if (ch == '(') {
                count++;
            } else {
                count--;
                if (before == '(')
                    sum += count;
                else sum += 1;
                ch = '&';
            }
            before = ch;
        }

        System.out.println(sum);

    }

}
