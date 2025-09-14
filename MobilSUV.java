class MobilSUV extends mobil {
    String sistemPenggerak;
    int kapasitasTangki;

    MobilSUV(String merk, int kecepatanMaks, String sistemPenggerak, int kapasitasTangki) {
        super(merk, kecepatanMaks);
        this.sistemPenggerak = sistemPenggerak;
        this.kapasitasTangki = kapasitasTangki;
    }

    public void aktifkan4WD() {
        System.out.println("Mobil " + merk + " mengaktifkan mode 4WD.");
    }

    public void isiBahanBakar() {
        System.out.println("Mobil " + merk + " sedang mengisi bahan bakar.");
    }

    public void cetakInfo() {
        System.out.println("Mobil SUV: " + merk + ", Sistem: " + sistemPenggerak + ", Tangki: " + kapasitasTangki + " L" + ", Kecepatan Maks: " + kecepatanMaks + " km/jam");
    }
}