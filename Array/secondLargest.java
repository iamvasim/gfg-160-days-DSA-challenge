 class SecondLargest {
    public int getSecondLargest(int []arr){
        int n = arr.length;
        if(n < 2){
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        else {
            return secondLargest;
        }
    }

    public static void main(String[] args) {
        SecondLargest obj = new SecondLargest();
        int[] arr = {10, 20, 4, 20, 8};
        System.out.println("Second Largest: " + obj.getSecondLargest(arr));
    }
}

