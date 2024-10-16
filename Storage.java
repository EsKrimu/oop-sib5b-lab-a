public class Storage {
    String key;
    String value;

    public void setItem(String key, String value){
        this.key = key;
        this.value = value;
    }

    public void getItem(String key){
        if (key == this.key){
            System.out.println(this.value);
        }
        else{
            System.out.println(" Tidak benar");
        }

    }
}
