package src;

public class Loop {
    public static void main(String[] args) {
        //For src.Loop//
        //Blok kode yang di dalam for akan selalu di ulang selama kondisi for terpenuhi//

        //Perulangan dengan Kondisi//
        var counter = 1;
        for (; counter <= 10;){ //Perulangan akan terus berlangsung selama nilai counter kurang dari/sama dengan 10//
            System.out.println("Perulangan ke " + counter);
            counter++; //Nilai countr akan bertambah satu//
            //Jadi akan mencetak perulangan ke 1 seterusnya hingga perulangan ke 10//
        }

        //Perulangan dengan init statement//
        //Pada loop `for` tersebut, inisialisasi variabel (init statement), kondisi, dan perubahan variabel semuanya dilakukan dalam satu baris//
        for(var counter2 = 1; counter2 <= 10;){
            System.out.println("Perulangan init ke " + counter2);
            counter2++;
        }

        //Perulangan dengan post statement//
        for(var counter3 = 1; counter3 <= 10; counter3++){
            System.out.println("Perulangan Post ke " +counter3);
        }

        //While src.Loop//
        //Versi perulangan yang lebih sederhana di banding for src.Loop//
        //Hanya terdapat kondisi perulangan, tanpa ada init statement dan post statement//
        var counter4 = 1;

        while (counter4 <= 10){
            System.out.println("Perulangan While ke " + counter4);
            counter4++;
        }

        //Do while loop//
        //Kalau pakai while loop pengecekan dilakukan di awal, jika pakai do while loop pengecekan di lakukan di akhir//
        //jadi akan mencetak terlebih dahulu sekali walaupun kondisi nya salah//
        var counter5 = 100;

        do {
            //Dalam `do-while`, pesan dicetak minimal sekali meskipun kondisi awal salah karena evaluasi kondisi setelah satu iterasi//
            System.out.println("Perulangan do while ke " + counter5);
            counter5++;
        }while (counter5 <= 10);

        //Break dan Continue//
        //Break digunakan untuk menghentikan seluruh perulangan//
        //Continue digunakan unuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya//

        //Break//
        var counter6 =1;
        while (true){
            System.out.println("Perulangan yang ke " + counter6);
            counter6++;
            if (counter6 > 10){
                break;
            }
        }

        //Continue//
        for (int counter7 = 1; counter7 <= 10; counter7++){
            if (counter7 % 2 == 0){
                continue;
            }
            System.out.println("Perulangan Ganjil " + counter7);
        }

        //For Each//
        //Bisa di gunakan untuk mengakses seluruh data di array secara otomatis//
        String[] names ={
                "Ikram", "Zaki", "Akbar",
                "Raka", "Icha", "Zey"
        };
        for (String name : names){
            System.out.println(name);
        }
        //Tanpa For Each//
        String[] name2 ={
                "Ahmad", "Adnan", "Husnul", "Uswah", "Vivi"
        };
        for (int i = 0; i < name2.length; i++){
            System.out.println(name2[i]);
        }
    }
}
