package ProgremerZamanNow.Java;

public class v8Variable {
    public static void main(String[] args) {
        /*
        Variable

Variable adalah tempat untuk menyimpan data
Java adalah bahasa [[static]] type, sehingga sebuah  variable hanya bisa digunakan untuk menyimpan tipe data yang sama, tidak bisa berubah-ubah tipe data seperti di bahasa pemrograman PHP atau JavaScript
Untuk membuat variable di Java kita bisa menggunakan nama tipe data lalu diikuti dengan nama variable nya
Nama variable tidak boleh mengandung whitespace (spasi, enter, tab), dan tidak boleh seluruhnya number

note : Di java variable int tidak bisa di isi dengan string beda dengan php dll
*/

//CONTOH PERINTAH
//DEKLARASI
String nama ;
int umur;


//PENGISIAN VARIABLE
nama = "Andika hadi saputro";
umur = 18;

//Experiment
        System.out.println("nama nya : "+nama);
        System.out.println("umur nya : "+umur);

/* JAVA AKAN MEMBACA VARIABLE DARI ATAS KE BAWAH JADI SEMISALKAN VARIABLE [[nama]] di atas
   di isi dengan Andika hadi saputro
   maka jika di isi lagi dengan contoh perintah di bawh maka akan digantikan dengan yang baru
*/
nama = "andika baru";
        System.out.println("*******");
        System.out.println(nama);
        System.out.println("*******");

 //jika di kasih variable string dikasih nomor maka akan error nama = 100;

    }}
