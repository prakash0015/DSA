package DSA.HashSet;
import java.util.HashSet;

public class MaxNumberOnTables {
    public static int check(int arr[]) {
        int max = 0;
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            int num = arr[i];
            if(st.contains(num)) {
                st.remove(num);
            }else {
                st.add(num);
                max = Math.max(max, st.size());
            }
           
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,1,3,2,3};
        System.out.println(check(arr));
    }
}
