/**
 * Order
 */
public class Order {

    enum OrderStatus {
        GO, WAIT;
    }

    private OrderStatus s;

    public void setS(OrderStatus s) {
        this.s = s;
    }

    public OrderStatus getS() {
        return s;
    }

    public boolean check() {
        if (this.getS() == OrderStatus.GO) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Order o = new Order();
        System.out.println(o.getS());
        o.setS(OrderStatus.WAIT);
        System.out.println(o.getS());
        System.out.println(o.check());

    }
}