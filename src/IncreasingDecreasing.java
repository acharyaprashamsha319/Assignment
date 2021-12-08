import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();
        System.out.println("Enter third number: ");
        int third = sc.nextInt();

        if (first>second && second>third){
            System.out.println("Decresing order");
        }
        else if (first<second && second<third){
            System.out.println("Increasing order");
        }
        else {
            System.out.println("neither inceasing or decreasing");
        }

    }
}