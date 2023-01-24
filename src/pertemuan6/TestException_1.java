package pertemuan6;

// implementasi subclass ArithmeticException dengan solusi try-catch
public class TestException_1 {
    public static void main(String[] args) {
        try {
            int bil = 10;
            System.out.println(bil / 0);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
