package ProgremerZamanNow.Java;

public class v12Tipe_Data_Array {
    public static void main(String[] args) {
/*
Tipe Data Array
 Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
 Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat
*/

/*
Pengertian pribadi
Array itu kaya sebuah Lemari di perpustakaan contoh nya di perpustakaan ada
1 Lemari dengan 10 slot berjejeran ke kanan

contoh kasus :
saya ingin mengambil sebuah buku yang berjudul progremer
dengan keterangan lemari

1 Lemari ada 6 slot atau 6 slerekan
[0] = berisi tentang belajar membaca
[1] = berisi tentang belajar bahasa inggris
[2] = berisi tentang belajar bahasa jerman
[3] = berisi tentang belajar bahasa pemerogaman
[4] = berisi tentang belajar bahasa jawa
[5] = berisi tentang belajar bahasa india

jawaban : maka jawaban nya adalah ada di lemari 1 dan slot ke 3
 */

//CONTOH PERINTAH

String[] Lemaribuku; // String[] Lemaribuku new String[6]; (( gini juga bisa ))
Lemaribuku = new String[6];
Lemaribuku[0]   =   "buku belajar membaca";
Lemaribuku[1]   =   "buku belajar ingris";
Lemaribuku[2]   =   "buku belajar jerman";
Lemaribuku[3]   =   "buku belajar pemerogaman";
Lemaribuku[4]   =   "buku belajar jawa";
Lemaribuku[5]   =   "buku belajar ";

// kalo mau ambil data ke 3

        System.out.println(Lemaribuku[3]);


// menganti isi array

Lemaribuku[5]   =   "buku belajar india ";
System.out.println(Lemaribuku[5]);



// NOTE MENULIS ARRAY BANYAK SEKALI CARA NYA

int[] arryint = new int[]{
  10,19,54,87,61,54,8755,2154,87
};

long[] arrylong = {
        10L,80l,984l
};


// OPERASI DI ARRAY
/*
Operasi Array

Mengambil data di array : array[index]
Mengubah data di array  : array[index] = value  note : di java tidak bisa menghapus data array jadi bisa nya di ubah value nya
Mengambil panjang array : array.length

*/

// MEMBUAT ARRAY DI DALAM ARRAY

String[][] PasarSwalayan = {
        {"Penjual makanan"/*0*/,"Penjual daging"/*1*/,"Penjual"/*2*/},      //   lantai  0
        {"Penjual Pelastik","Penjual Emas","Penjual Baju"},                 //    lantai 1
        {"Penjual Baju","Penjual ATK","Penjual Elektronika"},               //    lantai 2
        };

        System.out.println(PasarSwalayan[0][1]);
        System.out.println(PasarSwalayan[1][2]);
        System.out.println(PasarSwalayan.length);
    }
}
