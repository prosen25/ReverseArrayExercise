import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] reverseArray) {

        System.out.println("Array = " + Arrays.toString(reverseArray));
        for (int i = 0; i < reverseArray.length / 2; i++) {
            int temp = reverseArray[i];
            reverseArray[i] = reverseArray[(reverseArray.length - 1) - i];
            reverseArray[(reverseArray.length - 1) - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(reverseArray));
    }
}
