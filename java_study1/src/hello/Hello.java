package hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
//        System.out.println(in.next());
//        System.out.println(in.nextLine());
//        System.out.println(i);
//        System.out.println("2+3="+5);
//        System.out.println("2+3="+2+3);
//        System.out.println("2+3="+(2+3));
//        System.out.println(2+3+"=2+3");
        int[] num = new int[i];
        num[0] = 0;
        num[1] = 1;
        System.out.println(num.length);
    }
}
