package pertemuan2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputDariKeyboard1 {
    public static void main(String[] args) {
        String NIM = "", nama = "";
        byte nilAbsen = 0, nilTugas = 0, nilUTS = 0, nilUAS = 0;
        BufferedReader objInput = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("==========================================");
            System.out.println("\t\tInput Data Mahasiswa");
            System.out.println("==========================================");
            System.out.println("NIM\t\t"); NIM = objInput.readLine();
            System.out.println("Nama\t\t"); nama = objInput.readLine();
            System.out.println("Nilai Absen\t"); nilAbsen = Byte.parseByte(objInput.readLine());
            System.out.println("Nilai Tugas\t"); nilTugas = Byte.parseByte(objInput.readLine());
            System.out.println("Nilai UTS\t"); nilUTS = Byte.parseByte(objInput.readLine());
            System.out.println("Nilai UAS\t"); nilUAS = Byte.parseByte(objInput.readLine());
            System.out.println("==========================================");


        } catch(Exception e) {
            System.out.println("Error : " + e);
        }

        System.out.println("==========================================");
        System.out.println("\t\tCetak Data Mahasiswa");
        System.out.println("==========================================");
        System.out.println("NIM\t\t:" + NIM);
        System.out.println("Nama\t\t:" + nama);
        System.out.println("Nilai Absen\t:" + nilAbsen);
        System.out.println("Nilai Tugas\t:" + nilTugas);
        System.out.println("Nilai UTS\t:" + nilUTS);
        System.out.println("Nilai UAS\t:" + nilUAS);
        System.out.println("==========================================");

    }

}
