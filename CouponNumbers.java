package bridgelabz.logicalprograms;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
 public static int num,len;
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distinct value(1 to 9):");
        len = sc.nextInt();
        System.out.println("How many random coupon you need:");
        num= sc.nextInt();
        couponcode(len,num);
    }
    public static void couponcode(int Length,int items) {
        char[] numbers = "1234567890".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new SecureRandom();
        for (int i = 0; i < items; i++) {
            for (int j = 0; j < Length; j++) {
                char n = numbers[random.nextInt(numbers.length)];
                sb.append(n);
            }
            String coupon = sb.toString();
            int d=i+1;
            System.out.println("Coupon number "+d+" is "+coupon);
            sb.delete(0,len);
        }

	}

}
