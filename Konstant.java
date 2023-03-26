/* Siti Nurfadhilah
 * 13020210239
 * B1
 * Sabtu 25 maret 2023
 */
package konstant;
import java.util.Scanner;
    /* Membaca jari-jari, menghitung luas lingkaran */
    /* latihan pemakaian konstanta */
    public class Konstant {
    /**
    * @param args
    */
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    /* Kamus */
    final float PHI = 3.1415f;
    float r;
    Scanner masukan=new Scanner(System.in);
    /* program / / baca data */
    System.out.print ("Jari-jari lingkaran =");r = masukan.nextFloat();
    /* Hitung dan tulis hasil */
System.out.print ("Luas lingkaran = "+ (PHI * r * r
)+"\n");
System.out.print ("Akhir program \n");
}
}