import java.util.Scanner;

public class practice{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temprature in Celcius: ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }
}