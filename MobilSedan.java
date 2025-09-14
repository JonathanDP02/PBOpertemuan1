class MobilSedan extends mobil {
    int jumlahPintu;
    String jenisTransmisi;

    MobilSedan(String merk, int kecepatanMaks, int jumlahPintu, String jenisTransmisi) {
        super(merk, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
        this.jenisTransmisi = jenisTransmisi;
    }

    public void bukaBagasi() {
        System.out.println("Bagasi mobil " + merk + " dibuka.");
    }

    public void modeHematBbm() {
        System.out.println("Mobil " + merk + " dalam mode hemat BBM.");
    }

    public void cetakInfo(){
        System.out.println("Mobil Sedan: " + merk + ", Pintu: " + jumlahPintu + ", Transmisi: " + jenisTransmisi + ", Kecepatan Maks: " + kecepatanMaks + " km/jam");
    }
}