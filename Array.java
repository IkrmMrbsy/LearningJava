package src;

public class Array {
    public static void main(String[] args) {
        //Tipe Data src.Array//
        //Kumpulan data dengan tipe data yang sama//
        //Jumlah data array tidak bisa berubah setelah pertama kali di buat//

        String[] stringArray;//Nama src.Variable nya//
        stringArray = new String[2];//Inisialisasi data array nya//
        //bisa seperti ini juga//
        String[] stringarray2 = new  String[2];

        //Menambah data ke array//
        stringArray[0] = "Ikram";
        stringArray[1] = "Marbasy";

        //Cara memanggil nya//
        System.out.println(stringArray[1]);//Akan mencetak "Marbasy", karena memanggil [1]//
        //Contoh 2//
        int[] intArray = new int[3];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;

        System.out.println(0);//Akan mencetak 10 karena memanggil [0]//

        //src.Array initializer//
        //Langsung memasukan data array nya//
        int[] arrayInt = new int[]{
                10, 20, 30, 40, 50
        };

        //atau bisa langsung seperti ini//
        String[] arrayString ={
                "Ikram", "Zehan", "Ahmad"
        };

        //Operasi Di array//
        //array[index] -> mengambil data array//
        //array[index]= value -> mengubah/Menambah data pada array//
        //array.length -> mengambil panjang array//
        //contoh//
        int[] arrayint3 ={
                30, 40, 90, 80, 20
        };
        arrayint3[2]= 70; //Mengubah 90 menjadi 70//
        System.out.println(arrayint3[1]); //Mengambil data array 40//
        System.out.println(arrayint3.length); //Mengambil panjang array nya jadi ada 5//

        //Kode array di dalam array//
        String[][] members ={
                {"Ikram", "Marbasy"},//Index ke 0//
                {"Achmad", "Yani"}, //Index ke 1//
                {"Zehan", "Husun"}, //Index ke 2//
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[2][1]);

        //For Each//
        //Bisa di gunakan untuk mengakses seluruh data di array secara otomatis//
        String[] name ={
                "Ikram", "Zaki", "Akbar",
                "Raka", "Icha", "Zey"
        };
        for (String names : name){
            System.out.println(names);
        }
    }
}
