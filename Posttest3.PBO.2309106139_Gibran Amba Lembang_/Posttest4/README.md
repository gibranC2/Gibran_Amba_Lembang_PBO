# Sistem Manajemen Penjualan Toko Barang Antik

Program berbasis Java untuk mengelola data barang antik dalam sebuah toko.

## Fitur
- Tambah Barang Biasa
- Tambah Barang Langka (dengan asal barang)
- Lihat daftar barang
- Edit data barang
- Hapus data barang

## Konsep OOP yang Diterapkan
- **Encapsulation**: Menggunakan private fields dan getter/setter
- **Polymorphism**
  - *Overloading*: Method `tambahBarang()` dibuat dalam dua versi
  - *Overriding*: Method `display()` di-*override* pada class `BarangLangka`

## Cara Menjalankan
1. Pastikan Java sudah terinstall.
2. Compile semua file `.java`:
   ```bash
   javac *.java
   ```
3. Jalankan program utama:
   ```bash
   java SistemManajemenBarangAntik
   ```

## Struktur Folder
```
Posttest4/
├── BarangAntik.java
├── BarangLangka.java
├── SistemManajemenBarangAntik.java
├── README.md
└── flowchart.png
```

## Author
Gibran Amba Lembang - Informatika C 2023 - Universitas Mulawarman
