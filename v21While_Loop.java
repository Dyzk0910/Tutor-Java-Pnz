package ProgremerZamanNow.Java;

public class v21While_Loop {
    public static void main(String[] args) {
        /*
@@@@@@@@@@@@@@@@@@@@@@@@@@        While Loop      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@

While loop adalah versi perulangan yang lebih sederhana dibanding for loop
Di while loop, hanya terdapat kondisi perulangan, tanpa ada init statement dan post statement

         */
        var a = 1;
        while (a <= 5 ){
            System.out.println("Pengulangan ke - " + a);
            a++;} // diberi ini agar tidak berulang terus menerus


        System.out.println("***** Pembatas *****");

        /*

@@@@@@@@@@@@@@@@@@@@@@@@@@  Do While Loop @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Do While loop adalah perulangan yang mirip dengan while
Perbedaannya hanya pada pengecekan kondisi
Pengecekan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan,
sedangkan di do while loop dilakukan setelah perulangan dilakukan
Oleh karena itu dalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kondisi tidak bernilai true

 */
        var b = 100;
        do {
            System.out.printf(" " + b+" ");
            b++;
        } while (b <= 10);
        // note : Kalo do itu jalanin dlu 1x baru cek kondisi nya maka kenapa hasil nya 100 karena di bagian while dia gak teru

        System.out.println("\n *** Pembatas  *** ");

        int c = -10;
        do {
            System.out.printf(" " + c+ " ");
            c++;
        } while (c <= 10);


/*
Kesimpulan jadi kalo do while itu di jalanin dlu kode 1x baru abis itu
ke while ingat kalo kode itu berjalan dari atas ke bawah
jadi ini berguna misalkan ingin menampilkan menu hanya 1x aja dan butuh kasus pengulangan minimal 1x saja

*/


/*
Break & Continue

Pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch
Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan.
Namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya

 */

    }
}
