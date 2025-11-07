package cond;
import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String grade = sc.next();
        int coupon;

        switch (grade){
            case "Bronze":
                coupon = 1000;
                break;
            case "Silver":
                coupon = 2000;
                break;
            case "Gold":
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }

        System.out.println(coupon);
    }
}
