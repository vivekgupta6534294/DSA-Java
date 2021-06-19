//Maximum and Minimum of an Array using minimum number of comparision 
// Tournament Method Divide the array into two parts and compare the maximums and minimums of the two parts to get the maximum and the minimum of the whole array.
package Array;

public class MaxandMin1 {
    static class Pair {
        int min;
        int max;
    }
    static Pair getMinMax(int arr[],int low ,int high)  {
        Pair minmax= new Pair();
        Pair mml=new Pair();
        Pair mmr=new Pair();
        int mid;
        if(low==high){
            minmax.max=arr[low];
            minmax.min=arr[low];
            return minmax;
        }
        if(high==low+1){
            if(arr[low]>arr[high]){
                minmax.max=arr[low];
                minmax.min=arr[high];
            } else{
                minmax.max=arr[high];
                minmax.min=arr[low];
            }
            return minmax;
        }
        mid=(low+high)/2;
        mml=getMinMax(arr,low,mid);
        mmr=getMinMax(arr,mid+1,high);
        if(mml.min<mmr.min){
            minmax.min=mml.min;
        }
        else{
            minmax.min=mmr.min;
        }
        if(mml.max>mmr.max){
            minmax.max=mml.max;
        }
        else{
            minmax.max=mmr.max;
        }
        return minmax;
        
    }  
    public static void main(String[] args) {
        int arr[]={100,300,32,342,4242,534,2};
        int size=arr.length;
        Pair minmax=getMinMax(arr,0,size-1);
        System.out.printf("\n Minimum Element is %d ", minmax.min);
        System.out.printf("\n Maximum element is %d ", minmax.max);
    }
}
