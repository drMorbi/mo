package day18;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(count7(776128977));

    }

    public static int count7(int number){
        int digit = 7;
        if(number < 10) {
            if (number == digit){
                return 1;
            }else {
                return 0;
            }
        } else {
            if(number%10 == digit) {
                return 1 + count7(number/10);
            } else {
                return count7(number/10);
            }
        }
    }

/*
    Как вариант такая форма записи. Правильно понимаю, что оператор '?' аналогичен if-else?
    public static int count7(int number){
        int digit = 7;
        if(number < 10) {
             return number == digit ? 1 : 0;
        } else {
            return number%10 == digit ? 1 + count7(number/10) : count7(number/10);
        }
    }
*/

}
