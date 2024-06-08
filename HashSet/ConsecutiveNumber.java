import java.util.HashSet;

public class ConsecutiveNumber {

    public static int check(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int max = 0;
        for(int num:set) {
            if(!set.contains(num-1)) {
                int currNum = num;
                int currStreak = 1;
                while (set.contains(currNum+1)) { 
                    currStreak++;
                    currNum++;
                }
                max = Math.max(currStreak, max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {100,4,200,1,3,2};
        System.out.println(check(arr));
    }
}