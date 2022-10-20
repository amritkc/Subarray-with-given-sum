import java.util.ArrayList;

public class SubArray {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {



        //Time Complexity: O(N)
        //Auxiliary Space: O(1). Since no extra space has been taken.
        int currentsum = arr[0];
        int start = 0;
        ArrayList<Integer> arrvalue = new ArrayList();
        for(int i=1; i<=n; i++){
            while(currentsum > s && start < i-1){
                currentsum = currentsum - arr[start];
                start++;
            }
            if(currentsum == s){
                arrvalue.add(start+1);
                arrvalue.add(i);
                break;
            }

            if(i<n){
                currentsum += arr[i];
            }
        }

        if(arrvalue.size() == 0){
            arrvalue.add(-1);
        }

        return arrvalue;


        //Another method

//        Time Complexity: O(N2)
//        Auxiliary Space: O(1). Since no extra space has been taken.
        // int sum =0;
        // int k = 0;
        // ArrayList<Integer> arrval = new ArrayList();
        // for(int i = 0; i<n; i++){
        //     sum += arr[i];
        //     if(sum == s){
        //         arrval.add(k+1);
        //         arrval.add(i+1);
        //         break;
        //     }
        //     if(sum > s){
        //         i = k;
        //         k++;
        //         sum = 0;
        //     }
        // }
        // if(arrval.size() == 0){
        //     arrval.add(-1);
        // }

        // return arrval;
    }


    public static void main(String[] args)
    {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        ArrayList<Integer> arrvalue;
        arrvalue = subarraySum(arr, n, sum);
        for (int i = 0; i < arrvalue.size(); i++)
            // Printing and display the elements in ArrayList
            System.out.print(arrvalue.get(i) + " ");
    }
    }

