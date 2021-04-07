package jg.study.codeplus.basic1.p1406;

import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {

    public static class Data {
        public int index;
        public int shape;
        public Data (int i, int s) {
            this.index = i;
            this.shape = s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Data> stack = new LinkedList<>();
        char[] chars = sc.nextLine().toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == '(') {
                stack.push(new Data(i, ch));
            } else {
                Data pop = stack.pop();
                if (i - pop.index == 1) {
                    result += stack.size();
                } else result++;
            }
        }
        System.out.println(result);
    }

}
