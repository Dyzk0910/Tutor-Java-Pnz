package ProgremerZamanNow.Java;

public class v11Tipe_Data_Primitif {
    public static void main(String[] args) {
/*
Tipe Data Bukan Primitif

Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi
Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value
Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null
Tipe data bukan primitif bisa memiliki method/function (yang akan dibahas nanti)
Di Java, semua tipe data primitif memiliki representasi tipe data bukan primitif nya
 */

// TIPE DATA PRIMITIF   (( default nya value nya [0] ))
        // byte | short | int | long | float | duble || char     | boolean

        float floatPrimitif     = 0;
        byte bytePrimitif       = 10;
        int intPrimitif         = 100;

// TIPE DATA NON PRIMITIF (( default nya value nya [null] ))
        // Byte | Short | Integer | Long | Float | Double || Character | Boolean

        Short iniShort                  = null ; // note ini null
        iniShort                        = 100;
        Integer IntegerNonPrimitif      = 10;
        Long  LongNonPrimitif           = 10L;
        Boolean BoleanNonPerimitif      = true;

//NOTE : PERBEDAAN PENILISAN PADA HURUF KAPITAL dan huruf contoh Byte dan byte | int dan Integer





// KONVERSI PRIMITIF => BUKAN PRITIF

   // DARI int KE Integer
        int     Primitifint             = 190;                            // Tipe data primitif
        Integer NonPrimitifInteger      = Primitifint;                    // Primitif => NonPrimitif

  // DARI Intger KE tipe data lain tapi NonPrimitif
        Integer intPrimitifsatu         = 100;                              // Tipe data primitif
        short   Primitifshort           = intPrimitifsatu.shortValue();     // Primitif => NonPrimitif
        byte    primitifbyte            = intPrimitifsatu.byteValue();


// KONVERSI PRIMITIF => BUKAN PRITIF










    }
}
