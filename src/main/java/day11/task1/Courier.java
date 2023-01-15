package day11.task1;

public class Courier implements Worker {

    private int salary;
    private boolean isPayed;
    private static final int TAX_BONUS = 50000;
    private Warehouse war;

    public Courier(Warehouse war) {
        this.war = war;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString(){
        return "Заработная плата доставщика: " + salary + ", выплаченный бонус: " + TAX_BONUS;
    }

    @Override
    public void doWork() {
        war.upDeliveredOrders();
        salary += 100;
    }

    @Override
    public void bonus() {
        if (isPayed){
            System.out.println("Бонус уже выплачен.");
            return;
        }
        if (war.getCountDeliveredOrders() < 10000){
            System.out.println("Бонус ещё не доступен.");
            return;
        }

            salary += TAX_BONUS;

    }
}
