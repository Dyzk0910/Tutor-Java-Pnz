package ProgremerZamanNow.Java;

public class v17IF_Stetment {
    public static void main(String[] args) {
        /*

        @@@@@@@@@@@@@@@@@@22         If Statement           @@@@@@@@@@@@@@@2

Dalam Java, if adalah salah satu kata kunci yang digunakan untuk percabangan
Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
Hampir di semua bahasa pemrograman mendukung if expression

         */
        // CONTOH CODE
        var nilai=75;
        var absen=90;
        if(nilai>=75 && absen>=75){
            System.out.println("AndaLulus");
        }

        // note : di dalam kurung buka dan tutup if terisi tipe data boolean atau [TRUE/FALSE]

                                                                                                                        System.out.println("@@@@@@2   PEMBATAS   @@@@");

 /*       @@@@@@@@@@@@@@@@@@22         Else Statement          @@@@@@@@@@@@@@@2

Blok if akan dieksekusi ketika kondisi if bernilai true
Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
Hal ini bisa dilakukan menggunakan else expression
  */
    // CONTOH CODE
        var nilai1=75;
        var absen1=90;
        if(nilai1>=75 && absen1>=75) {
            System.out.println("AndaLulus");
        }
        else {
            System.out.println("Maff anda tidak lulus karena nilai anda tidak memenuhi syarat");
        }


                                                                                                                            System.out.println("@@@@@@2   PEMBATAS   @@@@");
 /*       @@@@@@@@@@@@@@@@@@22         Else If Statement          @@@@@@@@@@@@@@@2


Kada dalam If, kita butuh membuat beberapa kondisi
Kasus seperti ini, di Java kita bisa menggunakan Else If expression
Else if di Java bisa lebih dari satu bisa bercabang

*/
        if(nilai>=80 && absen>=80){
            System.out.println("Nilai Anda A");
        }else if(nilai>=70 && absen>=70){
            System.out.println("Nilai Anda B");
        }else if(nilai>=60 && absen>=60){
            System.out.println("Nilai Anda C");
        }else if(nilai>=50 && absen>=50){
            System.out.println("Nilai Anda D");
        }else{
            System.out.println("Nilai Anda E");
        }



















    }
}
