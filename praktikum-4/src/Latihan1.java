import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;

        System.out.print("Masukkan angka: ");
        a = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + a * i);
        }
    }
}