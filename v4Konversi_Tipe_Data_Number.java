package ProgremerZamanNow.Java;

class v4Konversi_Tipe_Data_Number {
    public static void main(String[] args) {
        System.out.println("FOLOW IG @DIKA0910");

    /*
            @@@ Konversi Tipe Data Number @@@

       1.Widening Casting ( Otomatis ) : byte -> short -> int -> float -> double
       2.Narrowing Casting ( Manual ) : double -> float -> long -> int -> short -> byte
    */
      //         jika ke 2 dia dari besar ke kecil tidak bisa di otomatiskan

  /*
  jika ke 1 dia dari kecil ke besar bisa di otomatiskan karena bisa menampung banyak nya tipe data
  CONTOH SYNTAK/PRINTAH
  */Byte       inibyte      =        10;
     short      inishot     =   inibyte;
     int        iniint      =   inibyte;
     long       inilong     =   iniint;
     float      inifloat    =   inilong;
     double     inidouble   =   inifloat;

  /*
  jika ke 1 dia dari kecil ke besar bisa di otomatiskan karena bisa menampung banyak nya tipe data
  CONTOH SYNTAK/PRINTAH
  */
    float inifloat2 = (float) inidouble;// inidouble mngambil data dari baris ke 23
    long inilong2   = (long) inifloat2;
    int iniint2     = (int) inilong2;
    short inishort2 = (short) iniint2;

/*
note : HATI HATI JIKA INGIN CONVERSI TIPE DATA
Contoh kasus
 */
// pada code di bawh akan menghasilkan overflow number dia akan berputar putar kek orang gaje
int test = 1000;
byte test1 = (byte)  test;

        System.out.println(test1);//hasil nya -27 karena dia berputar


    }
}
