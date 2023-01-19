package pertemuan3;

public class OperatorPerbandingan2 {
    public static void main(String[] args) {
        String NIM = "91115000060";
        String nama = "Fandi";
        byte nilaiAkhir = 86;

        System.out.println("NIM\t\t\t:"+NIM);
        System.out.println("Nama\t\t:"+nama);
        System.out.println("Nilai Akhir\t:"+nilaiAkhir);
        System.out.println("======================");
        if (nilaiAkhir >= 85){
            System.out.println("Predikat\t: Sangat Memuaskan");
        } else{
            System.out.println("Predikat\t: Tidak Memuaskan");
        }
    }
}
