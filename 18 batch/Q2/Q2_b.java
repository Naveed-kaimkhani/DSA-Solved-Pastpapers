public class Q2_b {
    
    public static void main(String[] args) {
        int[] arr = {4,5,3,7,1};
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            for (int j = 0; j < arr.length; j++)
                if(arr[i] == arr2[j]){
                    System.out.print(j + " ");
                    break;
                }
        }
        System.out.println("");
        System.out.println(Arrays.toString(arr));
    }
}
