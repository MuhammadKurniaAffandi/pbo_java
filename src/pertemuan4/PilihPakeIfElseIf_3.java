package pertemuan4;

public class PilihPakeIfElseIf_3 {
    public static void main(String[] args) {
        int Nilai = 60;
        char Grade;

        if (Nilai >= 85 && Nilai <= 100) {
            Grade = 'A';
            System.out.println("Nilai : " + Nilai);
        } else if (Nilai >= 75 && Nilai < 85) {
            Grade = 'B';
            System.out.println("Nilai : " + Nilai);
        } else if (Nilai >= 60 && Nilai < 75) {
            Grade = 'C';
            System.out.println("Nilai : " + Nilai);
        } else if (Nilai >= 35 && Nilai < 60) {

            Grade = 'D';
            System.out.println("Nilai : " + Nilai);
        } else {
            Grade = 'E';
            System.out.println("Nilai : " + Nilai);
        }

        System.out.println("Grade Anda : " + Grade);
    }
}
