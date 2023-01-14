package pertemuan1;

public class tulisanCetak2Baris_05 {
    public tulisanCetak2Baris_05(){}

    public void cetak(String a, String b){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        tulisanCetak2Baris_05 obj5 = new tulisanCetak2Baris_05();
        obj5.cetak("Selamat Datang di Perkuliahan PBO", "Di Universitas Budi Luhur");
    }
}
