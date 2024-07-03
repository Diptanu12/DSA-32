public class maximumSubarrayBruteFroce {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubArr(arr));
    }



    //brute force
//     static int maxSubArr(int[] arr) {
//        int n=arr.length;
//        int maxSum=0;
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                int sum=0;
//                for(int k=i;k<=j;k++){
//                    sum+=arr[k];
//
//                }
//                maxSum=Math.max(sum, maxSum);
//            }
//        }
//        return maxSum;

    //optimal

    static long maxSubArr(int[] arr) {
      long maxi= Long.MIN_VALUE;
      long sum=-0;
   


      for(int i=0;i<arr.length;i++){
          sum+=arr[i];

          if(sum>maxi){
              maxi=sum;
          }
          if(sum<0){
             sum=0;
          }
    }
      return maxi;
    }
}
