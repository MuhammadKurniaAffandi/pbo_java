package pertemuan3;

public class Konstanta2 {
    public static void main(String[] args) {
        // deklarsi variabel
        final String NAMA = "Fandi";
        // inisialisasi variabel
        // NAMA = "Kurnia"; <== NAMA sudah final dan tidak boleh di isi nilai lain

        // deklarasi + inisialisasi
        String nama2 = "Kurnia"; // <== cara 1
        // String nama2 = new String("Kurnia"); <== cara 2

        // mencetak isi variabel
        System.out.println("Nama : " + NAMA);
        System.out.println("Nama2 : "+nama2);
        nama2 = "Fandi";
        System.out.println("Nama2 : "+nama2);
    }
}
