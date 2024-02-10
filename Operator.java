package src;

public class Operator {
    public static void main(String[] args) {
        //Operasi Matematika//
        int a = 20;
        int b = 10;

        System.out.println(a + b); //Penjumlahan//
        System.out.println(a - b); //Pengurangan//
        System.out.println(a * b); //Perkalian//
        System.out.println(a / b); //Pembagian//
        System.out.println(a % b); //Sisa Bagi//

        //Augmentd Assigment//
        int c = 100;

        //c=c+10;// ini jika tidak di persingkat//
        c += 10; //Ini jika di persingkat//
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        //Unary src.Operator//
        int d = 100;
        ++d; //Ini akan nambah 1, jadi 100 + 1 = 101//
        //sama saja seperti (d = d + 1)//
        System.out.println(d);

        --d; //Ini akan berkurang 1, jadi 101 - 1 = 100//
        //sama saja seperti (d = d - 1)//
        System.out.println(d);

        System.out.println(!false); //Ini boolean kebalikanya, jadi jika !false akan output true//

        //Operasi Perbandingan//
        //Untuk membandingkan dua buah data//
        //akan menghasilkan nilai boolean (true, false)//
        int e = 10;
        int e2 = 10;

        System.out.println(e > e2); //Lebih dari//
        System.out.println(e < e2); //Kurang dari//
        System.out.println(e >= e2); //Lebih dari sama dengan//
        System.out.println(e <= e2); //Kurang dari sama dengan//
        System.out.println(e == e2); //Sama dengan//
        System.out.println(e != e2); //Tidak sama dengan//

        //Operasi Boolean//
        //Di peruntukan untuk nilai/tipe data yang bersifat boolean//
        //&& -> akan bernilai true jika nilai 1 dan 2 bernilai true, jika salah satu nya false akan bernilai false//
        //|| -> akan bernilai true jika salah satunya bernilai true, jika dua duanya false akan bernilai false//
        //! -> ini kebalikan, jika nilai 1 false hasilnya akan true dan sebaliknya//
        //contoh//
        var absen = 60;
        var nilai = 87;

        var lulusabsen = absen >= 75;
        var lulusnilai = nilai >= 75;

        var hasil = lulusabsen && lulusnilai; //Akan bernilai true jika variable lulusabsen dan lulus nilai bernilai true//
        System.out.println(hasil);

        //Expression//
        int value; //Expression//
        value = 10; //Expression//

        System.out.println(value = 100); //Statement, tetapi yang di dalam kurung itu expression//
        //jadi yang menghasilkan single value disebut expression//

        //Statement//
        //Bisa di bilang kalimat lengkap dalam bahasa//
        //Biasanya di akhiri titik koma//

        //Assignment statement//
        double avalue = 8933.234;

        //Increment statement//
        avalue++;

        //Method invocation statement//
        System.out.println("Hello World");

        //Object Creation statement//
        //Date date = new date();//
    }
}