
import com.mycompany.bangunruang.Balok;
import com.mycompany.bangunruang.Bangunruang;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iU = new Scanner(System.in);
        
        // membuat objek bangun datar
        Bangunruang bangunDatar = new Bangunruang();
        
        // membuat objek persegi dan mengisi nilai properti
        Balok balok = new Balok();
        balok.sisi = 2;
        
        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        // membuat objek Persegi Panjang dan mengisi nilai properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        // membuat objek Segitiga dan mengisi nilai properti
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;
        
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mSegitiga.luas();
        mSegitiga.keliling();
    }
}