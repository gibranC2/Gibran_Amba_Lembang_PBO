import java.util.ArrayList;
import java.util.Scanner;

class BarangAntik {
    private String id;
    private String nama;
    private int tahun;
    private double harga;

    public BarangAntik(String id, String nama, int tahun, double harga) {
        this.id = id;
        this.nama = nama;
        this.tahun = tahun;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void display() {
        System.out.printf("%-10s %-20s %-10d Rp%.2f\n", id, nama, tahun, harga);
    }
}

public class SistemManajemenBarangAntik {
    private static final ArrayList<BarangAntik> daftarBarang = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Sistem Manajemen Penjualan Toko Barang Antik ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat Barang");
            System.out.println("3. Edit Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahBarang();
                    break;
                case 2:
                    lihatBarang();
                    break;
                case 3:
                    editBarang();
                    break;
                case 4:
                    hapusBarang();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi!");
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

        daftarBarang.add(new BarangAntik(id, nama, tahun, harga));
        System.out.println("Barang berhasil ditambahkan!");
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