public class Smartphone {
    String merk;
    int kapasitasBaterai;

    Smartphone(String merk, int kapasitasBaterai) {
        this.merk = merk;
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public void nyalakan(){
        System.out.println(merk + " menyala.");
    }

    public void matikan(){
        System.out.println(merk + " mati.");
    }

    void cetakInfo(){
        System.out.println("Smartphone: " + merk + ", Baterai: " + kapasitasBaterai + " mAh");
    }
}
