package modul_2;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //contoh while loop
        System.out.println("\n== While Loop - Tebak angka ==");
        int angkaRahasia = 7;
        int tebakan = 0;

        while (tebakan != angkaRahasia){
            System.out.print("Tebak angka (1-10: ");
            tebakan = input.nextInt();

            if(tebakan < angkaRahasia){
                System.out.println("Terlalu kecil!");
            } else if (tebakan > angkaRahasia) {
                System.out.println("telalu besar!");
            } else {
                System.out.println("benar! Angka rahasianya adalah " + angkaRahasia);
            }
        }

        //contoh do-while loop
        System.out.println("\n=== do-while loop - menu ===");
        int pilihan;

        do {
            System.out.println("\n1. Tampilkan pesan");
            System.out.println("2. Hitung Faktorial");
            System.out.println("3. keluar");
            System.out.print("Pilih menu");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Hello world!");
                    break;
                case 2:
                    System.out.println("Masukan angka: ");
                    int n = input.nextInt();
                    long faktorial = 1;
                    for (int i = 1; i <= n; i++){
                        faktorial *=i;
                    }
                    System.out.println("Faktorial" + n + "=" + faktorial);
                    break;
                case 3:
                    System.out.println("Terimakasih");
                    break;
                default:
                    System.out.println("pilihan tidak valid!");
            }
        }while (pilihan != 3);
        input.close();
    }

}
