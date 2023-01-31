package day18;


public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311, 8712, 7, -475, 3};

        System.out.println(recursionSum(numbers, 0));

    }

    public static int recursionSum(int[] num, int i){
        if (i == num.length)
            return 0;
        return num[i] + recursionSum(num, i + 1);
    }
}

