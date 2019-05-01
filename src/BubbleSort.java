import java.util.Arrays;

public class BubbleSort {

    static int[] bubbleSortAscending(int a[]){
        for(int j=0;j<4;j++){
            for (int i=0;i<4;i++){
                if(a[i]>a[i+1]){
                    int temp = a[i+1];
                    a[i+1] = a[i];
                    a[i]= temp;
                }
            }
        }
        return a;
    }

    static int[] bubbleSortDescending(int a[]){
        for(int j=4;j>0;j--){
            for (int i=4;i>0;i--){
                if(a[i]>a[i-1]){
                    int temp = a[i-1];
                    a[i-1] = a[i];
                    a[i]= temp;
                }
            }
        }
        return  a;
    }

    public static void main(String[] args) {
        int a[] = {20,10,3,30,15};

        int k[]=bubbleSortAscending(a);
        int l[] = bubbleSortDescending(a);
        System.out.println(Arrays.toString(l));
    }
}
