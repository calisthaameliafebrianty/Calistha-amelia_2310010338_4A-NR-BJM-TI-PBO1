# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Buku`, `Perpustakaan`, dan `MainPerpustakaan` adalah contoh dari class.

```bash
public class Buku {
    ...
}

public class Perpustakaan extends Perpustakaan {
    ...
}

public class MainPerpustakaan{
    ...
}
```
2. **Object** adalah instance dari class. Pada kode ini,  `Perpustakaan Perpustakaan = new Perpustakaan ();` dan `Buku buku = new Buku ();`

```bash
Perpustakaan Perpustakaan = new Perpustkaan ();
Buku buku = new Buku ();
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `Buku = (judul, penulis, tahun)` `Perpustakaan = (daftarbuku, jumlahbuku)' 'BukuDigital = (format)`

```bash
class Buku{
String judul;
String penulis;
int tahun;

class BukuDigital {
    String format;
  }
}
class Perpustakaan {
    Buku[] daftarbuku;
    int jumlahbuku;
}
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Buku`

```bash
class Buku {
    private String judul;
    private String penulis;
    private int tahun;

    public Buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setjudul` dan `getjudul` adalah contoh method mutator.

```bash
public void setJudul(String judul) {
    this.judul = judul;
}

public void getjudul(String penulis) {
    return.judul = judul;
}

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `setJudul`, `setPenulis`,`setTahun`,`Tampilkaninfo` adalah contoh method accessor.
`
```bash
 public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun: " + tahun);
    }

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `judul`, `penulis` dan `tahun `dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String judul;
private String penulis;
private String tahun;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `BukuDigital` mewarisi `Buku` dengan sintaks `extends`.

```bash
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
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tambahbuku(void)` di `Buku` 

```bash
public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku++] = buku;
            System.out.println("Buku berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas penuh.");
        }
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `BukuDigital` dan seleksi `switch` dalam method `judulbuku`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < jumlahBuku; i++) {
                System.out.print("Buku ke-" + (i + 1) + ": ");
                daftarBuku[i].tampilkanInfo();
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
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
                input.nextLine(); 
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. 
```
private Buku[] daftarBuku = new Buku[100];
    private int jumlahBuku = 0;
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
 catch (java.util.InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka untuk pilihan.");
                input.nextLine(); // Consume the invalid input
            }
        }
        input.close();
    }
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Calistha Amelia Febrianty
NPM: 210010338
