package ProgremerZamanNow.Java;

public class v20For_Loop {
    public static void main(String[] args) {
        /*
        For Loop

For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
Blok kode yang terdapat di dalam for akan selalu diulangi selama kondisi for terpenuhi



 //note : jika true maka akan berulang ulang


 Sintak Perulangan For

for(init statement; kondisi; post statement){
   // block perulangan
}

NOTE :

Init statement akan dieksekusi hanya sekali di awal sebelum perulangan
Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika false perulangan akan berhenti
Post statement akan dieksekusi setiap kali diakhir perulangan
Init statement, Kondisi dan Post Statement tidak wajib diisi, jika Kondisi tidak diisi, berarti kondisi selalu bernilai true

  */
        // jika berulang terus maka akan boros memory atau flow looping
//        for(;;){
//            System.out.println("Perulangan Tanpa Henti");
//        }


        // Kode : Perulangan hanya kondisi saja

        var counter = 1;
        for( ; counter<=10 ; ){
            System.out.println("Perulangan Ke-" + counter); // ini menampilkan ke cli
            counter ++;//conter akan bertambah 1 jika sudah sampai 10 maka akan berhenti kondisi nya akan false

        }
        System.out.println("** PEMBATAS **");


        // Kode : Perulangan Dengan Init Statement
        for (var a = 3; a <=10 ;){
            System.out.println("Perulanagan ke - "+ a );
            a++;
        }

        System.out.println("** PEMBATAS **");

        // Kode : Perulangan Dengan Post Statement LEBIH SINGKAT
         for (var b = 7 ; b <= 10 ; b++){
            System.out.println("Peruangan ke - "+ b);
            }


    }
}
