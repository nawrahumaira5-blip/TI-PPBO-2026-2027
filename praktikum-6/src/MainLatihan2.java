public class MainLatihan2 {
        public static void main(String[] args) {
            // Bikin beberapa objek dengan ukuran berbeda
            Persegi p1 = new Persegi(5);
            Persegi p2 = new Persegi(10);
            Persegi p3 = new Persegi(7.5);

            // Tampilkan hasil perhitungan
            System.out.println("Persegi 1 (sisi 5): Luas = " + p1.hitungLuas() + ", Keliling = " + p1.hitungKeliling());
            System.out.println("Persegi 2 (sisi 10): Luas = " + p2.hitungLuas() + ", Keliling = " + p2.hitungKeliling());
            System.out.println("Persegi 3 (sisi 7.5): Luas = " + p3.hitungLuas() + ", Keliling = " + p3.hitungKeliling());
        }
    }

