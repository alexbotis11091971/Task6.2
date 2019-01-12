import java.util.Scanner;

public class Task02 {

    public static void task02() {


        Scanner sc = new Scanner(System.in);

        System.out.println("введите число N");
        int N = sc.nextInt();

        Stepen (N);


    }

    static void Stepen (int n){

        int temp = n%2;// находим остаток от деления



        if (temp !=0) // если хотя бы при одном делении остаток не равен 0

            System.out.println("NO");// не степень двойки

        if (temp ==0 ) {// если остаток равен 0

            n=n/2;       // и при дальнейшем делении на 2
            if (n==1) {   // получаем 1
                System.out.println(" YES");
            }
                else

                Stepen ( n);// рекурсия



            }



    }

}



