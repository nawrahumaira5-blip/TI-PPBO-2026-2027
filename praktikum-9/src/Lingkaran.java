public class Lingkaran extends BangunDatar {
    private double radius;

    // Constructor diubah agar memanggil super(namaBangun) poin (b)
    public Lingkaran(String namaBangun, double radius) {
        super(namaBangun);
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    // Tambahan method keliling
    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}