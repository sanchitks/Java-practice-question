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

//        Q3 : Finding the largest num

        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int max = a;

//        if (b>a){
//            max = b;
//        }
//        if (c>b){
//            max = c;
//        }
//        int max = (Math.max(c, Math.max(a,b)));
//        System.out.println(max);

//        Q4 : Casecheck in character

//        char ch = in.next().trim().charAt(0);
//        if (ch >= 'a' && ch <= 'z'){
//            System.out.println("Lowercase");
//        }
//        else {
//            System.out.println("Uppercase");
//        }

//        Q5 : Fibonacci Series

//        int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//        int i = 2;
//
//        while (i<=n){
//            int temp = b;
//            b = b+a;
//            a = temp;
//            i++;
//        }
//        System.out.println(b);

//        Q6 : Counting the occurence

//        int n = in.nextInt();
//        int f = in.nextInt();
//        int count = 0;
//
//        while(n>0) {
//            int rem = n % 10;
//            if (rem == f) {
//                count++;
//            }
//            n=n/10;
//            }
//        System.out.println(count);


//        Q7 : Reverse the number

        int n = in.nextInt();
        int rev = 0;
         while(n>0){
             int rem = n % 10;
             n /= 10;

             rev = rev * 10 + rem;
         }
        System.out.println(rev);
    }
}
