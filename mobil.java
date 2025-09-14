public class mobil {
    String merk;
    int kecepatanMaks;

    mobil(String merk, int kecepatanMaks) {
        this.merk = merk;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void nyalakanMesin() {
        System.out.println("Mobil " + merk + " mesin dinyalakan.");
    }

    public void rem() {
        System.out.println("Mobil " + merk + " sedang mengerem.");
    }

    public void cetakInfo() {
        System.out.println("Mobil: " + merk + ", Kecepatan Maks: " + kecepatanMaks + " km/jam");
    }
}
