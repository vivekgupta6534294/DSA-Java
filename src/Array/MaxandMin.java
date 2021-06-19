//Maximum and Minimum of an Array using minimum number of comparision 
//Here I am using Linear Search
package Array;

public class MaxandMin {
    static class Pair {
        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        int i;
        if (n == 1) {// this means if there is only single element in the array
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        // Below is for the array if the number of element in the array is more than one 
        if(arr[0]>arr[1]){
            minmax.max=arr[0];
            minmax.min=arr[1];
        }
        else{
            minmax.max=arr[1];
            minmax.min=arr[0];
        }
        for(i=2;i<n;i++){
            if(arr[i]>minmax.max){
                minmax.max=arr[i];
            } else if(arr[i]<minmax.min){
                minmax.min=arr[i];
            }
        }
        return minmax;

    }

    public static void main(String[] args) {
        int arr[] = { 500, 33, 332, 5532, 52, 3, 42, 35 };
        int size = arr.length;
        // System.out.println(size);
        Pair minmax = getMinMax(arr, size);
        System.out.printf("\n Minimum element is %d ", minmax.min);
        System.out.printf("\n Maximum element is %d ", minmax.max);
    }

}
