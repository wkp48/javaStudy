package cond.ex;
import java.util.Scanner;

//정수 x가 주어지면 x가 짝수이면 '짝수' x가 홀수이면 '홀수'를 출력하는 프로그램을 작성하자.
public class ScoreEx7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userInputNumber = sc.nextInt();
        sc.close();
        String result = (userInputNumber % 2 == 1) ? "홀수" : "짝수";

        System.out.println("x: " + userInputNumber + "\n출력: x = " + userInputNumber + ", " + result);
//      String result;
//
//        if(userInputNumber % 2 == 1){
//            result = "홀수";
//            System.out.println("x = " + userInputNumber + "\n출력 : x = " + userInputNumber + "," + result );
//        }else{
//            result = "짝수";
//            System.out.println("x = " + userInputNumber + "\n출력 : x = " + userInputNumber + "," + result );
//        }



    }
}
