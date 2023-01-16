package pertemuan2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputDariKeyboard01 {
    public static void main(String[] args) {
        String NIM = "", nama = "";
        BufferedReader objInput = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("==========================================");
            System.out.println("\t\tInput Data Mahasiswa");
            System.out.println("==========================================");
            System.out.println("NIM\t\t: "); NIM = objInput.readLine();
            System.out.println("Nama\t\t: "); nama = objInput.readLine();
            System.out.println("==========================================");
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

        System.out.println("==========================================");
        System.out.println("\t\tCetak Data Mahasiswa");
        System.out.println("==========================================");
        System.out.println("NIM\t\t\t: " + NIM);
        System.out.println("Nama\t\t: " + nama);
    }
}
