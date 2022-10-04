package ProgremerZamanNow.Java;

class v3Tipe_Data_Number {
    public static void main(String[] args) {
        System.out.println("FOLOW IG @DIKA0910");
    /*
               @@@ TIPE DATA NUMBER JAVA  @@@

     1.Integer number (bilangan bulat)

                Byte   -128                             127                          1 byte      0
                short  -32,768                          32.767                       2 byte
                int    -2.147.483.648                   2.147.483.647                4 byte
                long   -9.223.372.036.854.775.808       9.223.372.036.854.775.807    8 byte

                note : GUNAKAN TIPE DATA SEBUTUH NYA SAJA JANGAN BUANG MEMORI
    */
    // CONTOH PEMBUATAN NYA
        Byte inibyte        = 100;
        short inishohort    = 10000;
        int iniinteger      = 1_000_000_000; // untuk mempermudah melihat anggka tambhkan "_"
        long inilong        = 1_000_000_000_000L;
    /*


     2.FLoting Point NUmber (pecahan desimal)

                Float   3.4e-038            3.4e+038        4 byte
                double  1.7e-308            1.7e+308        8 byte

     */
    //CONTOH PEMBUATAN NYA
        float inifloat = 35.458F; // GUNAKAN TITIK KARENA INTERNASIONAL MENGUNAKAN TITIK BUKAN KOMA DAN AKHIRI F
        double inidouble = 15.78;


    /*
    KODE LITERALS
    Contoh decimal,hexadesimal,binary
    */
    //CONTOH PEMBUATAN NYA
        int decimalint = 25;
        int hexint     =0xA132B;    // awali dengan "0x"
        int binint     =0b01010101; // awali dengan "0b"



    }
}
