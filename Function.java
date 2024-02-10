package src;

public class Function {
    public static void main(String[] args) {
        //src.Function/Method adalah block kode program yang akan berjalan saat kita panggil//
        sayHello();//Memanggil Method sayHello//
        sayHello2("Ikram", 20);//Memanggil method dengan parameter//
        sayHello2("Ahmad", 53);//Memanggil method dengan parameter//
        sayHello2("Zehan", 46);//Memanggil method dengan parameter//
        //Memanggil method return value//
        var a = 100;
        var b = 200;
        var c = hasil(a, b);
        System.out.println(c);
        //Bisa juga lebih simple seperti ini//
        var result1 = hasil(100, 100);
        System.out.println(result1);
        //Return method dengan lebih dari satu return//
        System.out.println(hitung(500, "+", 500));
        System.out.println(hitung(500, "-", 200));
        System.out.println(hitung(500, "test", 200));
        //Return method dengan lebih dari satu return//
        //Memanggil method return value//

        //Method dengan variable argument//
        sayCongrats("Ikram", 90);//Tidak perlu membuat array dulu, bisa langsung masukan ke sini//
        //Method dengan variable argument//

        //Method Overloading//
        overloading1();
        overloading1("Rizal", 20);
        overloading1("Rizal");
        //Method Overloading//

        //Recursive Method//
        System.out.println(factorialRecursive(5));
        //Recursive Method//
    }
    static void sayHello(){
        System.out.println("Hello World");
    }

    //Method Parameter//
    //Membuat parameter sama seperti membuat variable//
    static void sayHello2(String name, int age){//Parameter di tempatkan di dalam kurung dan bisa lebih dari 1//
        System.out.println("My name is " + name + " and i am " + age + " Years Old");
    }
    //Method Parameter//

    //Method Return Value//
    //Secara default Method tidak menghasilkan value apapun//
    //Agar method menghasilkan value, ganti (Void) dengan tipe data yang di hasilkan//
    //dan di dalam block method, untuk menghasilkan nilai tersebut, harus pakai (Return) diikuti dengan data yg sesuai//
    //Di java hanya bisa menghasilkan 1 tipe data di sebuah method//
    static int hasil(int value1, int value2){
        var total = value1 + value2;
        return total;
    }
    //Bisa return lebih dari sekali, contohnya dengan percabangan//
    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
    //Method Return Value//

    //Method Variable Argument//
    static void sayCongrats(String name, int... values){
        int total =0;
        for (var value : values){
            total += value;
        }
        int finalValue = total / values.length;
        if (finalValue>=75){
            System.out.println("Selamat " + name + " Anda lulus");
        }else {
            System.out.println("Mohon maaf " + name + " Anda belum lulus" );
        }
        //Method Variable Argument//
    }
    //Method Overloading//
    //Kemampuan membuat method dengan nama yg sama lebih dari sekali//
    //Tetapi data parameter di method harus berbeda2, entah jumlah atau tipe data parameter nya//
    //Jika ada yg sama akan error//
    static void overloading1(){//Tanpa Parameter//
        System.out.println("Hello");
    }
    static void overloading1(String name , int age){//Dengan dua parameter//
        System.out.println("My name is " + name + " My age " + age);
    }
    static void overloading1(String name){//Dengan satu parameter//
        System.out.println("Welcome Back " + name);
    }
    //Tidak akan error karena parameter nya berbeda beda walaupun nama method nya sama//
    //Method Overloading//

    //Recursive Method//
    //Kemampuan method memanggil method dirinya sendiri//
    //Kasus factorial lebih mudah di selesaikan dengan Recursive Method//
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
    //Recursive Method//
}
