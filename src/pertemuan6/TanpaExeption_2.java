package pertemuan6;

/* implementasi ArithmeticException */
public class TanpaExeption_2 {
    public static void main(String[] args) {
        int bil = 10;
        System.out.println(bil / 0);
    }
}

/*
 * Program di atas akan memunculkan output error sebagai berikut:
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at pertemuan6.TanpaExeption_2.main(TanpaExeption_2.java:6)
 * 
 * Di sana muncul adanya kesalahan aritmetika,
 * pesan kesalahan tersebut tampil karena adanya proses perhitungan yang salah.
 * karena di java secara otomatis akan menangkap exception ketika ada kode
 * program yang salah.
 */