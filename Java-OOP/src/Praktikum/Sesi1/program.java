package Praktikum.Sesi1;
import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan menu operasi
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("Masukkan pilihan operasi (1/2/3/4): ");
        int pilihan = scanner.nextInt();

        // Input angka pertama dan kedua
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil = 0;

        // Melakukan operasi berdasarkan pilihan
        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil penjumlahan: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil pengurangan: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil perkalian: " + hasil);
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil pembagian: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Pilihan operasi tidak valid.");
                break;
        }

        // Menutup scanner
        scanner.close();
    }
}
