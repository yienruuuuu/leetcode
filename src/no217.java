import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;

/**
 * FileName:no217
 *
 * @author Eric
 * @date 2023/3/10上午 11:42
 */
public class no217 {
    //Given an integer array nums, return true if any value
    // appears at least twice in the array, and return false if every element is distinct.
//给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
    public static void main(String[] args) {
        containsDuplicate1();
        containsDuplicate2();
    }

    public static void containsDuplicate1() {
        //超時
        int[] nums = {1, 2, 3, 1};
        LinkedList<Integer> countMap = new LinkedList<>();
        for (int pointerX = 0; pointerX < nums.length; pointerX++) {
            if (countMap.contains(nums[pointerX])) {
                System.out.println("true");
            } else {
                countMap.add(nums[pointerX]);
            }
        }
    }

    public static void containsDuplicate2() {
//            执行用时：7 ms, 在所有 Java 提交中击败了88.76%的用户
//            内存消耗：53.6 MB, 在所有 Java 提交中击败了75.31%的用户
        int[] nums = {1, 2, 3, 1};
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                System.out.println("true");
            }
        }
    }
}

