package cond;
import java.util.Scanner;

public class If5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();//Bronze,Silver,Gold; Bronze= 쿠폰 1000, Silver = 쿠폰 2000, Gold = 쿠폰 3000
        int coupon = 0;
        if(grade.equals("Bronze")){
            coupon = 1000;
        } else if(grade.equals("Silver")){
            coupon = 2000;
        } else if (grade.equals("Gold")) {
            coupon = 3000;
        }else{
            coupon = 500;
        }

        System.out.println("발급 받으신 쿠폰은" + coupon + "원 입니다.");

    }
}
