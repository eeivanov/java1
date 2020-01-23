package lesson1;

public class HomeWork {
    public static void task2(){
        byte by = 127;
        short sh = 32767;
        int i = 1;
        long l = 200000L;
        float fl = 12.23f;
        double d = -123.123;
        char ch = '3';
        boolean bo = true;
    }

    public int task3(int a, int b, int c, int d) {
        return a * (b + c / d);
    }

    public boolean task4(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public void task5(int number) {
        System.out.println(number >= 0 ? "Positive" : "Negative");
    }

    public boolean task6(int val) {
        return val < 0;
    }

    public void task7(String name) {
        System.out.println("Hello, " + name);
    }

    public boolean isLeapYear(int year) {
        if ((year & 3) != 0){
            return false;
        }
        return (year % 100 != 0) || (year % 400 == 0);
    }

}