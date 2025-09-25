package modul_2;

import java.util.Scanner;

public class GradeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai (0-100) :");
        int nilai = input.nextInt();

        char grade;
        String keterangan;

        //menggunakan if-else if-else
        if(nilai >= 85){
            grade = 'A';
            keterangan = "Excellent";
        } else if (nilai >= 75) {
            grade = 'B';
            keterangan = "Good";
        } else if (nilai >= 65) {
            grade = 'C';
            keterangan = "Fair";
        } else if (nilai >= 55) {
            grade = 'D';
            keterangan = "poor";
        } else {
            grade = 'E';
            keterangan = "Fail";
        }

        System.out.println("NIlai : " + nilai);
        System.out.println("Grade : " + grade);
        System.out.println("Keteranagan : " + keterangan);

        input.close();
    }
}
