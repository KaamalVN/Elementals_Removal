import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Elementals_Removal {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int[] array = new int[size];

            for(int i=0;i<size;i++){
                array[i]=scanner.nextInt();
            }
            System.out.println(remover(array,size));
        }

    static int remover(int[] array, int size) {

        int cost=0;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            cost+=array[i]*(i+1);
        }
        return cost;
    }
}
