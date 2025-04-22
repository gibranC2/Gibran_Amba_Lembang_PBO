import java.util.ArrayList;
import java.util.Scanner;

public class SistemManajemenBarangAntik {
    private static final ArrayList<BarangAntik> daftarBarang = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Sistem Manajemen Penjualan Toko Barang Antik ===");
            System.out.println("1. Tambah Barang Biasa");
            System.out.println("2. Tambah Barang Langka");
            System.out.println("3. Lihat Barang");
            System.out.println("4. Edit Barang");
            System.out.println("5. Hapus Barang");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahBarang();
                case 2 -> tambahBarang(true);
                case 3 -> lihatBarang();
                case 4 -> editBarang();
                case 5 -> hapusBarang();
                case 6 -> {
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid, coba lagi!");
            }
        }
    }

    private static void tambahBarang() {
        System.out.print("Masukkan ID Barang: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Tahun Produksi: ");
        int tahun = scanner.nextInt();
        System.out.print("Masukkan Harga Barang: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        daftarBarang.add(new BarangAntik(id, nama, tahun, harga) {
            @Override
            public void infoBarang() {
                System.out.println("Barang biasa tanpa asal khusus.");
            }
        });
        System.out.println("Barang biasa berhasil ditambahkan!");
    }

    private static void tambahBarang(boolean isLangka) {
        System.out.print("Masukkan ID Barang: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Tahun Produksi: ");
        int tahun = scanner.nextInt();
        System.out.print("Masukkan Harga Barang: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Masukkan Asal Barang: ");
        String asal = scanner.nextLine();

        daftarBarang.add(new BarangLangka(id, nama, tahun, harga, asal));
        System.out.println("Barang langka berhasil ditambahkan!");
    }

    private static void lihatBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Tidak ada barang dalam daftar.");
            return;
        }
        System.out.printf("%-10s %-20s %-10s %-10s\n", "ID", "Nama", "Tahun", "Harga");
        System.out.println("----------------------------------------------------");
        for (BarangAntik barang : daftarBarang) {
            barang.display();
            barang.infoBarang();
        }
    }

    private static void editBarang() {
        System.out.print("Masukkan ID Barang yang ingin diedit: ");
        String id = scanner.nextLine();
        for (BarangAntik barang : daftarBarang) {
            if (barang.getId().equals(id)) {
                System.out.print("Masukkan Nama Baru: ");
                barang.setNama(scanner.nextLine());
                System.out.print("Masukkan Tahun Baru: ");
                barang.setTahun(scanner.nextInt());
                System.out.print("Masukkan Harga Baru: ");
                barang.setHarga(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Barang berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Barang dengan ID tersebut tidak ditemukan.");
    }

    private static void hapusBarang() {
        System.out.print("Masukkan ID Barang yang ingin dihapus: ");
        String id = scanner.nextLine();
        for (BarangAntik barang : daftarBarang) {
            if (barang.getId().equals(id)) {
                daftarBarang.remove(barang);
                System.out.println("Barang berhasil dihapus!");
                return;
            }
        }
        System.out.println("Barang dengan ID tersebut tidak ditemukan.");
    }
}