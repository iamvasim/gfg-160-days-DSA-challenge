public class rotateArray {
    static void reverseArray(int arr[], int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }

    static void rotateArray(int [] arr,int d) {
        int n=arr.length;
        d=d%n;



        // rotate left by d ....
        reverseArray(arr,0,d-1); //
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);


    }


    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int d=2;
        rotateArray(arr,d);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}

