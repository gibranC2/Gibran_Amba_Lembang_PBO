public class BarangElektronikAntik extends BarangAntik {
    private String merek;

    public BarangElektronikAntik(String id, String nama, int tahun, double harga, String merek) {
        super(id, nama, tahun, harga);
        this.merek = merek;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("   -> Jenis Elektronik | Merek: " + merek);
    }
}
