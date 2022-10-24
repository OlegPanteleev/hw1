package hw1;

public class class1 {

    public static void main(String[] args) {

        byte a = 19;
        short b = 123;
        int c = 777;
        long d = 99999L;
        double e = 0.00001;
        float f = 16.97f;
        boolean flag = true;
        char uni = '@';

        float a1 = 12.055f;
        float b1 = 4.1f;
        float c1 = 1.1f;
        float d1 = 12.45f;

        float sum = taskNumberOne(a1, b1, c1, d1);
        System.out.println("Результат: " + sum);
        System.out.printf("%f + %f + %f + %f = %f\n", a1, b1, c1, d1, sum);

        int numBool1 = 10;
        int nunBool2 = 2;
        boolean bool = taskNumberTwo(numBool1, nunBool2);
        System.out.println(bool);

        int myNumber = 7;
        taskNumberThree(myNumber);

        int numBool3 = 3;
        boolean bool2 = taskNumberFour(numBool3);
        System.out.println(bool2);

        String myName = "Олег";
        taskNumberFive(myName);

        int year = 2022;
        taskNumberSix(year);
    }
    /**
     *
     * @param a первое число
     * @param b второе число
     * @param c третье число
     * @param d четвертое число
     * @return результат арифметических действий  чисел
     */
    public static float taskNumberOne (float a, float b, float c, float d){
        float res = a * (b + (c / d));
        return res;
    }
    /**
     *
     * @param a первое число
     * @param b второе число
     * @return результат проверки чисел
     */
    public static boolean taskNumberTwo (int a, int b){
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     *
     * @param a проверяемое число
     */
    public static void taskNumberThree (int a) {
        if (a >= 0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
    /**
     *
     * @param a проверяемое число
     * @return результат проверки
     */
    public static boolean taskNumberFour (int a){
        if (a < 0) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     *
     * @param name строка с именем
     */
    public static void taskNumberFive (String name){
        System.out.println("Привет, " + name + "!");
    }

    /**
     *
     * @param year проверка года
     */
    public static void taskNumberSix (int year){
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Год является високосным");
        }
        else {
            System.out.println("Год не является високосным");
        }
    }
}

