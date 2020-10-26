public class Main {
    public static void main(String[] args) {
        int[] leftArray = {8, 10, 15, 23, 24, 27};
        int[] rightArray = {2, 5, 8, 11, 14, 25, 35, 81, 84};
        int[] result = mergeSort(leftArray, rightArray);
        for(int t = 0 ; t < result.length; t++){
            System.out.println(result[t]);
        }
    }
    static int[] mergeSort(int[] left, int[] right){
        int i = 0;
        int j = 0;
        int[] mergedArray = new int[left.length + right.length];
        int r = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mergedArray[r] = left[i];
                i++;
            } else {
                mergedArray[r] = right[j];
                j++;
            }
            r++;
        }
        //For the remaining elements that didnt come in the loop;
        while (i < left.length) {
            mergedArray[r++] = left[i++];
        }

        while (j < right.length) {
            mergedArray[r++] = right[j++];
        }
        return mergedArray;

    }
}

