import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter the operator: ");
            char opr = in.next().trim().charAt(0);

            if (opr == '+' || opr == '_' || opr == '*' || opr == '/' || opr == '%'){
                System.out.println("Enter two numbers: ");
                int a = in.nextInt();
                int b = in.nextInt();
                if (opr == '+'){
                    ans = a+b;
                }
                if (opr == '-'){
                    ans = a-b;
                }
                if (opr == '*'){
                    ans = a*b;
                }
                if (opr == '/'){
                    if (b != 0) {
                        ans = a / b;
                    }
                }
                if (opr == '%'){
                    ans = a%b;
                }
                
            }
            else if (opr == 'x' || opr == 'X') {
                System.out.println("Exited");
                break;
            }
            else {
                System.out.println("Invalid");
            }
            System.out.println(ans);
        }

    }
}
