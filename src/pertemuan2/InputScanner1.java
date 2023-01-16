package pertemuan2;

import java.util.Scanner;

public class InputScanner1 {
    public static void main(String[] args) {
        /* Deklarasi variabel */
        String nama, alamat;
        int usia, gaji;

        /* Membuat Scanner baru */
        Scanner keyboard = new Scanner(System.in);

        /* Tampilkan output ke user */
        System.out.println("### Pendapatan Karyawan PT Petani Kode ###");
        System.out.print("Nama Karyawan: ");

        /* Menggunakan Scanner dan menyimpan apa yang diketik di variabel nama */
        nama =  keyboard.nextLine();

        /* Tampilkan output lagi untuk alamat*/
        System.out.print("Alamat: ");
        alamat = keyboard.nextLine();

        System.out.print("Usia: ");
        usia = keyboard.nextInt();

        System.out.print("Gaji: ");
        gaji = keyboard.nextInt();

        /* Menampilkan apa yang sudah disimpan di variabel */
        System.out.println("===================");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia);
        System.out.println("Gaji: Rp " + gaji);


    }
}
