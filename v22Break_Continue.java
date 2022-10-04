package ProgremerZamanNow.Java;


public class v22Break_Continue {
    public static void main(String[] args) {
        /*
        ********************          Break & Continue         **********************

Pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch
Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan.
Namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya

         */
/*
BREAK
Break adalah kondisi dimana ingin memberhentikan pengulanagan jadi
gada pengulangan yang berulang di dalam LOOp

*/
        // CONTOH PENGGUNAAN PADA BREAK
        var a = 1;
        while(true){
            System.out.println("Perulangan ke-"+a);
            a ++;
            if(a>10){ // jika kondisi true maka akan masuk kedalam blok sini dan akan berhenti
                break; // PAKSA BERHENTI
            }
        }
        System.out.println("*************** Pembatas ******************");
        // COntoh Pengunaan Pada Continue dan mencari bilangan ganjil
        for(int counter = 1 ; counter <= 10; counter ++){
            if(counter % 2 == 0){ // sifat bilangan ganjil adalah tidak bisa di bagi 2 dan tidak memiliki sisa
                continue;// lanjutkan pengulangan jika kodisi tidak terpenuhi
            }
            System.out.printf(" "+counter+" ");
        }





// EKSPERIMENT MENCARI NILAI BILANGAN PRIMA
        // PERLU DI INGAT SIFAT BILANGAN PRIMA ITU PASTI BILANGAN BULAT DAN HANYA BISA DI BAGI OLEH BILANGAN 1 DAN BILANGAN ITU SENDIRI


        int bil;
        int awal = 1;
        int akhir = 100;
        System.out.println("PROGRAM JAVA MENAMPILKAN DERET BILANGAN PRIMA");

        System.out.println("----------------------------------------------");
        for (int i=awal; i<=akhir; i++){

         bil=0;
                              for (int j=1;j<=i;j++){
                                if (i%j==0){//PENGECEKAN BAHWA BILANGAN PRIMA ITU HABIS TIDAK MEMILIKI SISA PEMBAGIAN
                                   bil=bil+1;
                                             }
                              }

        if (bil==2){
        System.out.print(i+" ");
        }
        }
















    }
}
