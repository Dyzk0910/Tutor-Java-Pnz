package ProgremerZamanNow.Java;

public class v23For_Ech {
    public static void main(String[] args) {
/*
For Each

Kadang kita biasa mengakses data array menggunakann perulangan
Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter, lalu mengakses array menggunakan counter yang kita buat
Namun untungnya, di Java terdapat perulangan for each, yang bisa digunakan untuk mengakses seluruh data di Array secara otomatis

 */


String [] contoh = {
        "Andika","Hadi","Saputro",
        "Dika0910","Dyzk0910"
};
// KODE TANPA FOR EACH
 for   (var i = 0 ; i < contoh.length;i++){
     System.out.println(contoh[i]);

 }
        System.out.println("******PEMBATAS*******");


// KODE DENGAN FOR EACH
  for (String NAMA : contoh){
      System.out.println(NAMA);
  }



    }
}
