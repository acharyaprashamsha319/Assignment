import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter weight in kg : ");
        double weight = sc.nextDouble();
        System.out.println("enter height in meter: ");
        double height = sc.nextDouble();

        double BMI = weight/(height * height);
        System.out.println("The formula for BMI is " + BMI);

    }
}