import java.util.ArrayList;
import java.util.Scanner;

public class SistemManajemenBarangAntik {
    private static final ArrayList<BarangAntik> daftarBarang = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Sistem Manajemen Penjualan Toko Barang Antik [Posttest 3] ===");
            System.out.println("1. Tambah Barang Elektronik");
            System.out.println("2. Tambah Barang Keramik");
            System.out.println("3. Lihat Semua Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahBarangElektronik();
                    break;
                case 2:
                    tambahBarangKeramik();
                    break;
                case 3:
                    lihatBarang();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi!");
            }
        }
    }

    private static void tambahBarangElektronik() {
        System.out.print("Masukkan ID Barang: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Tahun Produksi: ");
        int tahun = scanner.nextInt();
        System.out.print("Masukkan Harga Barang: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Masukkan Merek: ");
        String merek = scanner.nextLine();

        daftarBarang.add(new BarangElektronikAntik(id, nama, tahun, harga, merek));
        System.out.println("Barang elektronik berhasil ditambahkan!");
    }

    private static void tambahBarangKeramik() {
        System.out.print("Masukkan ID Barang: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Tahun Produksi: ");
        int tahun = scanner.nextInt();
        System.out.print("Masukkan Harga Barang: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Masukkan Asal Daerah: ");
        String asal = scanner.nextLine();

        daftarBarang.add(new BarangKeramikAntik(id, nama, tahun, harga, asal));
        System.out.println("Barang keramik berhasil ditambahkan!");
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
}
