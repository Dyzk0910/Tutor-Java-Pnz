package ProgremerZamanNow.Java;

public class v28Komentar {
    public static void main(String[] args) {

/*
@@@@@@@@@@@@@@@@@@@@@@22         Komentar        @@@@@@@@@@@@@@@@

Kadang dalam membuat program, kita sering menempatkan komentar di kode program tersebut
Komentar adalah kode program yang akan di hiraukan saat proses kompilasi, sehingga di binary code Java, tidak akan ada kode komentar tersebut
Biasanya komentar digunakan untuk dokumentasi

 */


        // KOMENTAR 1 BARIS
        System.out.println("hai");
        /*
        KOMENTAR BANYAK BARIS
         */


        /**
         * Menghitung jumlah a + b
         *
         * @param a nilai a
         * @param a nilai b
         *  nilai a + b
         */


        System.out.println(penjumlahan(15,85));

    }

    /*
    cara mengununakan perintah //* adalah dengan cara ketik //* di atas method lalu enter
     */

    /**
     *  method untuk Menghitung jumlah nilai1 + nilai2
     * @param nilai1 angka ke1
     * @param nilai2 angka ke 2
     * @return  hasil menjumlahakan value1 dan value2
     */

    static int penjumlahan(int nilai1,int nilai2){
        //penjumlahan nilai1 di tambah nilai2
        return nilai1+nilai2;



        // MATERI SELANJUTNYA OOP GES
    }
}
