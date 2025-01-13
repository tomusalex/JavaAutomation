public class MethodOverloading {
    public static void main (String[] args){
        String result = returnString("Ana are","mere");
        System.out.println(result);
    } //endMain

    public static String returnString(String str1, String str2){
        return str1+" "+ str2;
    }
}
