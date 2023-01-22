package pertemuan4;

public class PilihPakeIfElseIf_2 {
    public static void main(String[] args) {
        int Nilai = 60;
        char Grade;

        if (Nilai <= 35)
            Grade = 'D';
        else if (Nilai <= 60)
            Grade = 'C';
        else if (Nilai <= 75)
            Grade = 'B';
        else if (Nilai <= 85)
            Grade = 'A';
        else
            Grade = 'E';

        System.out.println("Nilai : " + Nilai);
        System.out.println("Grade Anda : " + Grade);
    }
}
