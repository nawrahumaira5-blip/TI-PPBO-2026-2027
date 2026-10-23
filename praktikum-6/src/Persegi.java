public class Persegi {
        double sisi;

        // Constructor berparameter
        public Persegi(double sisi) {
            this.sisi = sisi;
        }

        // Instance method hitung luas
        public double hitungLuas() {
            return sisi * sisi;
        }

        // Instance method hitung keliling
        public double hitungKeliling() {
            return 4 * sisi;
        }
    }

