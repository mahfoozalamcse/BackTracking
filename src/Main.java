//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void changeArr(int arr[], int i, int val){
        // base case
        if(i == arr.length){
            printArr(arr);
            return;
        }
        // kam
        arr[i] = val;
        changeArr(arr, i+1, val+1); // fn call
        arr[i] = arr[i] - 2; // back track
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // print subset
    public static void findSubset(String str, String ans, int i){
        // base case
        if(i == str.length()){
            if(ans.length()==0) {
                System.out.println("null");
            }else {
                System.out.println(ans+"");
            }
            return;
        }
        // kam choice
          // yes
        findSubset(str, ans+str.charAt(i), i+1);
          // NO
        findSubset(str, ans, i+1);

    }
    //  find permutation
    public static void printPermutation(String str, String ans){
        // base case
        if(str.length() == 0){
            System.out.println(ans + " ");
            return;
        }
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, curr+ans);

        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, "");
 //       String str = "abc";
//        findSubset(str, "", 0);
//     int arr[] = new int[5];
//     changeArr(arr, 0, 1);
//     printArr(arr);
    }
}