import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar programına hoşgeldiniz...");
        String islemler = "İşlemler...\n"
                        + "1. Yazılımcı İşlemleri\n"
                        + "2. Yönetici İşlemleri\n"
                        + "x= çıkış";
        System.out.println("****************************");
        System.out.println(islemler);
        System.out.println("****************************");

        while (true){
            System.out.print("Bir işlem seçiniz");
            String islem = scanner.nextLine();

            // Seçilen işlem X e eşitse...
            if (islem.equals("x")){
                System.out.println("Programdan Çıkılıyor...\n");
                break;
            }

            else if (islem.equals("1")) {
                System.out.println("Yazılımcı işlemlerine yönlendiriliyorsunuz...\n");
                yazilimci yazilimci = new yazilimci("Muhammed Emin", "Çetin" , 129322, "Java");

                String yazilimci_Islemleri ="Yazılımcı İşlemleri..."
                                            +"1. Format Atma\n"
                                            +"2. Bilgileri Göster\n"
                                            +"x = Çıkış\n";
                while (true){
                    System.out.println("****************************");
                    System.out.println(yazilimci_Islemleri);
                    System.out.println("****************************");

                    System.out.println("Lütfen yapacağınız işlemi seçiniz: ");
                    String islem_y = scanner.nextLine();

                    if (islem_y.equals("x")){
                        System.out.println("Ana Sayfaya Dönülüyor...");
                        break;
                    }

                    else if (islem_y.equals("1")) {
                        System.out.println("İşletim Sistemi: ");
                        String isletimSistemi= scanner.nextLine();
                        yazilimci.formatAt(isletimSistemi);
                    }

                    else if (islem_y.equals("2")) {
                        yazilimci.bilgileriGoster();
                    }

                    else {
                        System.out.println("Geçersiz işlem girdiniz. Lütfen geçerli işlemlerden birisini seçiniz");
                    }
                }

            }

            else if (islem.equals("2")) {
                System.out.println("Yönetici İşlemlerine Yönlendiriliyorsunuz...");
                yonetici yonetici = new yonetici("Nurgül", "Barka", 322129,2);
                String yonetici_islemleri = "Yönetici İşlemleri\n"
                                            +"1. Zam Yap\n"
                                            +"2. Bilgileri Göster\n"
                                            +"x = Çıkış";
                while (true){
                    System.out.println("*******************");
                    System.out.println(yonetici_islemleri);
                    System.out.println("*******************");

                    System.out.println("Bir İşlem Seçiniz");
                    String y_islem = scanner.nextLine();


                    if (y_islem.equals("x")){
                        System.out.println("Ana sayfaya dönülüyor...");
                        break;
                    }

                    else if (y_islem.equals("1")){
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz: ");
                        int zamMiktari= scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }

                    else if (y_islem.equals("2")){
                        yonetici.bilgileriGoster();
                    }
                }


            }
            else {
                System.out.println("Geçersiz işlem girdiniz. Lütfen geçerli işlemlerden birisini seçiniz");
            }

        }
    }
}