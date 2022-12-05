import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int x = array[0]; // x=1
        array[0]=5;
        array[array.length-1]=x;
        //System.out.println(Arrays.toString(array));   {5,2,3,4,1}
        System.out.println("Сумма первого и среднего элементов массива = " + (array[0]+array[(array.length-1)/2]));
        }
    }
