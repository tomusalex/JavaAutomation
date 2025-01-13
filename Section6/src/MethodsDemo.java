public class MethodsDemo {
    public static void main(String[] args) {
        int result;
        double dResult;
        result= addThese(3,6);
        printNumberInteger(result);
        printNumberInteger(12);
        dResult = square(3.12);
        printNumberDouble(dResult);

    } // endMain

    public static int addThese(int a, int b){
        return a+b;
    }
    public static double square(double a){
        return a * a;
    }

    public static void printNumberInteger(int num) {
        System.out.println(num);
    }
    public static void printNumberDouble(double num) {
        System.out.println(num);
    }


}
