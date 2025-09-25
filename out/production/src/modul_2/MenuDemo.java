package modul_2;

import java.util.Scanner;

public class MenuDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Menu Pilihan");
        System.out.println("1. Hitung Luas Persegi");
        System.out.println("2. Hitug Luas Lingkaran");
        System.out.println("3. Hitung Luas Segitiga");
        System.out.println("4. Keluar");

        System.out.print("Pilih Menu (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                System.out.print("Masukan Sisi persegi: ");
                double sisi = input.nextDouble();
                double LuasPersegi = sisi * sisi;
                System.out.println("Luas persegi : " + LuasPersegi);
                break;

            case 2:
                System.out.print("Masukan jari-jari Lingkasran: ");
                double jariJari = input.nextDouble();
                double LuasLingkaran = Math.PI * jariJari * jariJari;
                System.out.println("Luas Lingkaran: " + LuasLingkaran);
                break;

            case 3:
                System.out.print("Masukan alas segitiga :");
                double alas = input.nextDouble();
                System.out.print("Masukan Tinggi Segitiga: ");
                double tinggi = input.nextDouble();
                double LuasSegitiga = 0.5 * alas * tinggi;
                System.out.println("luas Segitiga: " + LuasSegitiga);
                break;

            case 4:
                System.out.println("Terima kasih");
                break;

            default:
                System.out.println("pilihan tidak valid!");
        }

        input.close();
    }
}
