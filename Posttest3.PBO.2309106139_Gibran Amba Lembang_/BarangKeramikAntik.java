public class BarangKeramikAntik extends BarangAntik {
    private String asalDaerah;

    public BarangKeramikAntik(String id, String nama, int tahun, double harga, String asalDaerah) {
        super(id, nama, tahun, harga);
        this.asalDaerah = asalDaerah;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("   -> Jenis Keramik | Asal: " + asalDaerah);
    }
}
