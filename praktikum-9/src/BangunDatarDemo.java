public class BangunDatarDemo {
    public static void main(String[] args) {

        // Perhatikan: tambahkan String nama bangun di dalam kurung
        BangunDatar[] daftarBangun = {
                new Lingkaran("Lingkaran 1", 7),
                new Persegi("Persegi 1", 5),
                new Lingkaran("Lingkaran 2", 10),
                new Persegi("Persegi 2", 8)
        };

        double totalLuas = 0;

        for (BangunDatar bangun : daftarBangun) {
            double luas = bangun.hitungLuas();

            // (Opsional) Kamu bisa memanggil tampilkanInfo() di sini
            // kalau mau lihat nama bangunnya juga
            // bangun.tampilkanInfo();

            System.out.println("Luas: " + luas);
            totalLuas += luas;
        }

        System.out.println("Total Luas: " + totalLuas);
    }
}