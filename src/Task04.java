

import java.util.Scanner;

public class Task04 {

    public static void task04() {


        Scanner sc = new Scanner(System.in);

        System.out.println("введите число N");
        int N = sc.nextInt();

        // int  Count = Razrad ( N);



        Print ( N);


    }

    static int  Razrad (int n) {      // метод определяющий разряд числа

        int count =0;                 // нулевой разряд например как у числа 9

        while ((int) (n/10)!=0) {      //  пока целая часть от деления  на 10 не равна 0

          count+=1;                     // увеличиваем разряд

           n=(int) (n/10);               // и отрезаем последнюю цифру


        }
        return count;                   // возвращаем разряд



    }

    static void Print (int n){

        int razrad = Razrad ( n);                   // вычисляем  сташий разряд
        int cifra =  (int) (n/Math.pow(10,razrad)); // вычленяем цифру старшего разряда

        System.out.print(cifra+ "  ");              // выводим  цифру старшего разряда

        if ( (n%Math.pow(10,razrad)  )==0) {         // если цифра последняя
            return;                                  // выходим из метода
        }
        else
            n= (int ) (n%Math.pow(10,razrad));       // отбрасываем  цифру старшего разряда



        Print ( n);                                  //  и выполняем рекурсия по печатанию цифры СТАРШЕГО разряда






    }

}





