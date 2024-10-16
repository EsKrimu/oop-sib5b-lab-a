public class ProductBasket {
int qtyProduct;

    public void getInfoProductBasket(){
        System.out.println("isi keranjang anda " + "\n= " + qtyProduct);
    }

    public void addProduct(int qty){
        this.qtyProduct = this.qtyProduct + qty;
    }

    public void removeProduct(int qty){
        this.qtyProduct = this.qtyProduct - 1;
        if (this.qtyProduct < 0);
            this.qtyProduct = 0;
    }
}