package pertemuan4;

public class PilihPakeNestedIf_3 {
    public static void main(String[] args) {
        int uang = 20000;
        int barang = 17000;

        if (uang > barang) {
            if (uang > barang * 2)
                System.out.println("Anda bisa membeli 2 kali barang");
            else
                System.out.println("Anda bisa membeli 1 kali barang");
        }
        System.out.println("Muhammad Kurnia Affandi");
    }
}
