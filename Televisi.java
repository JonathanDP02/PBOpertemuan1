public class Televisi {
    String merk;
    int ukuranLayar;

    Televisi(String merk, int ukuranLayar) {
        this.merk = merk;
        this.ukuranLayar = ukuranLayar;
    }

    public void hidupkan(){
        System.out.println("Televisi " + merk + " menyala.");
    }

    public void gantiChanel(int channel){
        System.out.println("Televisi " + merk + " berganti ke channel " + channel + ".");
    }

    void cetakInfo(){
        System.out.println("Televisi: " + merk + ", Ukuran Layar: " + ukuranLayar + " inci");
    }
}
