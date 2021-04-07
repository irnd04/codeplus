package jg.study.codeplus.basic1.p1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    /**
     * asdf|
     * L -> asd|f
     * D -> asdf|
     * B -> asd|
     * P$ -> asd$|
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> left = new LinkedList<>();
        LinkedList<Character> right = new LinkedList<>();
        String s = br.readLine();
        for (char c : s.toCharArray())
            left.push(c);

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String comm = st.nextToken();
            switch (comm) {
                case "P":
                    left.push(st.nextToken().charAt(0));
                    break;
                case "L":
                    if (!left.isEmpty())
                        right.push(left.pop());
                    break;
                case "D":
                    if (!right.isEmpty())
                        left.push(right.pop());
                    break;
                case "B":
                    if (!left.isEmpty())
                        left.pop();
                    break;
            }
        }

        LinkedList<Character> temp = new LinkedList<>();
        while (!left.isEmpty())
            temp.push(left.pop());

        StringBuilder sb = new StringBuilder();

        while (!temp.isEmpty())
            sb.append(temp.pop());

        while (!right.isEmpty())
            sb.append(right.pop());

        System.out.println(sb.toString());

    }

}
