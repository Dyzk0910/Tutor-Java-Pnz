package ProgremerZamanNow.Java;

public class V18Switch_Statement {
    public static void main(String[] args) {
        /*
        @@@@@@@@@@@@@@@@@@@@@@@@@@       Switch Statement       @@@@@@@@@@@@@@@@@@@@@@@

Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==
Switch adalah statement percabangan yang sama dengan if, namun  lebih sederhana cara pembuatannya
Kondisi di switch statement hanya untuk perbandingan ==

         */
        System.out.println("************** PEMBATASAN KE 1 ***************");

var nilai1 = "A";

        // JADI NILAI NYA DIBAWAH A , B , C MAKA TIDAK LULUS DAN JIKA MELEWATI DARI D MAKA ANDA SALAH JURUSAN

        switch(nilai1){
            case"A":
                System.out.println("Wow Anda Lulus Dengan Baik");
                break;
            case"B": // Disini mengecek 2x sekaligus
            case"C":
                System.out.println("Anda Lulus");
                break;
            case"D":
                System.out.println("Anda Tidak Lulus");
                break; // pakai brek untuk menyetop
            default: // jika kodisi semua tidak ada maka pakai default ini sama saja dengan else
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        System.out.println("************** PEMBATASAN KE 2 ***************");

/*
Switch Lambda

Di Java versi [[ 14 ]] , diperkenalkan switch expression dengan lambda
Ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci [[break]]

 */

        // CONTOH PERINTAH ini lebih simpel dan hanya beberapa baris dibanding di atas

var nilai2 = "B";

        switch(nilai2){

            case"A"->System.out.println("Wow Anda Lulus Dengan Baik");
            case"B","C"->System.out.println("Anda Lulus");
            case"D"->System.out.println("Anda Tidak Lulus");
            default->{
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }


        System.out.println("************** PEMBATASAN KE 3 ***************");





 /*
 Kata Kunci yield

Di Java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield untuk mengembalikan nilai pada switch statement
Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement

  */
        // CONTOH PERINTAH Switch Tanpa yield

var niali3 = "C";

        String ucapanku;
        switch(niali3){

            case"A"->ucapanku = ("Wow Anda Lulus Dengan Baik");
            case"B","C"->ucapanku =("Anda Lulus");
            case"D"->ucapanku =("Anda Tidak Lulus");
            default->{
                ucapanku =("Mungkin Anda Salah Jurusan");
            }
        }
        System.out.println(ucapanku); // harus pakai ini biar menampilkan data




        System.out.println("************** PEMBATASAN KE 4 ***************");





        // CONTOH PERINTAH Denganyield
var nilai4= "D";
String ucapan4;
         ucapan4 = switch(nilai4){
            case"A":
                yield"Wow Anda Lulus Dengan Baik";
            case"B","C":
                yield"Anda Lulus";
            case"D":
                yield"Anda Tidak Lulus";
            default:
                yield"Mungkin Anda Salah Jurusan";
        };
        System.out.println(ucapan4); // harus pakai ini biar menampilkan data





    }
}
