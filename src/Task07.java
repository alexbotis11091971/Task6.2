import java.util.Scanner;
import java.util.StringTokenizer;

public class Task07 {

    public static void task07() {

        String sample= getString();                     // получаем строку

        StringTokenizer st= new StringTokenizer (sample); // создаем объект  StringTokenizer

        while (st.hasMoreTokens()){

            String slowo= st.nextToken();                 // получаем slowo из строки
            System.out.print(slowo + "  ");

            char [] Slowo= toChar (slowo);                // формируем из него таблицу символов  char [] Slowo
          System.out.println (polindrom (  Slowo, 0)); // проверяем на полиндромность


        }



    }

   public static String getString() { //получаем строку из Scanner

       System.out.println ("Введите строку");
       return new Scanner(System.in).nextLine();

    }


    public static char [] toChar (String slowo){ // преобразуем String slowo в  массив char [] toChar

     return slowo.toCharArray();


    }

    public static String polindrom ( char [] slowo, int i){ // проверка на полидромность

        int len= slowo.length;                // длина  slowo

        if ( slowo[i]!= slowo [len-1-i])      // если симметричные индексы не совпадают
           return ("NO");                     // слово не полиндромно


       else if (i==(int) ((len-1)/2) ) {       // если перебрали "до середины" слова и верхнее условие не выполнено

        return (  "YES");                       // то слово полиндром

       }
       else return polindrom (slowo,i+1);    // рекурсия,    индекс симметрии наращиваем



    }

}