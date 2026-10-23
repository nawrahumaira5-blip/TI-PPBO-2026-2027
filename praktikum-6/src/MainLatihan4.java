public class MainLatihan4 {
        public static void main(String[] args) {
            // Bikin array of object Buku minimal 4
            Buku[] daftarBuku = new Buku[4];
            daftarBuku[0] = new Buku("Tuhan Hamba-mu Hancur Perkara Manusia Yang Dia Doakan", " Nawra Humaira", 2018);
            daftarBuku[1] = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
            daftarBuku[2] = new Buku("Selamat Merayakan Cinta Barumu,ya", "Nawra Humaira", 2019);
            daftarBuku[3] = new Buku("I Say Sleep Well Instead of I Love You", "Pramoedya", 2016);

            System.out.println("--- Buku Terbit Setelah 2015 ---");
            // Perulangan buat nyari tahun > 2015
            for (int i = 0; i < daftarBuku.length; i++) {
                if (daftarBuku[i].tahunTerbit > 2015) {
                    System.out.println("- " + daftarBuku[i].judul + " (" + daftarBuku[i].tahunTerbit + ")");
                }
            }
        }
    }

