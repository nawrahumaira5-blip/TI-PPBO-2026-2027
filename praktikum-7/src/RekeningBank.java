public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private double saldo;

    private String jenisRekening;


    public RekeningBank(String nomor, String pemilik, double saldoAwal, String jenisRekening) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
        this.jenisRekening = jenisRekening;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    public double getSaldo() {
        return saldo;
    }


    public String getJenisRekening() {
        return jenisRekening;
    }

    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo: " + saldo);
    }

    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo: " + saldo);
        }
    }

    public void transferKe(RekeningBank tujuan, double jumlah) {
        System.out.println("\n--- Proses Transfer ---");
        System.out.println("Dari: " + this.pemilik + " ke " + tujuan.pemilik);


        if (jumlah <= 0) {
            System.out.println("STATUS: GAGAL. Jumlah transfer harus lebih dari 0.");
        } else if (jumlah > this.saldo) {
            System.out.println("STATUS: GAGAL. Saldo tidak mencukupi.");
        } else {

            this.saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("STATUS: BERHASIL. Transfer sebesar Rp " + jumlah);
        }
    }


    public void cetakMutasi() {
        System.out.println("=====================================");
        System.out.println("          MUTASI REKENING            ");
        System.out.println("=====================================");
        System.out.println("No. Rekening   : " + nomorRekening);
        System.out.println("Pemilik        : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.printf("Saldo Saat Ini : Rp %,.2f\n", saldo);
        System.out.println("=====================================");
    }
}