public class Q2_b {
    
    public static void sort(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                
                if (arr[j]<arr[i]) {
            
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                   
                }
            }
        }
        print(arr,str);
    }
    public static void findIndex(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    
                }
            }
        }
    }
    public static void print(int[] arr,String str) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(str);
    }
    public static void main(String[] args) {
        int[] arr={4,5,3,7,1};
        sort(arr);
    }
}
