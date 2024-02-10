package src;

public class ConditionSelection {
    public static void main(String[] args) {

        var nilai = 70;
        var absen =  90;

        //If Statement//
        if( nilai >= 75 && absen >= 75){
            System.out.println("Anda lulus"); //jika true ini akan di jalankan, jika false yang else akan di jalankan//
            // Else Statement//
        }else {
            System.out.println("Anda tiak lulus");
        }

        //Else If Statement//
        var nilai2 = 70;
        var absen2 = 90;

        if (nilai2 >= 80 && absen2 >= 80){
            System.out.println("Nilai anda A");
        } else if (nilai2 >= 70 && absen2 >=70) {
            System.out.println("Nilai anda B");
        } else if (nilai2 >= 60 && absen2 >= 60) {
            System.out.println("Nilai anda C");
        } else if (nilai2 >= 50 && absen2 >= 50) {
            System.out.println("Nilai anda D");
        }else {
            System.out.println("Mungkin anda salah jurusan");
        }

        //Switch Statement//
        //Kondisi di Switch Statement hanya untuk perbandingan ==//
        var nilaiSwitch = "D";

        switch (nilaiSwitch){
            case "A":
                System.out.println("Bjir, Lulus dengan sempurna");
                break;
            case "B":
                System.out.println("Lumayan lah, not bad ygy");
                break;
            case  "C":
                System.out.println("Kurang, tapi bersyukur aja");
                break;
            case  "D":
            case  "E":
                System.out.println("Yang bener aje, Rugi dong!");
                break;
            default:
                System.out.println("Banyak banyak beribadah deh, biar di mudahkan");
        }

        //Switch Lambda//
        //Mempermudah penggunaan switch expression karena tidak perlu pakai kata kunci break//
        var nilai3 = "B";

        switch (nilai3){
            case "A" -> System.out.println("Sempurna");
            case "B", "C" -> System.out.println("Cukup Baik");
            case  "D" -> System.out.println("Kurang");
            default -> {
                System.out.println("Salah jurusan");
            }
        }
        //Kata Kunci Yield//
        //Mmempermudah ketika butuh membuat data berdasarkan kondisi switch statement//
        var nilai4 = "B";
        String ucapan = switch (nilai4){
            case "A":
                yield "Sempurna";
            case "B", "C":
                yield "Cukup";
            case "D":
                yield "Kurang";
            default:
                yield "Hadeh";
        };
        System.out.println(ucapan);

        //Ternary src.Operator//
        //src.Operator sederhana dari if statement//
        //Jika true nilai pertama akan di ambil , jika false nilai kedua akan di ambil//
        var nilai5 = 80;
        //Tanpa Ternary src.Operator//
        String ucapan3;
        if (nilai5 >= 75){
            ucapan3= "Selamat Anda Lulus";
        }else{
            ucapan3= "Anda Tidak Lulus";
        }
        //Dengan Ternary src.Operator//
       String ucapan2 = nilai5>= 75 ? "Selamat anda lulus" : "Anda tidak lulus";
        System.out.println(ucapan2);
    }
}
