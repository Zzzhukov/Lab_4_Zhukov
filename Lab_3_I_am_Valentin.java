import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Lab_3_I_am_Valentin{
    public static void main(String[] args) {
        Random ray = new Random();
        Scanner in = new Scanner(System.in);
        int[] Array;
        System.out.println("Input length :");
        int length = in.nextInt();
        Array = new int[length];
        int a = ray.nextInt(50);
        for (int i = 0; i < length; i++) {
            Array[i] = ray.nextInt(45) - a;
        }
        System.out.println(Arrays.toString(Array));
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < length; i++){
            max = Math.max(max, Array[i]);
        }
        System.out.println(max);
        newArray(Array, max, length);
    }
    public static void newArray(int[] array, int max, int length){
        int[] NAray;
        NAray = new int[length];
        for (int i = 0; i < length; i++) {
            if(Math.abs(array[i]) > max){
                NAray[i] = 0;
            }
            else{
                NAray[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(NAray));
    }
}

