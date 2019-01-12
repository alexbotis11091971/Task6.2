

import java.util.Scanner;

public class Task06 {

    public static void task06() {


        Scanner sc = new Scanner(System.in);

        System.out.println("введите число N");
        int N = sc.nextInt();


        System.out.println ( Perewertysz ( N));



    }

    static int  Perewertysz (int n){

        int cifra =   n%10;        //  получаем последнюю цифру
       int r= Razrad ( n);         // получаем разряд цифры в перевертыше !!!

        if ((int) (n/10)==0) {     // если цифр в числе последняя
            return cifra;          // возвращаем ее
        }
        else                        // в противном случае
          n= (int) (n/10);           // отбрасываем последнюю цифру

         return  (int )(cifra* Math.pow(10,r) )+  Perewertysz ( n);
         // цифру умножаем на 10 в степени разряда в перевертыше и выполняем  рекурсивно
    }






    static int  Razrad (int n) {    // метод вычисляет разряд числа n
        int count =0;               // начинаем с 0
        while ((int) (n/10)!=0) {   // отбрасываем последнюю цифру и проверяем  оставшуюся часть на 0

            count+=1;               // наращиваем разряд

            n=(int) (n/10);         // отбрасываем у числа последнюю цифру


        }
        return count;               // возвращаем разряд



    }





    }



