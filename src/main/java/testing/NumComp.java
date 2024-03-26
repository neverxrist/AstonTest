package testing;

import java.util.Scanner;

public class NumComp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat(),
                b = scanner.nextFloat();
        if (a>b) {
            System.out.println("a>b");
        } else if (a<b) {
            System.out.println("a<b");
        } else {
            System.out.println("a=b");
        }
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(b/a);
        System.out.println(a-b);
        System.out.println(b-a);
        System.out.println(a+b);
    }
}
