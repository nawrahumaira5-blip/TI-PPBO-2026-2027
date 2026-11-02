public class Mobil extends Kendaraan {
    protected int jumlahPintu;

    public Mobil(String merek, int kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;

        System.out.println("Constructor mobil dijalankan");
    }
    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}