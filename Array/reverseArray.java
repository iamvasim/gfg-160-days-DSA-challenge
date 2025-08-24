public class reverseArray {
    static void reverse(int [] arr ){
        int n=arr.length;
        int j=n-1;
        int i=0;

        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }




    }
    public static void main(String[] args) {
        int [] arr={1,3,4,5,6};
      reverse(arr);
      for (int i=0;i<arr.length;i++){
          System.out.print(arr[i] +" ");
      }
    }
}
