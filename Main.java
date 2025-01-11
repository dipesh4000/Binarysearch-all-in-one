public class Main {
    public static void main(String[] args) {
        int[] infinity = {4,5,6,7,0,1,2};
        int binary = Binary(infinity,0 );
        System.out.println(binary);

    }
    public static int Binary(int[] arr,int target){
        int n = arr.length;
        int s  = 0;
        int e = n - 1;
        int k = 0;
        int[] ans = new int[n];
        while(e>s){
            int m = s + (e-s)/2;
            if(arr[m] > arr[s]){
                s = m+ 1;
            }
            else{
                e = m -1;
            }
            if( e == s){
                k = e;

            }

        }
        for(int i = 0; i < n-k; i++){
            ans[i] = arr[k + i];
        }
        for(int i = 0; i < k ; i++){

            ans[n-k+ i] = arr[i];
        }
        s  = 0;
        e = n - 1;


        while(e>=s){
            int m = s + (e-s)/2;
            if(ans[m] == target){
                return m;
            }
            if(ans[m] > target){
                e = m - 1;
            }
            else{
                s = m + 1;
            }


        }
        return -1;

    }
}