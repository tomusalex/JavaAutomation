public class CountDown {
    public static void main(String[] args) {
//       countDown(10);
        countUpTo(7, 9);
    } // end main

    public static void countDown(int num) {
        if (num >= 0) {
            System.out.println(num);
            countDown(num - 1);
        }
    } // end countDown

    public static void countUpTo(int num1, int num2) {
        if (num1 <= num2) {
            System.out.println(num1);
            countUpTo(num1 + 1, num2);
        }
                         
    }
}
