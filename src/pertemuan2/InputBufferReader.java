package pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferReader {
    public static void main(String[] args) throws IOException {

        String nama;

        /* Membuat objek inputstream*/
        InputStreamReader isr = new InputStreamReader(System.in);

        /* Membuat objek bufferreader */
        BufferedReader br = new BufferedReader(isr);

        /* Mengisi variabel nama dengan bufferreader */
        System.out.print("Inputkan Nama: ");
        nama = br.readLine();

        /* Tampilkan output isi variabel nama */
        System.out.println("Nama kamu adalah " + nama);
    }
}
