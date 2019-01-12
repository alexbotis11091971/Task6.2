

import java.util.Scanner;

public class Task05 {

    public static void task05() {


        Scanner sc = new Scanner(System.in);

        System.out.println("введите число N");
        int N = sc.nextInt();

        // int  Count = Razrad ( N);



        slewaNaPrawo ( N);


    }

    static int  Razrad (int n) {

        int count =0;              // изначально пусть разряд равен 0

        while ((int) (n/10)!=0) {  // пока  разряд числа не нулевой (n>10 )

           n=(int) (n/10);         // отрезаем последнюю цифру числа
           count+=1;               // увеличиваем разряд на 1

        }
        return count;             // возвращаем разряд из метода



    }

    static void slewaNaPrawo (int n){

        int razrad = Razrad ( n);                   // вычисляем  сташий разряд
        int cifra =  (int) (n/Math.pow(10,razrad)); // вычленяем цифру старшего разряда

        System.out.print(cifra+ "  ");              // выводим  на печать  цифру старшего разряда

            if  (razrad==0) {                       // если разряд нулевой , то дальнейшее понижение не имеет смысла
            return;                                 // поэтому выходим из метода
        }
        else
            n= (int ) (n%Math.pow(10,razrad));       // отбрасываем старшую цифру  т.е. разряд  числа понижаем

        slewaNaPrawo  ( n);                          // рекурсия по печатанию цифры СТАРШЕГО разряда






    }

}





