class AverageArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int sum = 0;
        for (int i : arr) sum += i;
        System.out.println("Average = " + (sum / arr.length));
    }
}
