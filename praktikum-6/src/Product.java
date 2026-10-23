public class Product {
    // 1. Atribut / Variabel
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    // 2. Constructor
    public Product(String kode, String nama, double harga, int stok) {
        this.kodeProduk = kode;
        this.namaProduk = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // 3. Getter & Setter
    public String getKodeProduk() {
        return kodeProduk;
    }

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    // 4. Method buat nampilin data
    public void tampilkanInfo() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp " + harga);
        System.out.println("Stok        : " + stok);
        System.out.println("---------------------------------------");
    }
}