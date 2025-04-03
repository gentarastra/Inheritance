package Praktikum.Tugas4.src.practic.inheritance.transportations;

public class Train extends Vehicle {
    // Konstanta tarif tetap per penumpang (static final sesuai spesifikasi)
    private static final int FIXED_FARE = 10000;

    // Konstruktor dengan parameter lengkap
    public Train(String name, int capacity, String route) {
        super(name, capacity, route); // Panggil konstruktor parent
    }

    // Override method calculateFare untuk perhitungan tarif kereta
    @Override
    public void calculateFare(int distance) {
        // Tarif = jumlah penumpang * tarif tetap (tidak tergantung jarak)
        int totalFare = currentPassengers * FIXED_FARE;
        System.out.println("Tarif tetap per penumpang: Rp " + FIXED_FARE);
        System.out.println("Total tarif perjalanan kereta: Rp " + totalFare);
    }
}