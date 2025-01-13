import java.util.Random;

public class MoreArrayFun {
    public static void main(String[] args) {
        int[] array;
        Random random=new Random();
        int randomNumber;
        array = new int[10];
        for (int i =0; i <10 ; i++){
            randomNumber=random.nextInt(10) +1;
            array[i]=randomNumber;
            System.out.print(array[i] +"\t");
        }
    }
}
