package ProgremerZamanNow.Java;

import com.sun.jdi.Value;

public class V26Method_Retun_Value {
    public static void main(String[] args) {


//   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2        Method Return Value           @@@@@@@@@@@@@@@@@@@@@@@@@


        // fungsi penjumlahan
        var jumlah= penjumlahan(100,100);
        System.out.println(jumlah);

        // fungsi perkalian
        var kali = perkalian(5,5);
        System.out.println(kali);

        // fungsi perhitungan
        System.out.println(hitung(9,"x",10)); // ini terpenuhi
        System.out.println(hitung(10,"aye",50)); // ini tidak terpenuhi


        System.out.println("******* PEMATAS ***********");
//    @@@@@@@@@@@@@@@2222@@@@@@@@@@@@@@@@@       Method Variable Argument    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


// KODE TANPA anpa Variable Argument

    int[] valuesku = {80,75,90,80,80,80,80,80};
    sayCongrats("andika",valuesku);

    int[] valuesKY = {75,75,75,75,75,50,45};
    sayCongrats("andika",valuesKY);
    // : note kan ribet tuh bikin tipe data lagi di luar

// KODE Dengan Variable Argument

        ucapanSelamat("ANDIKA BARU",80,80,80,80,80); // LEBIH SIMPEL
        ucapanSelamat("ANDIKA BARU BANGET",80,80,80,80,80); // LEBIH SIMPEL



        System.out.println("******* PEMATAS ***********");
//    @@@@@@@@@@@@@@@2222@@@@@@@@@@@@@@@@@       Method OverLoading    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


        overLoading();
        overLoading(10);
        overLoading("andika");
        overLoading(18,"ANDIKA");
        overLoading("andika",18);


        System.out.println("******* PEMATAS ***********");
//    @@@@@@@@@@@@@@@2222@@@@@@@@@@@@@@@@@       Recursive Method     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


        System.out.println(factorialLoop(23));
        System.out.println(factorialRecursive(23));

        System.out.println("******* PEMATAS ***********");
//    @@@@@@@@@@@@@@@2222@@@@@@@@@@@@@@@@@       problem Dengan Recursive    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


       loopku(15); // maka akan nampil loop dari 15 sampai 0
        // loopku(10000); // maka akan error dan hasil nya akan menenjukuan berapa maksimal method yang dapat di pangil itu sesuai kapasitas leptop
        //  loopku(-15); // maka akan error dan tidak akan berhenti dan akan sama kaya di perintah ke 68






    }





    /*
    @@@@@@@@@@@@@@@@@@@@@@@@2        Method Return Value           @@@@@@@@@@@@@@@@@@@@@@@@@

    Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin, kita bisa membuat sebuah method mengembalikan nilai
    Agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data yang dihasilkan
    Dan di dalam block method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return, lalu diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method
    Di Java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari satu

     */



    static int penjumlahan(int nilai1, int nilai2){
        var totaljumlah = nilai1 + nilai2;
        return totaljumlah; // jika ada kembalian maka harus mengunakan retrun dan 1 method itu 1 tipe data
    }
    static  int perkalian(int nilai3,int nilai4){
        var totalkali = nilai3 * nilai4;
        return totalkali ;
    }


    static  int hitung(int value1,String operasi , int value2){
        switch (operasi){
            case "+":
            return value1 + value2;
            case "-" :
            return  value1 - value2;
            case "x":
            return value1 * value2;
            default: // jika semua kondisi tidak terpenuhi / else
                return 0;
        }


    }

    /*

    @@@@@@@@@@@@@@@@@       Method Variable Argument    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut
Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah tak tentu, bisa nol atau lebih
Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter
     */


    // KODE TANPA anpa Variable Argument

    static void sayCongrats(String name,int[]values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        int finalValue = total / values.length;
        if (finalValue >= 75) {
             System.out.println("Selamat "+ name +" Anda Lulus");
        } else {
            System.out.println("Maaf " +name+" Anda tidak Lulus");

        }

    }

    // KODE DENGAN VARIABLE ARGUMENT

    static void ucapanSelamat(String name,int... nilaimu){ // Note : perbedaan nya hanya mengunakan int...

        int total = 0;
        for (var value : nilaimu) {
            total += value;
        }
        int finalValue = total / nilaimu.length;
        if (finalValue >= 75) {
            System.out.println("Selamat "+ name +" Anda Lulus");
        } else {
            System.out.println("Maaf " +name+" Anda tidak Lulus");

        }
    }



/*
@@@@@@@@@@@@@@@@@@@@@@@@@@22              Method Overloading         @@@@@@@@@@@@@@@@@@@@@@@@@@@

Method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali.
Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda-beda, enta jumlah atau tipe data parameternya
Jika ada yang sama, maka program Java kita akan error

 */

 static void overLoading(){
     System.out.println("helo ges");
 }
 static void overLoading(String ciepusing){
     System.out.println("Hello "+ ciepusing);
 }
 static void overLoading(int capegan){
     System.out.println("Umur : "+capegan);
 }
 static void overLoading(String ciepusing,int capegan){
     System.out.println("nama kamu : "+ciepusing+" Umur kamu : "+capegan);
 }

 static void overLoading(int capegan , String ciepusing){
     System.out.println("nama kamu : "+ciepusing+" Umur kamu : "+capegan);
 }

//INI AKAN ERROR KARENA SUDAH ADA FUNGSI YANG MENGUNAKAN STRING LALAU INT
// static void Overloading(String ciepusing1,int capegan){
//
// }

 // Bisa bikin sebanyak mungkin asalkan isi dalam tipe data di dalam method nya beda beda




/*
@@@@@@@@@@@@@@@@@@@@@@@@@@22      Recursive Method          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@2

Recursive method adalah kemampuan method memanggil method dirinya sendiri
Kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan recursive method, seperti contohnya kasus factorial

 */

    // Kode : Factorial Loop

    static int factorialLoop(int value){
        var result=1;
        for(var nilaiku =1;nilaiku<=value;nilaiku++){
            result*=nilaiku;
        }
        return result;
    }

    // Kode : Factorial Recursive

    static int factorialRecursive(int Value){
          if (Value == 1){
              return 1;

          }else {
              return Value * factorialRecursive(Value-1); // pemangilan diri nya sendiri atau mengunakan fungsi di dalam fungsi
          }
     }


/*
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2                Problem Dengan Recursive       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
 HATI HATI

// NOTE : Walapun menarik namun hati hati si java harus menunggu method yang paling ujung dulu yang paling terakir di pangil

Walaupun recursive method itu sangat menarik, namun kita perlu berhati-hati
Jika recursive terlalu dalam, maka  akan ada kemungkinan  terjadi error StackOverflow, yaitu error dimana stack method terlalu banyak di Java
Kenapa problem ini  bisa terjadi? Karena ketika kita memanggil method, Java akan menyimpannya dalam stack, jika method tersebut memanggil method lain, maka stack akan menumpuk terus, dan jika terlalu dalam, maka stack akan terlalu besar, dan bisa menyebabkan error StackOverflow

 */

// Kode : Error StackOverflow

    static void loopku(int value){
        if(value ==0){
            System.out.println("Selesai");
        }else{
            System.out.println("Loop-"+value);
            loopku(value-1); //mengunakan recursive
        }
    }
             // jadi contoh methode loopku di isi dengan 1000 maka akan sampai ke 0














}
