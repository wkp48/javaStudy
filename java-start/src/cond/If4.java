package cond;
import java.util.Scanner;
//가격이 10000원 이상이면 1000원 할인이고 10살 미만이면 1000원 추가 할인
public class If4 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //방법1
//    int itemPrice = sc.nextInt();
//    int userAge = sc.nextInt();
//    int doubleSaleItemPrice = 0;
//    int saleItemPrice = 0;
//
//    if(itemPrice >= 10000){
//        saleItemPrice = itemPrice - 1000;
//        if(userAge < 10){
//            doubleSaleItemPrice =saleItemPrice - 1000;
//            System.out.println(doubleSaleItemPrice);
//        }else{
//            System.out.println(saleItemPrice);
//        }
//    }else{
//        if(userAge < 10){
//            saleItemPrice = itemPrice - 1000;
//            System.out.println(saleItemPrice);
//        }else{
//            System.out.println(itemPrice);
//        }
//    }
    //방법2
        int price = sc.nextInt();
        int userAge = sc.nextInt();
        int discount = 0;
        int finalPrice = 0;

        if (price >= 10000){
            discount += 1000;
        }

        if (userAge < 10){
            discount += 1000;
        }

        finalPrice = price - discount;
        System.out.println("최종가격은 "+ finalPrice + "이고 할인된 가격은" + discount + "입니다.");
    }
}
