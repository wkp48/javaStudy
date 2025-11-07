package cond.ex;
import java.util.Scanner;
//주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성하자. 다음과 같은 기준을 따른다.
// 거리가 1km 이하이면, 도보, 거리가 10km 이하이면 자전거, 거리가 100km이하이면 자동차, 거리가 100km 초과이면 비행기
public class ScoreEx2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("거리를 입력하시오 :");
        int distance = sc.nextInt();
        sc.close();
        String transport;

        if (distance <= 1){
            transport = "도보";
        }else if(distance <= 10){
            transport = "자전거";
        }else if(distance <= 100){
            transport = "자동차";
        }else{
            transport = "비행기";
        }

        System.out.print(transport + "를 이용하세요.");
    }
}
