public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Alexandru Tomus");
        sb.replace(0,9,"Dr.");
        System.out.println(sb);
    }
}
