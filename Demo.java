public class Demo {
    public static void main(String[] args) {
        Smartphone hp = new Smartphone("Samsung", 5000);
        Televisi tv = new Televisi("LG", 55);
        MobilSedan sedan = new MobilSedan("Toyota", 220, 4, "Automatic");
        MobilSUV suv = new MobilSUV("Mitsubishi", 200, "4WD", 70);

        hp.nyalakan();
        hp.cetakInfo();
        hp.matikan();

        System.out.println();

        tv.hidupkan();
        tv.gantiChanel(7);
        tv.cetakInfo();

        System.out.println();

        sedan.nyalakanMesin();
        sedan.bukaBagasi();
        sedan.modeHematBbm();
        sedan.cetakInfo();

        System.out.println();

        suv.nyalakanMesin();
        suv.aktifkan4WD();
        suv.isiBahanBakar();
        suv.cetakInfo();

        System.out.println();

    }
}    