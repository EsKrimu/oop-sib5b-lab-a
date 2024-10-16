import java.time.LocalDateTime;

public class ProviderTelecom {
    String name;
    int mobileBalance;
    int mobileData;
    LocalDateTime expiredMobileBalance;
    LocalDateTime expiredMobileData;

    public void getinfo() {
        System.out.println("Ini adalah informasi kartumu");
    }
    public void tambahpulsa(int a){
        mobileBalance = a;
        System.out.println("Pulsa anda sekarang " + a + " Rupiah");
        
    }
    public void mengurangipulsa(int a){
        System.out.println("Pulsa anda terkurang " + a + " Rupiah");
        mobileBalance =mobileBalance - a;
        System.out.println("Sisa pulsa anda " + mobileBalance + " Rupiah");

    }
    public void menambahkuota(int a){
        mobileData = a;
        System.out.println("Kuota anda menambah " + a + " MB");

    }
    public void mengurangikuota(int a){
        System.out.println("Kuota anda berkurang " + a + " MB");
        mobileData = mobileData - a;
        System.out.println("Sisa kuota anda " + mobileData + "");
    }
}
