package tugaspengganti;

import java.util.Scanner;

public class TugasPengganti {

    static Scanner baca = new Scanner(System.in);

    public static void main(String[] args) {
        subclas hasil = new subclas();
        String nama, umur;
        nama = inputString("Nama");
        umur = inputString("Umur");
        hasil.kelamin();
        hasil.status();
        hasil.from();
    }

    protected static String inputString(String kata) {
        String text;
        System.out.print("Input " + kata + " : ");
        text = baca.next();
        return text;
    }

    protected static int inputAngka(String kata) {
        int angka;
        System.out.print("Input " + kata + " : ");
        angka = baca.nextInt();
        return angka;
    }

}
