import java.util.Scanner;

public class Task08 {

    public static void task08() {


        Scanner sc = new Scanner(System.in);

        System.out.println("введите число M");

        int M = sc.nextInt();

        System.out.println("введите степень N");
        int N = sc.nextInt();


        System.out.println(stepen ( M,  N));


    }

    static int   stepen (int m, int n){

        if (n==0) return 1;             // нулевая степень-  возвращаем 1

       else  if (n==1) return m;        // первая степень - возвращаем основание

       else return m*stepen (m,n-1);//  рекурсия с понижением степени


    }

}
