import java.util.Scanner;

public class Task10 {

    public static void task10() {


        Scanner sc = new Scanner(System.in);

        System.out.println("введите число а");
        int a = sc.nextInt();

        System.out.println("введите число b");
        int b = sc.nextInt();

        if ( b>a) { // находим большее из чисел и присваиваем  его значению  a

            int temp= a;
            a=b;
            b=temp;


        }

        System.out.println (NOD( a,  b));// вызываем метод , при условии a>b

    }

    static int   NOD (int a, int b) {

        int r= a%b;                      // находим остаток от деления
        if (r == 0) return b;             // если он нулевой, то делитель и есть NOD
        else                             // иначе

           return NOD( b,r);            // рекурсия


    }

}
