public class yazilimci extends calisan {
    private String diller;
    public yazilimci(String ad, String soyad, int ID, String diller) {
        super(ad, soyad, ID);
        this.diller= diller;
    }
    public void formatAt (String isletim_sistemi){
        System.out.println(getAd() + " " + isletim_sistemi + "ni yüklüyor...");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazılımcının bildiği diller: " + diller);
    }
}
