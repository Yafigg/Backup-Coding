import java.util.Scanner;

class classbis {
    public int penumpang;
    public int maxpenumpang;

    public void cetak() {
        System.out.println("Penumpang sekarang Adalah : " + penumpang);
        System.out.println("Maximal Penumpang adalah : " + maxpenumpang);
    }

}

public class coba {
    public Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        classbis busmini = new classbis();
        busmini.penumpang = 5;
        busmini.maxpenumpang = 15;
        busmini.cetak();

        busmini.penumpang = busmini.penumpang = +5;
        busmini.cetak();

        busmini.penumpang = busmini.penumpang = -2;
        busmini.cetak();

        busmini.penumpang = busmini.penumpang = +8;
        busmini.cetak();

    }
}