package ProgremerZamanNow.Java;
/*
Method Parameter

Kita bisa mengirim informasi ke method yang ingin kita panggil
Untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument di method yang sudah kita buat
Cara membuat parameter sama seperti cara membuat variabel
Parameter ditempatkan di dalam kurung () di deklarasi method
Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisah menggunakan tanda koma

 */
public class v25Method_Parameter {
    public static void main(String[] args) {

        sayHellow("andika","hadi");

    }
static void sayHellow(String namadepan , String akhirnama){

    System.out.println(namadepan+" "+akhirnama);
}
}
