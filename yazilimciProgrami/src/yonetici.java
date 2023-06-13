public class yonetici  extends calisan{
    private int sorumluKisiSayisi;

    public yonetici(String ad, String soyad, int ID, int sorumluKisiSayisi) {
        super(ad, soyad, ID);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı: " + sorumluKisiSayisi);
    }
    public int zamYap(int zamMiktari){
        System.out.println(getAd() + " Çalışanlarına "+ zamMiktari + " tl zam yaptı");
        return zamMiktari;
    }
}
