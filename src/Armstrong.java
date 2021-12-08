import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a 3 digit number to check  if its an armstrong or not:  ");
        int num = sc.nextInt();
        int temp;
        int remainder;
        int result=0;
        int n=String.valueOf(num).length();
        System.out.println("length of entered number" + n);
        temp = num;
        while (temp>0){
            remainder = temp%10;
            result +=  Math.pow(remainder,n);
            temp = temp/10;
        }
        if (num == result){
            System.out.println("number is Armstrong");
        }
        else {
            System.out.println("number is not armstrong");
        }






    }
}