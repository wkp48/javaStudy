package cond;
import java.util.Scanner;

public class ConOp2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요: ");
        int age = sc.nextInt();
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println(status);
    }
}
