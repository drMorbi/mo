package day11.task1;

public class Warehouse {

    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void upPickedOrders(){
        countPickedOrders++;
    }
    public void upDeliveredOrders(){
        countDeliveredOrders++;
    }

    public String toString(){
        return "На складе собрано заказов: " + this.countPickedOrders + "\n" +
                "Доставлено заказов: " + this.countDeliveredOrders;
    }
}
