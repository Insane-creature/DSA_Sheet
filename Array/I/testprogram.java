public class testprogram {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9};

        int[] result = addArrays(array1, array2);

        System.out.print("Sum of arrays: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] addArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        // Determine the length of the result array
        int resultLength = Math.max(len1, len2);

        // Create a new array to store the result
        int[] result = new int[resultLength];

        // Iterate through the arrays and add corresponding elements
        for (int i = 0; i < resultLength; i++) {
            if (i < len1) {
                result[i] += arr1[i];
            }
            if (i < len2) {
                result[i] += arr2[i];
            }
        }

        return result;
    }
}
