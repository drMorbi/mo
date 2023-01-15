package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Picker picker2 = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        businessProcess(picker);
        businessProcess(courier);
        System.out.println(warehouse + "\n" + picker + "\n" + courier);

//        for (int i = 0; i < 5000; i++) {
//            picker.doWork();
//            picker2.doWork();
//        }picker.bonus();
//        picker2.bonus();
//
//        System.out.println(picker2);


        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        picker1.doWork();
        courier1.doWork();
        System.out.println("");
        System.out.println(warehouse + "\n" + picker + "\n" + courier);



    }

    static void businessProcess(Worker worker){
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }worker.bonus();
    }
}
