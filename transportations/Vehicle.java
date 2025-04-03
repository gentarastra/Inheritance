package Praktikum.Tugas4.src.practic.inheritance.transportations;

public class Vehicle {
    // Atribut protected agar dapat diakses oleh subclass
    protected String name;          // Nama kendaraan (misalnya "Bus TransJakarta")
    protected int capacity;         // Kapasitas maksimum penumpang
    protected String route;         // Rute perjalanan (misalnya "Terminal A - Terminal B")
    protected int currentPassengers;// Jumlah penumpang saat ini

    // Konstruktor dengan parameter lengkap sesuai spesifikasi
    public Vehicle(String name, int capacity, String route) {
        this.name = name;           // Inisialisasi nama kendaraan
        this.capacity = capacity;   // Inisialisasi kapasitas maksimum
        this.route = route;         // Inisialisasi rute perjalanan
        this.currentPassengers = 0; // Inisialisasi jumlah penumpang awal = 0
    }

    // Method untuk menaikkan penumpang dengan validasi kapasitas
    public void boardPassengers(int count) {
        if (currentPassengers + count <= capacity) { // Cek apakah masih ada kapasitas
            currentPassengers += count;              // Tambah jumlah penumpang
            System.out.println(count + " penumpang naik ke dalam " + name);
            System.out.println("Total penumpang: " + currentPassengers);
        } else { // Jika melebihi kapasitas
            System.out.println("Kapasitas penuh! Tidak dapat menaikkan " + count + " penumpang");
            System.out.println("Total penumpang: " + currentPassengers);
        }
    }

    // Method untuk menurunkan penumpang dengan validasi minimum 0
    public void dropPassengers(int count) {
        if (currentPassengers - count >= 0) { // Cek apakah cukup penumpang untuk turun
            currentPassengers -= count;       // Kurangi jumlah penumpang
            System.out.println(count + " penumpang turun dari " + name);
        } else { // Jika jumlah penumpang akan negatif
            System.out.println("Tidak ada cukup penumpang untuk turun");
        }
    }

    // Method untuk memulai perjalanan
    public void startJourney() {
        System.out.println(name + " memulai perjalanan di " + route);
    }

    // Method untuk mengakhiri perjalanan
    public void stopJourney() {
        System.out.println(name + " mencapai tujuan akhir dan berhenti");
    }

    // Getter untuk mendapatkan jumlah penumpang saat ini
    public int getCurrentPassengers() {
        return currentPassengers;
    }

    // Method untuk menghitung tarif (akan di-override oleh subclass)
    public void calculateFare(int distance) {
        // Kosong karena akan diimplementasikan berbeda oleh setiap subclass
    }
}