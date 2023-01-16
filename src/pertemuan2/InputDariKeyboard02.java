package pertemuan2;

import javax.swing.*;

public class InputDariKeyboard02 {
    public static void main(String[] args) {
        String NIM = "", nama = "";

        try{
            NIM = JOptionPane.showInputDialog("NIM\t\t\t: ");
            nama = JOptionPane.showInputDialog("Nama\t\t: ");
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
