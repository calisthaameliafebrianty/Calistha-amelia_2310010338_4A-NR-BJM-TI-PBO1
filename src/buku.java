import java.util.Scanner;

class Buku { // Superclass
    private String judul;
    private String penulis;
    private int tahun;

    public Buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }

    // Accessor & Mutator
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun: " + tahun);
    }
}