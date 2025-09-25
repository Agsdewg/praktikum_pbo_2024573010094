package modul_2;

public class NestedLoopDemo {
    public static void main(String[] args){
        System.out.println("=== pola bintang sgitiga ===");
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i;  j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //contoh 2: tabel perkalian
        System.out.println("\n=== table perlkalian 1-5 ===");
        for (int i = 1; i <=5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.printf("%3d",(i*j));
            }
            System.out.println();
        }

        //contoh 3: pola angka
        System.out.println("\n===pola angka===");
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
