package pertemuan6;

public class KeywordCatch_1 {
    public static void main(String[] args) {
        try {
            int a = 1 / 0; // berpotensi menimbulkan kesalahan yaitu pembagian dengan bilangan 0
            System.out.println("perintah selanjutnya");
        } catch (NullPointerException e) {
            // TODO: handle exception
        }

        catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
        }

        catch (Exception e) {
            // TODO: handle exception
        }
    }
}
