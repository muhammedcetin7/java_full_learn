public class calisan {
    private String ad;
    private String soyad;
    private int ID;

    public calisan(String ad, String soyad, int ID) {
        this.ad = ad;
        this.soyad = soyad;
        this.ID = ID;
    }

    public void bilgileriGoster(){
        System.out.println("Çalışan Bilgileri....");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("ID: " + ID);
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getID() {
        return ID;
    }
}

