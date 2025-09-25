package modul_2;

import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args){
        //membuat objek scanner
        Scanner input = new Scanner(System.in);

        //membuat input string
        System.out.print("Masukan nama Anda: ");
        String nama = input.nextLine();

        //Membaca input integer
        System.out.print("Masukan umur Anda: ");
        int umur = input.nextInt();

        //membaca input double
        System.out.print("Masukan Tinggi Anda (cm) :");
        double tinggi = input.nextDouble();

        System.out.println("\n=== Data Anda ==");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + "tahun");
        System.out.println("Tinggi:" + tinggi + "cm");

        //menutup scanner
        input.close();
    }
}
