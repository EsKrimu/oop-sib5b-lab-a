public class Cookies {
    private String key;
    private int value;
    private int dayExpired;

    public void setItem(String key, int value, int dayExpired){
    this.key = key;
    this.value = value;
    this.dayExpired = dayExpired;
    System.out.println("Tambah Cookies " + "\nKey = " + this.key + "\nValue = " + this.value + "\nExpired = " + this.dayExpired );
    }

    public void getItem(String key){
    this.key = key;
    System.out.println("Berhasil mendapatkan = " + this.key );
    }

    public void remove(String key){
        if (key == this.key){
            System.out.println("Key berhasil di hapus");
        }
        else{
            System.out.println("Key tidak ada");
        }     
    }

   public void expired(int dayExpired){
    if(dayExpired != this.dayExpired){
        System.out.println("belum expired");
    }
    else if(this.dayExpired == dayExpired){
        this.key = null;
        this.value = 0;
        System.out.println("Berhasil di hapus " + "\nKey = " + this.key + "\nValue = " + this.value );
    }
    else{
        System.out.println("tidak ditemukan");
    }
   }
    
}