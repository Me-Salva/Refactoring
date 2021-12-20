package pt.up.fe.ldts.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> lines;

    public Order() {
        lines = new ArrayList<>();
    }

    public void add(Product product, int quantity) {
        lines.add(new OrderLine(product, quantity));
    }

    public double getTotal(){
        double total = 0;

        for (OrderLine line : lines)
            total += line.getOrderLineTotal();

        return total;
    }

    public boolean isElegibleForFreeDelivery() {
        return getTotal() > 100;
    }

    public String printOrder() {
        StringBuilder printBuffer = new StringBuilder();

        for (OrderLine line : lines)
            printBuffer.append(line.product.getName()).append("(x").append(line.quantity).append("): ").append(line.product.getPrice() * line.quantity).append("\n");

        double total = 0;

        for (OrderLine line : lines)
            total += line.product.getPrice() * line.quantity;

        printBuffer.append("Total: ").append(total);

        return printBuffer.toString();
    }
}