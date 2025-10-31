# Laporan Modul 4   : Pengenalan Object Oriented Programming
**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek  
**Nama:** Agus Dewangga  
**NIM:** 2024573010094  
**Kelas:** TI 2A

---

## 1. Abstrak
Modul ini membahas konsep dasar pemrograman berorientasi objek (*Object Oriented Programming* atau OOP) menggunakan bahasa pemrograman Java. Tujuan utama praktikum ini adalah agar mahasiswa memahami bagaimana konsep OOP diterapkan dalam pembuatan program, mulai dari mendefinisikan *class* dan *object*, hingga penerapan prinsip dasar seperti *encapsulation*, *inheritance*, *polymorphism*, dan *abstraction*.  
Melalui kegiatan praktikum ini, mahasiswa belajar membuat beberapa kelas (Mahasiswa, Matakuliah, dan RencanaKartuStudi), membangun hubungan antar objek, serta melakukan modifikasi untuk menambahkan fitur-fitur lanjutan seperti validasi total SKS dan penghapusan mata kuliah.

Hasil dari praktikum ini diharapkan dapat memberikan pemahaman menyeluruh tentang bagaimana membangun program Java yang terstruktur, modular, dan mudah dikembangkan.

---

## 2. Praktikum

### Praktikum 1 - Pengenalan Class dan Object

#### Dasar Teori
Pemrograman berorientasi objek (OOP) merupakan paradigma pemrograman yang berfokus pada pembuatan dan manipulasi *objek*. Objek merupakan entitas yang memiliki data (disebut atribut) dan perilaku (disebut method). OOP menjadi salah satu pendekatan penting dalam dunia pengembangan perangkat lunak modern karena mampu meningkatkan efisiensi, keteraturan, dan kemudahan pemeliharaan program.

Beberapa konsep dasar dalam OOP yang digunakan pada praktikum ini antara lain:
1. **Class** — Template atau blueprint yang digunakan untuk membuat objek.  
   Contoh: `class Mahasiswa { String nama; String nim; }`
2. **Object** — Instance dari sebuah class.  
   Contoh: `Mahasiswa mhs1 = new Mahasiswa();`
3. **Attribute** — Variabel yang menyimpan data dalam suatu objek.
4. **Method** — Fungsi di dalam class yang mendefinisikan perilaku objek.
5. **Constructor** — Method khusus yang digunakan untuk menginisialisasi objek pada saat dibuat.

**Empat Prinsip Utama OOP:**
- **Encapsulation:** Menyembunyikan detail implementasi agar data tidak dapat diakses langsung dari luar class.
- **Inheritance:** Pewarisan sifat dari class induk (parent) ke class turunan (child).
- **Polymorphism:** Kemampuan objek untuk memiliki banyak bentuk (misalnya, method yang sama dengan implementasi berbeda).
- **Abstraction:** Menyembunyikan kompleksitas sistem dengan menampilkan hal-hal penting saja.

Dengan memahami konsep ini, kita dapat membangun program yang modular dan mudah dikembangkan.

---

#### Langkah Praktikum
1. Buat package baru bernama `modul_4` di dalam folder `src`.
2. Buat class `Mahasiswa.java` berisi kode berikut:
````declarative
package modul_4;

public class mataKuliah {
private String kode;
private String nama;
private int sks;
private Double nilai;

    public mataKuliah(String kode, String nama, int sks){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.nilai = 0.0;
    }

