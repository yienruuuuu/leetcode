//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
// ith customer has in the jth bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

//给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i 位客户在 第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
//客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。


import java.util.Arrays;

public class no1672 {
    public static void main(String[] args) {
        maximumWealth1();
        maximumWealth2();
    }

    public static void maximumWealth1() {
//        执行用时：0 ms, 在所有 Java 提交中击败了 100.00%的用户
//        内存消耗：40.7 MB , 在所有 Java 提交中击败了82.12%的用户
        int[][] accounts = {{1, 2, 3}, {3, 4, 5}};
//        int answerA = 0;
        int answerB = 0;
        int cusNum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int answerA = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                answerA += accounts[i][j];
            }
            if (answerA > answerB) {
                answerB = answerA;
            }
        }
        System.out.println(answerB);
    }
    public static void maximumWealth2() {
        int[][] accounts = {{1, 2, 3}, {3, 4, 5}};

        int maxWealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            maxWealth = Math.max(maxWealth, Arrays.stream(account).sum());
        }
        System.out.println(maxWealth);
    }
    //TODO 學習JAVA8新增的stream API函式庫的用法
}
