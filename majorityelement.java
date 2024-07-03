public class majorityelement {
    public static void main(String[] args) {
        int arr[] = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
        int ans = majorlelment(arr);
        System.out.println("The majority element is: " + ans);
    }


//brute force
//     static int majorlelment(int[] arr) {
//        int n=arr.length;
//
//        for(int i=0;i<n;i++){
//            int count=0;
//            for(int j=0;j<n;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//                if(count>n/2){
//                    return arr[i];
//                }
//            }
//        }
//        return -1;

    //optimal
    static int majorlelment(int[] arr) {
        int n = arr.length;
        int ele = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                ele = arr[i];

            } else if (ele == arr[i]) {
                count++;
            } else {
                count--;
            }

        }
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele)
            {
                cnt1++;
            }
        }

        if (cnt1 > (n / 2))
        {
            return ele;
        }
        return -1;
    }
}
