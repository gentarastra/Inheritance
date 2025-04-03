package Praktikum.Tugas4.src.practic.inheritance.transportations;

public class Bus extends Vehicle {
    // Konstanta tarif per halte (static final sesuai spesifikasi)
    private static final int FARE_PER_STOP = 2000;

    // Konstruktor dengan parameter lengkap
    public Bus(String name, int capacity, String route) {
        super(name, capacity, route); // Panggil konstruktor parent
    }

    // Override method calculateFare untuk perhitungan tarif bus
    @Override
    public void calculateFare(int stops) {
        // Tarif = jumlah penumpang * tarif per halte * jumlah halte
        int totalFare = currentPassengers * FARE_PER_STOP * stops;
        System.out.println("Total pemberhentian: " + stops);
        System.out.println("Tarif per halte: Rp " + FARE_PER_STOP);
        System.out.println("Total tarif perjalanan bus: Rp " + totalFare);
    }
}