public class Persegi extends BangunDatar {
    private double sisi;

    // Constructor diubah agar memanggil super(namaBangun) poin (b)
    public Persegi(String namaBangun, double sisi) {
        super(namaBangun);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    // Tambahan method keliling
    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}