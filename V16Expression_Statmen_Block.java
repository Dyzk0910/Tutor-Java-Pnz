package ProgremerZamanNow.Java;

import java.util.Date;

public class V16Expression_Statmen_Block {
    public static void main(String[] args) {

/*
@@@@@@@@@@@@@@@@@@@@@@@@      Expression ( adalah satu singel value ) @@@@@@@@@@@@@@@@@@@@@@@@@2

Expression adalah konstruksi dari variabel, operator dan pemanggilan method yang mengevaluasi menjadi sebuah single value
Expression adalah core component dari statement
 */
        // CONTOH Expression PADA ASSIGMENT

        int value;
        value=10;
        System.out.println(value=100);

/*

*/

/*
@@@@@@@@@@@@@@@@@@@@@@@@2                 Statement                          @@@@@@@@@@@@@@@@@@@@@

Statement bisa dibilang adalah kalimat lengkap dalam bahasa.
Sebuah statement berisikan execution komplit, biasanya diakhiri dengan titik koma
Ada beberapa jenis statement :

Assignment expression
Penggunaan ++ dan --
Method invocation
Object creation expression
 */

        // CONTOH PADA ASSIGMENT

// assignment statement
        double aValue=8933.234;
// increment statement
        aValue ++;
// method invocation statement
        System.out.println("Hello World!");
// object creation statement
        Date date=new Date();


/*
@@@@@@@@@@@@@@@@@@@@@@@@@@                  Block          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@2

Block adalah kumpulan statement yang terdiri dari nol atau lebih statement.
Block diawali dan diakhiri dengan kurung kurawal { }

 */

        // CONTOH PADA BLOK

//        public class ExpressionApp{
//            public static void main(String[]args) {
//            }}
//

        // CONTOH PADA BLOK biar keliatan enak dan nyaman di liat kita bisa nambahkan blok atau {
        {
            System.out.println("Hello DIka");
            System.out.println("Hello DIka");
            System.out.println("Hello DIka");
            {
                System.out.println("Hello DIka");
                System.out.println("Hello DIka");
                System.out.println("Hello DIka");
                System.out.println("Hello DIka");
            }

        }

        {
            System.out.println("Hello DIka");
            System.out.println("Hello DIka");
            System.out.println("Hello DIka");
            System.out.println("Hello DIka");
        }




/*
KESIMPULAN

Urutan nya EKXPRESSION => STETMENT => BLOK



 */

    }
}
