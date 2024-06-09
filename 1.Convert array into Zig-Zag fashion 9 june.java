class Solution {
    public static void zigZag(int n, int[] arr) {
        // int curr=1;
        // int flag=0;
        // while(curr!=n){
        //     if(flag==0){
        //         if(arr[curr]>arr[curr-1]){
        //             //swap
        //             int temp=arr[curr];
        //             arr[curr]=arr[curr-1];
        //             arr[curr-1]=temp;
                    
        //             curr++;
        //         }
        //         flag=1;
        //     }
        //     else{
        //         flag=0;
        //          if(arr[curr]<arr[curr-1]){
        //             //swap
        //             int temp=arr[curr];
        //             arr[curr]=arr[curr-1];
        //             arr[curr-1]=temp;
                    
        //             curr++;
        //         }
        //     }
        // }
    
        // Use a flag to alternate between "<" and ">"
        boolean flag = true;  // Start with the condition arr[0] < arr[1]

        for (int i = 0; i < n - 1; i++) {
            if (flag) {
                // "Less than" condition
                if (arr[i] > arr[i + 1]) {
                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                // "Greater than" condition
                if (arr[i] < arr[i + 1]) {
                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            // Flip the flag for the next iteration
            flag = !flag;
        }
    }
}

  

