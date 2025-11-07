package cond.ex;
import java.util.Scanner;

public class ScoreEx3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("환전 할 달러를 입력하시오");

        int dollar = sc.nextInt();
        sc.close();
        final int ExchanceRate = 1300;
        int won = dollar * ExchanceRate;

        if (dollar < 0){
            System.out.println("잘못된 금액입니다.");
        } else if ( dollar == 0 ) {
            System.out.println("환전할 금액이 없습니다");
        }else{
            System.out.println("환전 금액은 " + won + "입니다.");
        }
    }
}
