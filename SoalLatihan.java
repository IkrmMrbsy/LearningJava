package src;

public class SoalLatihan {
    public static void main(String[] args) {
        //SOAL NO 1//
        //menukar nilai variabel a dan b//
        String a = "Camp";
        String b = "Enigma";

        String temp = a;
        a=b;
        b=temp;

        System.out.println(a);
        System.out.println(b);
        //menukar nilai variabel a dan b//

        //SOAL NO 2//
        //1. baris pertama mencetak hasil penjumlahan dari x dan y dalam bentuk integer//
        //2. baris kedua mencetak hasil pengurangan dari x dan y dalam bentuk float//
        //3. baris ketiga mencetak hasil perkalian dari x dan y dalam bentuk integer//
        int x = 12;
        float y = 5.3f;

        System.out.println(x + (int) y);
        System.out.println(x - y);
        System.out.println(x * (int) y);

        //SOAL NO 3//
        //Buatlah variable untuk menyimpan data pemain dalam variabel playerName, level, dan score//
        //Gunakan tipe data yang sesuai untuk menyimpan nama, level, dan score dari setiap pemain//
        String PlayerName = "Ikram";
        int level = 10;
        int score = 5000;

        System.out.println("Pemain " + PlayerName + " Sedang berada di level " + level + " Dengan score " + score);

        //SOAL NO 4//
        //program untuk menghitung luas lingkaran dengan jari-jari dan cetaklah hasil perhitungan tersebut ke console//
        int jariJari = 5;
        double phi = 3.14;
        double luasLingkaran = phi * jariJari * jariJari;

        System.out.println(luasLingkaran);

        //SOAL NO 5//
        //- jam 4-5 akan mencetak “Bangun Pagi”//
        //- jam 6-7 akan mencetak “Mandi dan Sarapan”.//
        //- jam 8-11 akan mencetak “Berangkat Sekolah”.//
        //- jam 12 akan mencetak “Pulang Sekolah”.//
        //- jam 13-15 akan mencetak “Tidur Siang”.//
        //- jam 16-17 akan mencetak “Waktu Main”//
        //- Selain dari itu akan mencetak “Waktu Belajar dan Istirahat”//
        //- Bila user menginput melebihi 24 jam atau lebih kecil sama dengan 0 maka akan mencetak “Hanya ada 24 jam dalam sehari”//
        int jam = 9;
        if (jam >= 4 && jam <= 5){
            System.out.println("Bangun Pagi");
        } else if (jam >= 6 && jam <= 7) {
            System.out.println("Mandi Dan Sarapan");
        } else if (jam >= 8 && jam <= 11) {
            System.out.println("Berangkat Sekolah");
        } else if (jam == 12) {
            System.out.println("Pulang Sekolah");
        } else if (jam >= 13 && jam <= 15) {
            System.out.println("Tidur Siang");
        } else if (jam >= 16 && jam <= 17) {
            System.out.println("Waktu Main");
        } else if (jam > 24 || jam <= 0) {
            System.out.println("Hanya ada 24 jam dalam sehari");
        }else {
            System.out.println("Waktu Belajar Dan Istirahat");
        }

        //SOAL NO 6//
        //Jika angka tahun itu habis dibagi 400, maka tahun itu sudah pasti tahun kabisat.//
        //Jika angka tahun itu tidak habis dibagi 400 tetapi habis dibagi 100, maka tahun itu sudah pasti bukan merupakan tahun kabisat.//
        //Jika angka tahun itu tidak habis dibagi 400, tidak habis dibagi 100 akan tetapi habis dibagi 4, maka tahun itu merupakan tahun kabisat.//
        //Jika angka tahun tidak habis dibagi 400, tidak habis dibagi 100, dan tidak habis dibagi 4, maka tahun tersebut bukan merupakan tahun kabisat.//
        int tahun = 2000;
        if ((tahun % 400 == 0)|| (tahun % 400 != 0) && (tahun % 4 == 0)){
            System.out.println("Tahun Kabisat");
        }else {
            System.out.println("Bukan Tahun Kabisat");
        }

        //SOAL NO 7//
        //mencetak kalimat "I will become a good developer" sebanyak nilai pada variable counter//
        int counter = 3;

        for (int i = counter; i>=1; i--){
            System.out.println(i + " I will become a good developer");
        }
        for (var number = 1; number<=5; number++){
            System.out.println("Nomor ke " + number);
        }
    }
}
