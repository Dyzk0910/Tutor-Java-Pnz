package ProgremerZamanNow.Java;

public class V15Operasi_Boolean {
    public static void main(String[] args) {
/*          Note : serch Google GERBANG LOGIKA
Operasi ini dipakai untuk tipe data boolean ( true atau false )

&&          DAN
||          ATAU
!           KEBALIKAN

 */

        var absen = 70 ;
        var NilaiAkhir = 80;

        var LulusAbsen = absen >= 75;
        var LulusNilai = NilaiAkhir >= 75;

        var lulus = LulusAbsen && LulusNilai;
        System.out.println(lulus);// tidak lulus karena nilai absen nya 70


    }
}
