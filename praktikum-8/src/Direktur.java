public class Direktur extends Manager {
    private double tunjanganDirektur;

    public Direktur(String nama, String nip, double gajiPokok,
                    double tunjanganJabatan, double tunjanganDirektur) {

        super(nama, nip, gajiPokok, tunjanganJabatan);
        this.tunjanganDirektur = tunjanganDirektur;
    }

    public double getTunjanganDirektur() {
        return tunjanganDirektur;
    }
}