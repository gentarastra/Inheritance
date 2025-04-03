package Praktikum.Tugas4.src.practic.inheritance.transportations.mains;
import Praktikum.Tugas4.src.practic.inheritance.transportations.*;

public class Main {
    public static void main(String[] args) {
        // Simulasi 1: Bus (contoh output normal)
        Bus bus = new Bus("Bus TransJakarta", 50, "Terminal A - Terminal B");
        bus.startJourney();         // Mulai perjalanan
        bus.boardPassengers(30);    // Naikkan 30 penumpang
        bus.boardPassengers(20);    // Naikkan 20 penumpang lagi (total 50)
        bus.calculateFare(5);       // Hitung tarif untuk 5 halte
        bus.stopJourney();          // Akhiri perjalanan
        bus.dropPassengers(50);     // Turunkan semua penumpang
        System.out.println();       // Baris kosong untuk pemisah

        // Simulasi 2: Kereta (contoh output normal)
        Train train = new Train("Kereta Commuter Line", 200, "Stasiun Kota - Stasiun Pusat");
        train.startJourney();       // Mulai perjalanan
        train.boardPassengers(150); // Naikkan 150 penumpang
        train.calculateFare(0);     // Hitung tarif (jarak tidak digunakan)
        train.stopJourney();        // Akhiri perjalanan
        train.dropPassengers(150);  // Turunkan semua penumpang
        System.out.println();       // Baris kosong untuk pemisah

        // Simulasi 3: Taksi (contoh output normal)
        Taxi taxi = new Taxi("Taksi BlueBird", 4, "Bandara - Hotel");
        taxi.startJourney();        // Mulai perjalanan
        taxi.boardPassengers(3);    // Naikkan 3 penumpang
        taxi.calculateFare(10);     // Hitung tarif untuk 10 km
        taxi.stopJourney();         // Akhiri perjalanan
        taxi.dropPassengers(3);     // Turunkan semua penumpang
        System.out.println();       // Baris kosong untuk pemisah

        // Simulasi 4: Bus dengan kapasitas penuh dan penumpang tidak cukup
        Bus bus2 = new Bus("Bus TransJakarta", 50, "Terminal A - Terminal B");
        bus2.startJourney();        // Mulai perjalanan
        bus2.boardPassengers(30);   // Naikkan 30 penumpang
        bus2.boardPassengers(100);  // Coba naikkan 100 (melebihi kapasitas)
        bus2.calculateFare(5);      // Hitung tarif untuk 5 halte
        bus2.stopJourney();         // Akhiri perjalanan
        bus2.dropPassengers(30);    // Turunkan 30 penumpang
        bus2.dropPassengers(10);    // Coba turunkan 10 (tidak cukup penumpang)
    }
}