package pertemuan4;

public class PilihSwitchCase {
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

        // kondisi switch PilihSwitchCase
        switch (Grade) {
            case 'A':
                System.out.println("Predikat Memuaskan");
                break;
            case 'B':
                System.out.println("Predikat Baik");
                break;
            case 'C':
                System.out.println("Predikat Cukup Baik");
                break;
            case 'D':
                System.out.println("Predikat Kurang");
                break;
            case 'E':
                System.out.println("Predikat Sangat Kurang");
                break;

            default:
                System.out.println("Predikat Salah");
                break;
        }
    }

}
