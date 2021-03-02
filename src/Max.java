public class Max {
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]> max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array = {-1, 3, 5, 7, 4};
        System.out.printf("%d",max(array));
    }

}
