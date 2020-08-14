package add_two_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addTwoNumbers() {
        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        Solution s = new Solution();
        int [] expectedresult = {0, 0, 0, 0, 0, 1};
        ListNode result = s.addTwoNumbers(l1, l2);
        int i = 0;
        while (result != null) {
            assertEquals(expectedresult[i], result.val);
            i++;
            result = result.next;
        }
    }
}