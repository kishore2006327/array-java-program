class CopyArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = a.clone();
        for (int i : b)
            System.out.print(i + " ");
    }
}
