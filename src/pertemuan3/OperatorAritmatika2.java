package pertemuan3;

public class OperatorAritmatika2 {
    public static void main(String[] args) {
        String NIM = "91115000060";
        String nama = "Fandi";
        final int HARGASKS = 60000;
        byte totalSKS = 21;

        System.out.println("NIM\t\t\t:"+NIM);
        System.out.println("Nama\t\t:"+nama);
        System.out.println("Harga SKS\t:"+HARGASKS);
        System.out.println("Total SKS\t:"+totalSKS);
        System.out.println("======================");
        int hargaTotal = HARGASKS * totalSKS;
        System.out.println("Total Bayar\t:" +hargaTotal);
        System.out.println("======================");
    }
}
