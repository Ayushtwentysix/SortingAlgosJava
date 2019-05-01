import java.util.Arrays;

public class SelectionSort {

    static void sort(int a[]) {
        //found length of unsorted array
        int len = a.length;

        //find min element in unsorted array
        for (int i = 0; i < len; i++) {
            int min_idx = i;
            for (int j = min_idx + 1; j < len; j++) {
                    if(a[min_idx]>a[j]) min_idx = j;
            }

            //swap the element
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }

        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int a[] = {23,67,1,90,0,44};

        sort(a);
    }


}
