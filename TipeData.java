package src;

public class TipeData {
    public static void main(String[] args) {
        //Tipe Data Number//
        //Integer Number Bilangan Bulat//
        byte TipeByte = 100; //MIN -128 MAX 127 SIZE 1BYTE DEFAULT 0//
        short TipeShort = 100;
        int TipeInt = 1000000;
        long TipeLong = 1000000;
        long TipeLong2 = 1000000L;

        //Floating Point Number Bilangan Pecahan(Decimal)//
        float TioeFloat = 10.12F; //Default 0.0//
        double TipeDouble =12.2424; //Default 0.0//

        //Literals//
        int decimalInt = 25;
        int hexInt =0xA132B;
        int binInt =0b01010101;

        //Underscore Hanya untuk mempermudah membaca angka//
        int underscore = 1000_000_000;

        //Konversi Tipe Data Number//
        //Widening Casting(Otomatis):byte->short->int->long->float->double
        byte TipeDataByte =10;
        short TipeDataShort =TipeDataByte;
        int TipeDataInt = TipeDataShort;
        long TipeDataLong = TipeDataInt;
        float TipeDataFloat = TipeDataLong;
        double TipeDataDouble = TipeDataFloat;

        //Narowwing Casting(Manual):double->float->long->int->short->byte//
        double TipeDataDouble2 = 10.12345;
        float TipeDataFloat2 = (float) TipeDataDouble2;
        long TipeDataLong2 = (long) TipeDataFloat2;
        int TipeDataInt2 = (int) TipeDataLong2;
        short TipeDataShort2 = (short) TipeDataInt2;
        byte TipeDataByte2 = (byte) TipeDataShort2;
        //Tipe Data Number//

        //Tipe Data Character//
        //Untuk membuat data char di java, pakai tanda petik satu(')//
        char i = 'I';
        char k = 'K';
        char r = 'R';

        System.out.print(i);//Pakai (Print) agar output nya horizontal, outputnya akan (IKR)//
        System.out.print(k);
        System.out.print(r);
        //Tipe Data Character//

        //Tipe Data Boolean//
        //Tipe Data yang memiliki dua nilai (True, False) default value nya (False)//
        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);
        //Tipe Data Boolean//

        //Tipe Data String//
        //Membuat string di java pakai tanda petik dua(")//
        //Default value string adalah (null)//
        String univ = "Universitas Indonesia";
        String kota = "Depok";

        System.out.println(univ);
        System.out.println(kota);

        //Menggabungkan String//
        String namaPertama = "Ikram";
        String namaKedua = "Marbasy";
        String gabung = namaPertama + " " + namaKedua; //Petik Kosong adalah spasi//

        System.out.println(gabung);
        //Tipe Data String//

        //Tipe Data Bukan Primitif//
        //Tipe bawaan di dalam bahasa program, tipe data primitif tidak bisa di ubah lagi//
        //number,char,boolean adalah tipe data primitif, selalu mempunyai default value//
        //String bukan tipe data primitif, tipe data bukan primitif tidak punya default value//
        //Tipe data primitif, Tipe data bukan primitif//
        //(Default value 0)//  //(Default value null)//
        //byte//               //Byte//
        //short//              //Short//
        //int//               //Integer//
        //long//              //Long//
        //float//             //Float//
        //double//            //Double//
        //char//             //Character//
        //boolean//          //Boolean//
        //Contoh Code Tipe Data Bukan Primitif//
        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBoolean = false;
        Short iniShort = 100;

        //Contoh konversi tipe data primitif ke tipe data bukan primitif//
        int age1 = 30;
        Integer age2 = age1;
        int age3 = age2;//Jika ingin kembali ke tipe data primitif//
        //Contoh 2//
        Boolean benar2 = true;
        boolean benar3 = benar2;
        Boolean benar4 = benar3;
        //Contoh 3//
        short umur = 35;
        Short umur2 = umur;
        short umur3 = umur2;
        //Tipe Data Bukan Primitif//
    }
}
