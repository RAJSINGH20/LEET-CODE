import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array1 = nums1;
        int[] array2 = nums2;
        int meadian;
        
        int[] mergedArray = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

       Arrays.sort(mergedArray);

        int n = mergedArray.length;
        
        if(n % 2 == 0){
            return (mergedArray[n/2 -1]+mergedArray[n/2]) / 2.0;
        }else{
            return mergedArray[n/2];
        }

    }
}