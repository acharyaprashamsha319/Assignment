import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in meter: ");
        double distance = sc.nextDouble();
        System.out.println("Enter hour: ");
        double hour = sc.nextDouble();
        System.out.println("enter minute: ");
        double minute = sc.nextDouble();
        System.out.println("Enter seconds");
        double seconds = sc.nextDouble();

        double total_seconds = (hour*3600) + (minute*60) + seconds;
        double mps= distance/total_seconds;
        System.out.println("Speed in meter/second is " + mps);

        double kph = (distance/1000)/(total_seconds/3600);
        System.out.println("speed in km/h is " + kph);

        double mph = kph/1.609;
        System.out.println("speed in miles/h is " + mph);

    }
}