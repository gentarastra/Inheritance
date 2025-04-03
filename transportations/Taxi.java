package Praktikum.Tugas4.src.practic.inheritance.transportations;

public class Taxi extends Vehicle {
    // Konstanta tarif per kilometer (static final sesuai spesifikasi)
    private static final int FARE_PER_KM = 5000;

    // Konstruktor dengan parameter lengkap
    public Taxi(String name, int capacity, String route) {
        super(name, capacity, route); // Panggil konstruktor parent
    }

    // Override method calculateFare untuk perhitungan tarif taksi
    @Override
    public void calculateFare(int distance) {
        // Tarif = jumlah penumpang * tarif per km * jarak
        int totalFare = currentPassengers * FARE_PER_KM * distance;
        System.out.println("Total jarak rute: " + distance + " km");
        System.out.println("Tarif per km: Rp " + FARE_PER_KM);
        System.out.println("Total tarif perjalanan taksi: Rp " + totalFare);
    }
}
