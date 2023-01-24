package pertemuan6;

public class TestException_3 {
    public static void main(String[] args) {
        try {
            int a = 1 / 0; // berpotensi menimbulkan kesalahan yaitu pembagian dengan bilangan 0
            System.out.println("perintah selanjutnya");
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
    }
}
