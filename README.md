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

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
public class Buku {
    protected String judul;
    protected String Penulis;

    public Buku(String judul, String penulis) {
    this.judul = judul;
    this.penulisa = penulis;
  }
}
public class BukuDigital extends Buku {
    private String formatFile;

    public BukuDigital(String judul, String penulis, String formatFile) {
    super(judul, penulis);
    this.formatFile = formatFile;
  }
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setjudul` dan `setpenulis` dan `setFormatFile` adalah contoh method mutator.

```bash
public void setJudul(String judul) {
    this.judul = judul;
}

public void setPenulis(String penulis) {
    this.penulis = penulis;
}

public void setFormatFile(String formatFile){
    this.formatFile = formatFile;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `setJudul`, `setPenulis`,`getJudul`,`getPenulis` adalah contoh method accessor.
`
```bash
public void setJudul(String Judul) {
    this.judul = judul;
}
public void setPenulis(String penulis) {
    this.penulis = penulis ;
}
public String getJudul() {
    return judul;
}
public String getPenulis() {
    return Penulis;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `judul` dan `penulis` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String judul;
private String penulis;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class BukuDigital extends buku{
    private String linkdownload;

    public String getLinkDownload() {
        return linkDownload;
    }

    public void setLinkDownload(String linkDownload) {
        this.linkDownload = linkDownload;
    }

    // Overriding method dari class Buku
    @Override
    public void tampilkanInfo() {
        System.out.println("Judul: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Link Download: " + linkDownload);
  }
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo(String)` di `Buku` merupakan overloading method `BukuDigital` dan `tampilkanInfo` di `BukuDigital` merupakan override dari method `BukuDigital`.

```bash
public String tampilkanInfo() {
    return "Judul: " + judul + "\nPenulis: " + penulis;
}


@Override
public String tampilkanInfo() {
    return super.tampilkanInfo() + "\nFormat: PDF";
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKatagoriBuku` dan seleksi `switch` dalam method `getJudulBuku`.

```bash
public String getKategoriBuku(int tahunTerbit) {
    if (tahunTerbit >= 2020) {
        return "Buku Baru";
    } else {
        return "Buku Lama";
    }
}

public void menuPilihan(int pilihan) {
    switch (pilihan) {
        case 1:
            System.out.println("Menampilkan daftar buku");
            break;
        case 2:
            System.out.println("Menambahkan buku baru");
            break;
        case 3:
            System.out.println("Keluar dari program");
            break;
        default:
            System.out.println("Pilihan tidak valid");
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < daftarBuku.length; i++) {
    System.out.println("Judul Buku ke-" + (i + 1) + ": " + daftarBuku[i].getJudul());
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);

System.out.print("Masukkan Judul Buku: ");
String judul = scanner.nextLine();

System.out.print("Masukkan Nama Penulis: ");
String penulis = scanner.nextLine();

Buku buku = new Buku(judul, penulis);
System.out.println("\nData Buku:");
buku.tampilkanInfo();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. 
Buku[] daftarBuku = new Buku[5];
daftarBuku[0] = new Buku("Judul", "Penulis");
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
int jumlah = scanner.nextInt();
} catch (InputMismatchException e) {
System.out.println("Input tidak valid!");
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
