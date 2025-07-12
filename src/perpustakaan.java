class Perpustakaan {
    private Buku[] daftarBuku = new Buku[100];
    private int jumlahBuku = 0;

    // Nested subclass BukuDigital extends Buku
    class BukuDigital extends Buku {
        private String format;

        public BukuDigital(String judul, String penulis, int tahun, String format) {
            super(judul, penulis, tahun);
            this.format = format;
        }

        @Override
        public void tampilkanInfo() {
            super.tampilkanInfo();
            System.out.println("Format: " + format);
        }
    }

    // Tambah Buku (polymorphism)
    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku++] = buku;
            System.out.println("Buku berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas penuh.");
        }
    }

    // Tampilkan semua buku
    public void tampilkanSemuaBuku() {
        if (jumlahBuku == 0) {
            System.out.println("Tidak ada buku di perpustakaan.");
        } else {
            for (int i = 0; i < jumlahBuku; i++) {
                System.out.print("Buku ke-" + (i + 1) + ": ");
                daftarBuku[i].tampilkanInfo();
            }
        }
    }
}