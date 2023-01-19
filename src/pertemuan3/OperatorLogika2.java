package pertemuan3;

public class OperatorLogika2 {
    public static void main(String[] args) {
        String NIM = "91115000060";
        String nama = "Fandi";
        byte nilaiAkhir = 86;

        System.out.println("NIM\t\t\t:"+NIM);
        System.out.println("Nama\t\t:"+nama);
        System.out.println("Nilai Akhir\t:"+nilaiAkhir);
        System.out.println("======================");
        if (nilaiAkhir >= 85 && nilaiAkhir <= 100){
            System.out.println("Grade\t: A");
        }
    }
}
