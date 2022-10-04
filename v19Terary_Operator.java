package ProgremerZamanNow.Java;

public class v19Terary_Operator {
    public static void main(String[] args) {
        /*
 Ternary Operator

Ternary operator adalah operator sederhana dari if statement
Ternary operator terdiri dari  kondisi yang dievaluasi, jika menghasilkan true maka nilai pertama diambil,
jika false, maka nilai kedua diambil
         */

        // PERINTAH TANPA TERNARY OPERATOR
        var nilai = 75;
        String ucapan;
        if(nilai>=75){
            ucapan="Selamat Anda Lulus";
        }else{
            ucapan="Silahkan Coba Lagi";
        }
        System.out.println(ucapan);


        System.out.println("************** PEMBATAS  **************");
        // PERINTAH TERNARY OPERATOR

        var nilaiA = 75;                       //true               //else
        String ucapanA =  nilaiA>=75  ?  "Selamat Anda Lulus":"Silahkan Coba Lagi";//lbih singkat
        System.out.println(ucapanA);

// Note : di beri tanda tanya dan di kasih kondisi nya jika true yang kiri jika false/else yang kanan dengan
// pembatas titik 2

    }
}
