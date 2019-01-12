import java.util.Scanner;

public class Task01 {

    public static void task01() {


        Scanner sc = new Scanner(System.in);

        System.out.println("введите число а");
        int a = sc.nextInt();

        System.out.println("введите число b");
        int b = sc.nextInt();

        Print( a,  b);



    }

    static void  Print(int a, int b){

        System.out.print(a+ "  " );

        if (a==b) return;// условие выхода

        else if (a>b)
        Print( a-1,  b);// рекурсия

        else if (a<b)

            Print( a+1,  b);// рекурсия

    }

}
