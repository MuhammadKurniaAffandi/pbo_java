package pertemuan6;

public class KeywordFinally {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Ada kesalahan yang muncul");
        } finally {
            System.out.println("terima kasih telah menjalankan program");
        }
    }
}
