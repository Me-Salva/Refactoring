package pt.up.fe.ldts.example1;

public class OrderLine {
    public Product product;
    public int quantity;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getOrderLineTotal(){
        return product.getPrice()*quantity;
    }
}
