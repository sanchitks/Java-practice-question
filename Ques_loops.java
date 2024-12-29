import java.util.Collections;
import java.util.Scanner;

public class Ques_loops {
    public static void main(String[] args) {
//        Q1: print num from 1 t0 5

//        for(int i=1; i<=5; i++){
//            System.out.println(i);
//        }

//        Q2: print num 1 to n

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 0; num <=n ; num++) {
//            System.out.print(num + " ");
//        }
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        for (int num = 1; num <= n; num++) {
//            System.out.println("Hello World!");
//        }
//        int num =1;
//        while (num<=5){
//            System.out.println(num);
//            num ++;
//        }
//        int n = input.nextInt();
//        int num = 1;
//        while (num<=n){
//            System.out.println("Hello World");
//            num++;
//        }
//        int num = 1;
//        do {
//            System.out.println("hello world");
//            num++;
//        }
//        while (num<=5);
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
//        if (b>max){
//            max = b;
//        }
//        if (c>max){
//            max = c;
//        }
        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}
