import java.util.Scanner;

public class Task03 {

    public static void task03() {


        Scanner sc = new Scanner(System.in);

        System.out.println("введите число N");
        int N = sc.nextInt();



        System.out.println(Symma ( N));

    }

    static int  Symma (int n){

       int cifra =   n%10; // выделяем цифру

       if ((int) (n/10)==0) { // если цифра последняя
           return cifra;      // возвращаем ее в сумму
       }
           else              // в  противном случае
           n= (int) (n/10); // отрезаем последнюю цифру

           return  (cifra +Symma ( n));// рекурсивно находим сумму цифр




       }

    }







