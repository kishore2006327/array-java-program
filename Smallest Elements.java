class SmallestArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 30};
        int min = arr[0];
        for (int i : arr)
            if (i < min) min = i;
        System.out.println("Smallest = " + min);
    }
}
