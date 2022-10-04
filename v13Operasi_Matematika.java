package ProgremerZamanNow.Java;

public class v13Operasi_Matematika {
    public static void main(String[] args) {
        /*
Operasi Matematika

   +  Penjumlahan
   -  Pengurangan
   *  Perkalian
   /  Pembagian
   %  Sisa Pembagian
         */

        // Contoh PERINTAH
int c = 30;

    c = c+10;
    c = c-10;
    c = c/10;
    c = c*10;
    c = c%10;


        int a = 10;
        int b = 110;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);

        // Augmented Assignment
        int x = 120;
        System.out.println("******************Pembatas******************");
        System.out.println(x+=10);
        System.out.println(x-=10);
        System.out.println(x/=10);
        System.out.println(x*=10);
        System.out.println(x%=10);

/*
Unary Operatr       Kererangan

++                  a = a + 1
--                  a = a - 1
-                   Negativ
+                   Positif
!                   Boelan Kebalikan
 */
        System.out.println("***************** PEMBATAS ***********");
int y = +200;
int d = -300;

y++; // Penambahan angaka sebanyak 1 angkga jadi y + 1
        System.out.println(y);
d--; // Pengurangan angka 1 angka jadi d - 1
        System.out.println(d);

        System.out.println(!true);



        System.out.println("*********************** PEMBATAS EXPERIMENT ******************");

                                                // EKSPERIMENT GAN

/*
sifat matematika pada bilangan
negatif * negatif = positif
positif * negatif = negatif
 */
 int nilaia = -10;
 int nilaib = -10;

 int hasil = nilaia * nilaib;
        System.out.println(hasil);


//                       Contoh nilai si budi dan mencari rata rata nilai nya


        int[] NilaiSiBdi = {75,85,89,90,70,90};


        System.out.println(NilaiSiBdi[0]);


int hasilku = 0;


for (int wew = 0; wew < NilaiSiBdi.length ; wew++){
    //hasilku +=NilaiSiBdi[wew];
    hasilku = hasilku + NilaiSiBdi[wew];

};

double rata2nilai = hasilku/NilaiSiBdi.length;
        System.out.println("Nilai Mapel kmu     : "+NilaiSiBdi.length);
        System.out.println("Jumlah nilai kmu    : "+hasilku);
        System.out.println("Rata rata nilai kmu : "+rata2nilai);












    }
}
