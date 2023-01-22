package pertemuan4;

public class PilihPakeNestedIf_4 {
    public static void main(String[] args) {
        int Nilai = 60;
        char Grade;

        if (Nilai >= 35) {
            if (Nilai >= 60) {
                if (Nilai >= 75) {
                    if (Nilai >= 85) {
                        Grade = 'A';
                    } else {
                        Grade = 'B';
                    }
                } else {
                    Grade = 'C';
                }
            } else {
                Grade = 'D';
            }
        } else {
            Grade = 'E';
        }

        System.out.println("Nilai = " + Nilai);
        System.out.println("Grade = " + Grade);
    }
}
