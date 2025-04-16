
public class BarangLangka extends BarangAntik {
    private String asal;

    public BarangLangka(String id, String nama, int tahun, double harga, String asal) {
        super(id, nama, tahun, harga);
        this.asal = asal;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("  Asal Barang: " + asal);
    }
}
