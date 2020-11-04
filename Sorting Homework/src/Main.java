public class Main {
    public static void main(String[] args) {
        int[] firstArray = {14, 18, 21, 30, 3};
        int[] secondArray = {44, 6, 67, 35};

        mergeSort(firstArray);
        mergeSort(secondArray);

        int[] result = new int[firstArray.length+secondArray.length];

        merge(firstArray, secondArray, result);
        for (int t = 0; t < result.length; t++) {
            System.out.println(result[t]);
        }
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int[] left = new int[array.length / 2];
        int[] right = new int[array.length - left.length];

        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, left.length, right, 0, right.length);

        mergeSort(left);
        mergeSort(right);

        merge(left, right, array);
        return array;
    }

    private static void merge(int[] first, int[] second, int[] result)
    {
        //index position of the first array
        int indexFirst = 0;

        //index position of the second array
        int indexSecond = 0;

        //index position of the result array
        int indexMerged = 0;

        while (indexFirst < first.length && indexSecond < second.length)
        {
            if (first[indexFirst] > second[indexSecond])
            {
                result[indexMerged] = first[indexFirst];
                indexFirst++;
            }
            else
            {
                result[indexMerged] = second[indexSecond];
                indexSecond++;
            }
            indexMerged++;
        }
        //copy remaining elements from both half's of the array
        System.arraycopy(first, indexFirst, result, indexMerged, first.length - indexFirst);
        System.arraycopy(second, indexSecond, result, indexMerged, second.length - indexSecond);
    }
}


