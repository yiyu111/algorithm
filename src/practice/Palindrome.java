package practice;

import java.util.List;

public class Palindrome {


    public void isPalindrome() {
        StringBuilder sb=new StringBuilder();
        sb.appendCodePoint(97);

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        new Palindrome().isPalindrome();
        int a = 1;
        while (a < 7) {
            System.out.println((char)(Math.random()*26+'a'));
            a++;
        }
    }
}
