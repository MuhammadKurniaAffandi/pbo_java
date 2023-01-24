package pertemuan6;

public class KeywordThrow {
    public static void main(String[] args) {
        try {
            throw new B(); // cobalah ganti bari ini dengan A new B()
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}

class B extends Exception {
    B() {
    }

    public String toString() {
        return "Object dengan tipe kelas B";
    }
}

/*
 * Program diatas telah mendefinisikan suatu kelas B mengextends dari kelas
 * Exception. Ketika kita melakukan throw new B(); maka object dari kelas
 * bertipe B ini
 * akan dianggap kesalahan dan ditangkap oleh block catch. Sekarang jika anda
 * menghilangkan keyword throw apa yang terjadi?.
 */