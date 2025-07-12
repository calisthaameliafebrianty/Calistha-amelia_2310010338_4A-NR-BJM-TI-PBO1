import java.util.Scanner;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        boolean jalan = true;

        while (jalan) {
            try {
                System.out.println("\n--- MENU PERPUSTAKAAN ---");
                System.out.println("1. Tambah Buku");
                System.out.println("2. Tampilkan Semua Buku");
                System.out.println("3. Keluar");
                System.out.print("Pilih: ");
                int pilih = input.nextInt();
                input.nextLine(); // Consume newline

                switch (pilih) {
                    case 1:
                        System.out.print("Judul: ");
                        String judul = input.nextLine();
                        System.out.print("Penulis: ");
                        String penulis = input.nextLine();
                        System.out.print("Tahun: ");
                        int tahun = input.nextInt();
                        input.nextLine(); // Consume newline

                        System.out.print("Apakah buku digital (ya/tidak): ");
                        String digital = input.nextLine();

                        if (digital.equalsIgnoreCase("ya")) {
                            System.out.print("Format file (pdf/epub): ");
                            String format = input.nextLine();
                            // Create a BukuDigital object and add it
                            Perpustakaan.BukuDigital bd = perpustakaan.new BukuDigital(judul, penulis, tahun, format);
                            perpustakaan.tambahBuku(bd);
                        } else {
                            // Create a regular Buku object and add it
                            Buku b = new Buku(judul, penulis, tahun);
                            perpustakaan.tambahBuku(b);
                        }
                        break;
                    case 2:
                        perpustakaan.tampilkanSemuaBuku();
                        break;
                    case 3:
                        jalan = false;
                        System.out.println("Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka untuk pilihan.");
                input.nextLine(); // Consume the invalid input
            }
        }
        input.close();
    }
}