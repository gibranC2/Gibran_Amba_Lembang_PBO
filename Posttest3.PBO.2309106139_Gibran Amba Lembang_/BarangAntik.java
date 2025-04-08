public class BarangAntik {
    protected String id;
    protected String nama;
    protected int tahun;
    protected double harga;

    public BarangAntik(String id, String nama, int tahun, double harga) {
        this.id = id;
        this.nama = nama;
        this.tahun = tahun;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getTahun() {
        return tahun;
    }

    public double getHarga() {
        return harga;
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
