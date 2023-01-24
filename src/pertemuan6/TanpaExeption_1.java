package pertemuan6;

/* implementasi ArithmeticException */
public class TanpaExeption_1 {
    public static void main(String[] args) {
        int nilai = Integer.parseInt(args[0]);
        // statement di atas membutuhkan exception-handling
        System.out.println("Nilai yang dimasukan : " + nilai);
    }
}

/*
 * Program di atas akan memunculkan output error sebagai berikut:
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0
 * out of bounds for length 0 at
 * pertemuan6.TanpaExeption_1.main(TanpaExeption_1.java:6)
 * 
 * Di sana muncul adanya kesalahan aritmetika,
 * pesan kesalahan tersebut tampil karena adanya proses perhitungan yang salah.
 * karena di java secara otomatis akan menangkap exception ketika ada kode
 * program yang salah.
 */