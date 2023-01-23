package pertemuan5;

public class PerulanganContinue {
    public static void main(String[] args) {
        int S;
        System.out.println("Cek Bilangan Ganjil: ");
        for (S = 1; S <= 10; S++) {
            if (S % 2 == 0) {
                continue;
            }
            System.out.println(S);
        }
    }
}
