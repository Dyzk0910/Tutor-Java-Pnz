package ProgremerZamanNow.Java;

public class v9Kata_kunci_var {
    public static void main(String[] args) {
        /*
        Kata Kunci var

Sejak versi Java 10, Java mendukung pembuatan variabel dengan kata kunci var,
sehingga kita tidak perlu menyebutkan tipe datanya
Namun perlu [[diingat]], saat kita menggunakan kata kunci var untuk membuat variable,
kita harus menginisiasi value / nilai dari variable tersebut secara langsung

note : kata kunci var ini dapat mempersingkat pemberian variable


         */
//CONTOH PERINTAH
//var name; ini akan error karena var bingung ini variable tipe apa jadi cara pemberian nama var itu dengan cara
// langsung memberikan nama variable nya
  var nama = "andika hadi saputro";
  var umur = 18;
  var alamat = "indonesia";

        System.out.println("nama : "+nama+" umur : "+ umur+" alamat : "+alamat );

// note : jadi tipe data var itu lebih simpel cepat , karena nnti ada tipe data yang panjang dan akan rumit penulisan nya



    }
}
