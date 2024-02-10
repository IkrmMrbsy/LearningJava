package src;

public class Variable {
    public static void main(String[] args) {
        //src.Variable = tmpat untuk menyimpan data//
        //Bisa seperti ini//
        //Jika seperti ini Default value String nya null dan jika int default value nya 0//
        String name;
        name = "Ikram";

        //Bisa juga secara langsung seperti ini/
        int age = 20;
        String alamat = "Jakarta";

        System.out.println(name);
        System.out.println(age);
        System.out.println(alamat);

        //Jika ingin mengganti value nya//
        //src.Variable name akan berubah dari ikram menjadi marbasy//
        //karena java di running dari atas ke bawah//
        //Dan kita tidak bisa mengganti (Tipe Data nya), hanya bisa value nya saja//
        name = "Marbasy";
        System.out.println(name);

        //Kata Kunci VAR//
        //Harus wajib di isikan value nya//
        var firstName = "Ahcmad";
        var lastName = "Yani";
        var umur = 54;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(umur);

        //Kata kunci Final//
        //Kalau kita ingin membuat variable yang data nya tidak bisa di ubah2 kita bisa pakai kata kunci Final//
        final String nama = "Zehan Husun";
        //atau bisa pakai VAR//
        final  var status = "Menikah";

        //Contoh jika sudah pakai final , dan kita ingi mengubah name//
        //name = "Abdullah" //Dia akan error , karena nama sudah pakai final, artinya value nya tidak bisa di ubah lagi//
        System.out.println(nama);

    }
}
