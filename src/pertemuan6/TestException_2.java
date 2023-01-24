package pertemuan6;

// implementasi subclass ArrayIndexOutOfBoundsException dengan solusi try-catch
public class TestException_2 {
    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Data Array args tidak ditemukan");

        }
    }
}