    public String getKode(){
        return nama;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public double getnilai(){
        return  nilai;
    }

    public void setNilai(double nilai){
        if(nilai >= 0.0 && nilai <= 100.0){
            this.nilai = nilai;
        } else{
            System.out.println("nilai harus diantara 0-100");
        }
    }

    public String getNilaiHuruf(){
        if(nilai>=85) return "A";
        else if (nilai>=80) return "A-";
        else if (nilai>=75) return "B+";
        else if (nilai>=70) return "B";
        else if (nilai>=65) return "B-";
        else if (nilai>=60) return "C+";
        else if (nilai>=55) return "C";
        else if (nilai>=50) return "D-";
        else return "E";
    }

    public double getBobotNilai(){
        String huruf = getNilaiHuruf();
        switch (huruf){
            case "A": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B": return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }

    public void tampilkanInfo(){
        System.out.printf("%-10s %-30s %d SKS | Nilai %.2f (%s)\n",kode, nama, sks, nilai, getNilaiHuruf());
    }
}

````
3. Buat class `Matakuliah.java` berisi kode berikut:
````declarative
package modul_4;

public class mataKuliah {
    private String kode;
    private String nama;
    private int sks;
    private Double nilai;

    public mataKuliah(String kode, String nama, int sks){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.nilai = 0.0;
    }

    public String getKode(){
        return nama;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public double getnilai(){
        return  nilai;
    }

    public void setNilai(double nilai){
        if(nilai >= 0.0 && nilai <= 100.0){
            this.nilai = nilai;
        } else{
            System.out.println("nilai harus diantara 0-100");
        }
    }

    public String getNilaiHuruf(){
        if(nilai>=85) return "A";
        else if (nilai>=80) return "A-";
        else if (nilai>=75) return "B+";
        else if (nilai>=70) return "B";
        else if (nilai>=65) return "B-";
        else if (nilai>=60) return "C+";
        else if (nilai>=55) return "C";
        else if (nilai>=50) return "D-";
        else return "E";
    }

    public double getBobotNilai(){
        String huruf = getNilaiHuruf();
        switch (huruf){
            case "A": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B": return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }

    public void tampilkanInfo(){
        System.out.printf("%-10s %-30s %d SKS | Nilai %.2f (%s)\n",kode, nama, sks, nilai, getNilaiHuruf());
    }
}

````
4. Buat class `RencanaKartuStudi.java` berisi kode berikut:
````declarative
package modul_4;

public class kartuRencanaStudi {
    private mahasiswa mahasiswa;
    private mataKuliah[] daftarMatakuliah;
    private int jumlahMatkul;
    private int maxMatkul;

    public kartuRencanaStudi(mahasiswa mahasiswa, int maxMatkul) {
        this.mahasiswa = mahasiswa;
        this.maxMatkul = maxMatkul;
        this.daftarMatakuliah = new mataKuliah[maxMatkul];
        this.jumlahMatkul = 0;
    }

    public boolean tambahMatakuliah(mataKuliah matkul) {
        if (jumlahMatkul < maxMatkul) {
            daftarMatakuliah[jumlahMatkul] = matkul;
            jumlahMatkul++;
            System.out.println("\nNote: Mata kuliah " + matkul.getNama() + " berhasil ditambahkan.");
            return true;
        } else {
            System.out.println("\nNote: KRS sudah penuh! Maksimal " + maxMatkul + " mata kuliah.");
            return false;
        }
    }

    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalSKS += daftarMatakuliah[i].getSks();
        }
        return totalSKS;
    }

    public double hitungIPK() {
        if (jumlahMatkul == 0) return 0.0;

        double totalBobot = 0.0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMatkul; i++) {
            mataKuliah mk = daftarMatakuliah[i];
            totalBobot += mk.getBobotNilai() * mk.getSks();
            totalSKS += mk.getSks();
        }
        return totalSKS > 0 ? totalBobot / totalSKS : 0.0;
    }

    public void tampilkanKRS() {
        System.out.println("==================================================================");
        System.out.println("              KARTU RENCANA STUDI (KRS)                           ");
        System.out.println("==================================================================");
        System.out.println("Nama Mahasiswa : " + mahasiswa.getNama());
        System.out.println("NPM            : " + mahasiswa.getNim());
        System.out.println("Maks. Matkul   : " + maxMatkul + " mata kuliah.");
        System.out.println("------------------------------------------------------------------");
        System.out.println("| KODE | NAMA MATA KULIAH               | SKS  | NILAI |");
        System.out.println("------------------------------------------------------------------");

        if (jumlahMatkul == 0) {
            System.out.println("| Belum ada mata kuliah yang diambil.                            |");
            System.out.println("------------------------------------------------------------------");
        } else {
            for (int i = 0; i < jumlahMatkul; i++) {
                daftarMatakuliah[i].tampilkanInfo();
            }
            System.out.println("------------------------------------------------------------------");
        }
        System.out.printf("Total SKS Semester: %d\n", hitungTotalSKS());
        System.out.printf("IPK Semester: %.2f\n", hitungIPK());
        System.out.println("==================================================================\n");
    }

    public mataKuliah cariMatakuliahByKode(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                return daftarMatakuliah[i];
            }
        }
        return null;
    }
}

````

5. Buat class `Main.java` berisi kode berikut:
````declarative
package modul_4;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------");
        System.out.println("                 SISTEM KARTU RENCANA STUDI (KRS)                 ");
        System.out.println("------------------------------------------------------------------");
        System.out.println("\nInput Data Mahasiswa:");
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();

        mahasiswa mhs = new mahasiswa(nama, nim, jurusan, 0.0);

        kartuRencanaStudi krs = new kartuRencanaStudi(mhs, 10);

        boolean running = true;

