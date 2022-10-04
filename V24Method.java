package ProgremerZamanNow.Java;
/*
@@@@@@@@@@@   Method / Fungsi (Function)   @@@@@@@@@@

Method adalah block kode program yang akan berjalan saat kita panggil
Sebelumnya kita sudah menggunakan method println() untuk menampilkan tulisan di console
Untuk membuat method di Java, kita bisa menggunakan kata kunci void, lalu diikuti dengan nama method, kurung () dan diakhiri dengan block
Kita bisa memanggil method dengan menggunakan nama method lalu diikuti dengan kurung ()
Di bahasa pemrograman lain, Method juga disebut dengan Function

 */
public class V24Method {
    public static void main(String[] args) { // INI JUGA METHOD SEBENER NYA

        sayHelloWord(); // memangil method yang di buat di bawah
        System.out.println("PEMBATAS");
        sayHelloWord(); // memangil lagi
    }

    // Note : biasa kan jika membuat sebuah method depan nya huruf kecil dan kalimat selanjut nya huruf besar
    // itu kebiasaan progremer java

static void sayHelloWord (){
        // static itu nnti di ajarin di oop

    System.out.println("HELLO GESS");
    System.out.println("HELLO GESS 1");
    System.out.println("HELLO GESS 2");

}



}
