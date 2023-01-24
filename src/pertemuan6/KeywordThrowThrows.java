package pertemuan6;

public class KeywordThrowThrows {
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    public static void f() throws NullPointerException, ArrayIndexOutOfBoundsException {
        // implementasi method
        // throw new NullPointerException();
        throw new ArrayIndexOutOfBoundsException();
    }
}