        while (running) {
            System.out.println("\n=================================");
            System.out.println("            MENU KRS             ");
            System.out.println("=================================");
            System.out.println("[1]. Tambah Mata Kuliah");
            System.out.println("[2]. Input Nilai Mata Kuliah");
            System.out.println("[3]. Tampilkan KRS");
            System.out.println("[4]. Keluar");
            System.out.println("---------------------------------");
            System.out.print("Pilih menu: ");

            int pilihan;
            try {
                pilihan = input.nextInt();
            } catch (java.util.InputMismatchException e) {
                pilihan = -1;
            }
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- TAMBAH MATA KULIAH ---");
                    System.out.print("Kode Mata Kuliah: ");
                    String kode = input.nextLine();

                    System.out.print("Nama Mata Kuliah: ");
                    String namaMK = input.nextLine();

                    System.out.print("Jumlah SKS: ");
                    int sks;
                    try {
                        sks = input.nextInt();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Input SKS tidak valid. Mata kuliah dibatalkan.");
                        input.nextLine();
                        break;
                    }
                    input.nextLine();

                    mataKuliah mk = new mataKuliah(kode, namaMK, sks);
                    krs.tambahMatakuliah(mk);
                    break;

                case 2:
                    System.out.println("\n--- INPUT NILAI ---");
                    System.out.print("Kode Mata Kuliah: ");
                    String kodeCari = input.nextLine();

                    mataKuliah mkCari = krs.cariMatakuliahByKode(kodeCari);

                    if (mkCari != null) {
                        System.out.print("Input Nilai (0-100): ");
                        double nilaiInput;
                        try {
                            nilaiInput = input.nextDouble();
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Input nilai tidak valid.");
                            input.nextLine();
                            break;
                        }
                        input.nextLine();

                        mkCari.setNilai(nilaiInput);
                        System.out.println("Nilai berhasil diinputkan!");
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan!");
                    }
                    break;

                case 3:
                    krs.tampilkanKRS();
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}
````
6. Jalankan program, kemudian lakukan ujicoba dengan berbagai input.
7. Amati bagaimana object menyimpan data, juga bagaimana method bekerja.
---

#### Hasil
````declarative
------------------------------------
    Sistem kartu rencana Srudi (krs  )
--------------------------------------
nama Mahasiswa :2024573010094
Nim : 2024573010094
Jurusan :TIK
-----------------------------------
|        Menu Krs                   
| 1. Tambah mata kuliah              
| 2. input nilai mata kuliah         
| 3. Tampilkan KRS                 
| 4. Hapus mata kuliah            |
| 5. Tampilkan nilai terbaik/buruk|
| 6. Keluar                       |
-------------------------------------
pilih menu: 1

Tambakan mata kuliah

----------------------
Kode mata Kuliah :01
nama mata kuliah agama
Jumlah SKS: 2

Note: Mata kuliah  agamaberhasil ditambahkan.
-----------------------------------
|        Menu Krs                   
| 1. Tambah mata kuliah              
| 2. input nilai mata kuliah         
| 3. Tampilkan KRS                 
| 4. Hapus mata kuliah            |
| 5. Tampilkan nilai terbaik/buruk|
| 6. Keluar                       |
-------------------------------------
pilih menu: 2

Input Nilai

---------------------
Kode mata Kuliah :
01
Nilai (0-100):87
NIlai berhaisl diinput
-----------------------------------
|        Menu Krs                   
| 1. Tambah mata kuliah              
| 2. input nilai mata kuliah         
| 3. Tampilkan KRS                 
| 4. Hapus mata kuliah            |
| 5. Tampilkan nilai terbaik/buruk|
| 6. Keluar                       |
-------------------------------------
pilih menu: 1

Tambakan mata kuliah

----------------------
Kode mata Kuliah :02
nama mata kuliah pbo
Jumlah SKS: 2

Note: Mata kuliah  pboberhasil ditambahkan.
-----------------------------------
|        Menu Krs                   
| 1. Tambah mata kuliah              
| 2. input nilai mata kuliah         
| 3. Tampilkan KRS                 
| 4. Hapus mata kuliah            |
| 5. Tampilkan nilai terbaik/buruk|
| 6. Keluar                       |
-------------------------------------

pilih menu: 1

Tambakan mata kuliah

----------------------
Kode mata Kuliah :03
nama mata kuliahbahasa inggris
Jumlah SKS: 2

Note: Mata kuliah bahasa inggrisberhasil ditambahkan.
-----------------------------------
|        Menu Krs                   
| 1. Tambah mata kuliah              
| 2. input nilai mata kuliah         
| 3. Tampilkan KRS                 
| 4. Hapus mata kuliah            |
| 5. Tampilkan nilai terbaik/buruk|
| 6. Keluar                       |
-------------------------------------

pilih menu: 2

Input Nilai

---------------------
Kode mata Kuliah :
02
Nilai (0-100):86
NIlai berhaisl diinput
-----------------------------------
|        Menu Krs                   
| 1. Tambah mata kuliah              
| 2. input nilai mata kuliah         
| 3. Tampilkan KRS                 
| 4. Hapus mata kuliah            |
| 5. Tampilkan nilai terbaik/buruk|
| 6. Keluar                       |
-------------------------------------

pilih menu: 2

Input Nilai

---------------------
Kode mata Kuliah : 03
Nilai (0-100):85
NIlai berhaisl diinput
-----------------------------------
|        Menu Krs                   
| 1. Tambah mata kuliah              
| 2. input nilai mata kuliah         
| 3. Tampilkan KRS                 
| 4. Hapus mata kuliah            |
| 5. Tampilkan nilai terbaik/buruk|
| 6. Keluar                       |
-------------------------------------
pilih menu: 3
-----------------------------------
|     Kartu Rencana Studi          |
-----------------------------------
Nama Mahasiswa :2024573010094
NPM            :2024573010094
Jurusan        :TIK
-----------------------------------
Kode     Mata Kuliah       Sks Nilai
01          agama                         2 SKS | Nilai: 87.00 (A)
02          pbo                           2 SKS | Nilai: 86.00 (A)
03         bahasa inggris                 2 SKS | Nilai: 85.00 (A)
--------------------------------------
Total sks      :6
ipk semester   : 4.00
--------------------------------------

-----------------------------------
|        Menu Krs                   
| 1. Tambah mata kuliah              
| 2. input nilai mata kuliah         
| 3. Tampilkan KRS                 
| 4. Hapus mata kuliah            |
| 5. Tampilkan nilai terbaik/buruk|
| 6. Keluar                       |
-------------------------------------
pilih menu: 5
Nilai Terbaik:
01          agama                         2 SKS | Nilai: 87.00 (A)
Nilai Terburuk:
03         bahasa inggris                 2 SKS | Nilai: 85.00 (A)
-----------------------------------
|        Menu Krs                   
| 1. Tambah mata kuliah              
| 2. input nilai mata kuliah         
| 3. Tampilkan KRS                 
| 4. Hapus mata kuliah            |
| 5. Tampilkan nilai terbaik/buruk|
| 6. Keluar                       |
-------------------------------------
pilih menu: 4
Kode matkul yang dihapus: 01
Mata kuliah berhasil dihapus.
-----------------------------------
|        Menu Krs                   
| 1. Tambah mata kuliah              
| 2. input nilai mata kuliah         
| 3. Tampilkan KRS                 
| 4. Hapus mata kuliah            |
| 5. Tampilkan nilai terbaik/buruk|
| 6. Keluar                       |
-------------------------------------
pilih menu: 6

````
---

#### Analisa dan Pembahasan
Dari hasil praktikum, dapat diamati bahwa setiap objek `Mahasiswa` dapat memiliki data unik seperti nama, NIM, dan IPK. Objek `Matakuliah` mewakili setiap mata kuliah dengan kode dan jumlah SKS masing-masing. Melalui `RencanaKartuStudi`, mahasiswa dapat menambah atau menampilkan daftar mata kuliah yang diambil.

Konsep **instansiasi objek** menjadi sangat penting di sini. Setiap kali objek dibuat dengan `new`, memori baru dialokasikan dan constructor dipanggil untuk menginisialisasi nilai atribut.  
Selain itu, penggunaan **method** memudahkan pengelolaan data dan interaksi antar objek tanpa harus mengakses atribut secara langsung, yang merupakan penerapan prinsip **encapsulation**.

---

## 3. Kesimpulan
Dari hasil seluruh kegiatan praktikum, dapat disimpulkan bahwa:
1. Mahasiswa telah memahami konsep dasar *Object Oriented Programming* (OOP) dalam Java, seperti class, object, constructor, method, dan atribut.
2. Prinsip-prinsip utama OOP (Encapsulation, Inheritance, Polymorphism, Abstraction) telah diterapkan dalam bentuk sederhana untuk membangun program yang modular dan mudah dikelola.
3. Dengan penerapan validasi SKS dan fitur penghapusan mata kuliah, mahasiswa dapat memahami bagaimana sebuah sistem dapat dikembangkan secara bertahap dan diperluas dengan mudah.
4. Pendekatan OOP terbukti membuat program lebih terstruktur, fleksibel, dan mudah dikembangkan dibandingkan dengan paradigma prosedural.

---

## 4. Referensi
1. *Lab 04 - Pengenalan Object Oriented Programming* — [https://hackmd.io/@mohdrzu/Syf7Kah3ee](https://hackmd.io/@mohdrzu/Syf7Kah3ee)
2. Oracle Java Documentation — [https://docs.oracle.com/javase/tutorial/java/concepts/](https://docs.oracle.com/javase/tutorial/java/concepts/)