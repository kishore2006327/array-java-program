class LargestArray {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30};
        int max = arr[0];
        for (int i : arr)
            if (i > max) max = i;
        System.out.println("Largest = " + max);
    }
}
