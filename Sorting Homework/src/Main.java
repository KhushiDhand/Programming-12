public class Main {
    public static void main(String[] args) {
        int[] firstArray = {3, 14, 18, 21, 30};
        int[] secondArray = {6,35, 44, 67};
        int[] result = mergeSort(firstArray, secondArray);
        for(int t = 0 ; t < result.length; t++){
            System.out.println(result[t]);
        }
    }
    static int[] mergeSort(int[] first, int[] second){
        int i = 0;
        int j = 0;
        int[] mergedArray = new int[first.length + second.length];
        int r = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mergedArray[r] = first[i];
                i++;
            } else {
                mergedArray[r] = second[j];
                j++;
            }
            r++;
        }
        //For the remaining elements that didnt come in the loop;
        while (i < first.length) {
            mergedArray[r++] = first[i++];
        }

        while (j < second.length) {
            mergedArray[r++] = second[j++];
        }
        return mergedArray;

    }
}

