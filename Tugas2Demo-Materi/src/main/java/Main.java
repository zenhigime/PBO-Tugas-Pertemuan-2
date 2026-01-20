// Mendefinisikan class utama
class Main {

    // Method main sebagai titik awal eksekusi program
    public static void main(String[] args) {

        // Deklarasi dan inisialisasi variabel bertipe integer
        int a = 10; // Variabel a bernilai 10
        int b = 3; // Variabel b bernilai 3

        // Operator penjumlahan
        int hasilTambah = a + b;
        // Menyimpan hasil penjumlahan a dan b ke dalam variabel hasilTambah

        // Operator pengurangan
        int hasilKurang = a - b;
        // Menyimpan hasil pengurangan a dan b

        // Operator perkalian
        int hasilKali = a * b;
        // Menyimpan hasil perkalian a dan b

        // Operator pembagian (hasil dibulatkan karena tipe data int)
        int hasilBagi = a / b;
        // Menyimpan hasil pembagian a dan b (10 / 3 = 3)

        // Operator modulus (sisa pembagian)
        int hasilModulus = a % b;
        // Menyimpan sisa hasil pembagian a dan b (10 % 3 = 1)

        // Menampilkan nilai variabel a
        System.out.println("Nilai a = " + a);

        // Menampilkan nilai variabel b
        System.out.println("Nilai b = " + b);

        // Menampilkan hasil penjumlahan
        System.out.println("Hasil a + b = " + hasilTambah);

        // Menampilkan hasil pengurangan
        System.out.println("Hasil a - b = " + hasilKurang);

        // Menampilkan hasil perkalian
        System.out.println("Hasil a * b = " + hasilKali);

        // Menampilkan hasil pembagian
        System.out.println("Hasil a / b = " + hasilBagi);

        // Menampilkan hasil modulus
        System.out.println("Hasil a % b = " + hasilModulus);
    }
}
