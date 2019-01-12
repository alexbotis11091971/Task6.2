import java.util.Scanner;

public class Task09 {

    public static void task09() {


        Scanner sc = new Scanner(System.in);

        System.out.println("введите число а");
        int a = sc.nextInt();

        System.out.println("введите число b");
        int b = sc.nextInt();

        System.out.println (summa   ( a,  b));



    }

    static int   summa (int a, int b){



        if (a>b) return 0;
        else
            return a+summa( a+1,  b); // рекурсия с увеличением нижнего диапозона



    }

}
