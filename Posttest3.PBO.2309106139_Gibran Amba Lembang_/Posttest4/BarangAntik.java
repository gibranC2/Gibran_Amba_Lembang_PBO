
public class BarangAntik {
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
