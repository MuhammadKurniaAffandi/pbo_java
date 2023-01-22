package pertemuan4;

public class PilihPakeIfElse_2 {
    public static void main(String[] args) {
        int T = 4, R = 9;

        // kondisi if ... else ... dengan multi baris statement,
        // harus menggunakan simbol {}
        if (T > R || R > T) {
            System.out.println("T lebih besar dari R atau");
            System.out.println("R lebih besar dari T");
        } else {
            System.out.println("kondisi salah");
            System.out.println("inisialisasi kembali nilai T dan R");
        }
    }
}
