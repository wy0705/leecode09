import java.util.Scanner;

public class minsttree {

    public static void main(String[] args) {
        int[][] s = new int[100][100];
        int i, j;
        int counter = 2, startmin = 1000;
        for (i = 0; i < 100; i++) {
            for (j = 0; j < 100; j++) {
                if (i == j) {
                    s[i][j] = 0;
                } else {
                    s[i][j] = 1000;
                }
            }
        }
        int[] inthis = new int[100];
        int[] tag = new int[100];
        for (i = 0; i < 100; i++) {
            tag[i] = 1;
        }
        Scanner in = new Scanner(System.in);
        System.out.println("请输入点的数目");
        int n = in.nextInt();
        System.out.println("请输入无向边,输入为0 0 0表示结束输入");
        int x = in.nextInt();
        int y = in.nextInt();
        int num = in.nextInt();
        for (; !(x == 0 && y == 0); ) {
            if (num < startmin) {
                startmin = num;
                inthis[1] = x;
                inthis[2] = y;
            }
            s[x][y] = num;
            s[y][x] = num;
            x = in.nextInt();
            y = in.nextInt();
            num = in.nextInt();

        }
        tag[inthis[1]] = 0;
        tag[inthis[2]] = 0;
        System.out.println(inthis[1] + " " + inthis[2] + "  " + startmin);
        int tmp = 1000;
        int p = 0, q = 0;
        while (counter <= n) {
            for (i = 1; i <= counter; i++) {
                for (j = 1; j <= n; j++) {
                    if ((s[inthis[i]][j] < tmp) && tag[j] == 1 && tag[inthis[i]] == 0) {
                        tmp = s[inthis[i]][j];
                        p = inthis[i];
                        q = j;

                    }
                }
            }
            System.out.println(p + " " + q + "  " + tmp);
            counter++;
            tag[q] = 0;
            tmp = 1000;
            inthis[counter] = q;
        }
    }

}
//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

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;


    }
}
class Solution2 {
    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1, tmp;
        while(i < j) {
            while(i < j && (nums[i] & 1) == 1) i++;
            while(i < j && (nums[j] & 1) == 0) j--;
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
