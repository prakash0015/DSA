import java.util.ArrayList;
import java.util.List;

public class PermutationBacktracking {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] isValid = new boolean[nums.length];
        helper(nums,ds,isValid,ans);
        return ans;
    }
    private static void helper(int[] nums, List<Integer> ds, boolean[] isValid, List<List<Integer>> ans) {
        if(ds.size()==nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++) {
            if(isValid[i]==false) {
                ds.add(nums[i]);
                isValid[i]=true;
                helper(nums, ds, isValid, ans);
                isValid[i] = false;
                ds.remove(ds.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = permute(nums);
        for(List<Integer> l:ans){
            for(int i:l){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
