public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    // Getter untuk semua atribut
    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Setter untuk semua atribut (dengan validasi harga)
    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Pesan Penolakan: Harga tidak boleh negatif.");
        }
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Pesan Penolakan: Stok awal tidak boleh negatif.");
        }
    }

    // Method tambahStok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        } else {
            System.out.println("Pesan Penolakan: Jumlah penambahan stok harus positif.");
        }
    }

    // Method kurangStok
    public void kurangStok(int jumlah) {
        if (jumlah > 0) {
            if (this.stok - jumlah >= 0) {
                this.stok -= jumlah;
            } else {
                System.out.println("Pesan Penolakan: Stok tidak mencukupi atau akan menjadi negatif.");
            }
        } else {
            System.out.println("Pesan Penolakan: Jumlah pengurangan stok harus positif.");
        }
    }
}