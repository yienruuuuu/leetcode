import java.util.Arrays;

/**
 * FileName:no283
 *
 * @author Eric
 * @date 2023/3/9下午 02:08
 */
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.

public class no283 {
    public static void main(String[] args) {
//        moveZeroes();
//        moveZeroes2();
        moveZeroes3();
    }

    public static void moveZeroes() {
//   执行用时：1312 ms,在所有 Java 提交中击败了5.07%的用户
//   内存消耗：43 MB, 在所有 Java 提交中击败了29.88%的用户
        int[] nums = {0, 1, 0, 3, 12, 0};
        System.out.println("moveZeroes arrays=" + Arrays.toString(nums));
        for (int indexNums = 0; indexNums < nums.length; indexNums++) {
            if (nums[indexNums] == 0 && indexNums != nums.length - 1) {
                for (int n = indexNums + 1; n < nums.length; n++) {
                    if (!String.valueOf(nums[n]).equals("0")) {
                        nums[indexNums] = nums[n];
                        nums[n] = 0;
                        break;
                    }
                }
            }
        }
        System.out.println("moveZeroes arrays=" + Arrays.toString(nums));
    }

    public static void moveZeroes2() {
//        执行用时：2 ms, 在所有 Java 提交中击败了32.66 %的用户
//        内存消耗：42.8 MB, 在所有 Java 提交中击败了53.14 %的用户
        int[] nums = {1, 0, 1};
        System.out.println("moveZeroes2 arrays=" + Arrays.toString(nums));
        int movePointerY = 0;
        for (int movePointerX = 1; movePointerX < nums.length; movePointerX++) {
            System.out.println("moveZeroes2 6666 movePointerX=" + movePointerX + "movePointerY=" + movePointerY);
            if (nums[movePointerX] != 0 && nums[movePointerY] == 0) {
                System.out.println("moveZeroes2 movePointerX=" + movePointerX + "movePointerY=" + movePointerY);
                nums[movePointerY] = nums[movePointerX];
                nums[movePointerX] = 0;
                movePointerY++;
            }
            if (nums[movePointerY] != 0) {
                movePointerY++;
            }
        }
        System.out.println("moveZeroes2 arrays=" + Arrays.toString(nums));
    }

    public static void moveZeroes3() {
//        执行用时： 1 ms, 在所有 Java 提交中击败了100.00%的用户
//        内存消耗：42.5 MB, 在所有 Java 提交中击败了93.40%的用户
        int[] nums = {1, 0, 1, 0, 1};
        System.out.println("moveZeroes3 arrays=" + Arrays.toString(nums));
        if (nums == null) {
            return;
        }
        //两个指针i和j
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
        System.out.println("moveZeroes3 arrays=" + Arrays.toString(nums));
    }
}
